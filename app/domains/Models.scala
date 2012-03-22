package models

import java.util.{Date}

import play.api.db._
import play.api.Play.current

import anorm._
import anorm.SqlParser._


  
case class Measure(taken : Date, produced: Double,unity: String)
case class Aggregate(taken:Int,produced: Double,unity:String)

object Measure {

  /**
   * Parse a Computer from a ResultSet
   */
  val simple = {
    get[Date]("measure.taken") ~
    get[Double]("measure.produced") ~
    get[String]("measure.unity")  map {
      case taken~produced~unity => Measure(
        taken,produced,unity
      )
    }
  }

    val simpleaggregate = {
    get[Int]("taken") ~
    get[Double]("produced") ~
    get[String]("unity")  map {
      case taken~produced~unity => Aggregate(
        taken,produced,unity
      )
    }
  }

   def findById(id: Long): Option[Measure] = {
		 DB.withConnection { implicit connection =>
         SQL("select * from measure where id = {id}").on('id -> id).as(Measure.simple.singleOpt)
        }
	}
	
	
	def findMonth(month :Int, year :Int):Seq[Measure] ={
	         DB.withConnection { implicit connection =>
                        SQL("select taken, produced,unity from measure where MONTH(taken)={month} and YEAR(taken)={year}").
                        on('month-> month,'year->year).as(Measure.simple *)
	
	   }
	}

    def findAll(): Seq[Measure] = {
             DB.withConnection { implicit connection =>
                        SQL("select * from measure").as(Measure.simple *)
        }
    }
    def sumMonth(year:Int) :Seq[Aggregate]  = {
           DB.withConnection { implicit connection =>
                        SQL("SELECT MONTH(taken) as taken,SUM (produced) as produced , UNITY as unity   FROM measure m WHERE YEAR(taken)={year} GROUP BY MONTH(taken)").on('year -> year).as(Measure.simpleaggregate *)
    }
  }

}
