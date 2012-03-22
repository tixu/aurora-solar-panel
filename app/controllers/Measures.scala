package controllers

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._

import java.util.{Date}
import com.codahale.jerkson.Json

import anorm._

import models._
import views._



object Measures extends Controller{

	def index = Action {
    Ok(views.html.index("measure is kljlkl"))
  }

	def list = Action {
	    val measures = models.Measure.findAll()
	    print(measures)
	    val json = Json.generate(measures);
	    Ok(json).as("application/json")
	} 

    def display = Action {
	   val measures = models.Measure.findAll()
	   print(measures)
       Ok(views.html.measures.index(measures));	 	

	}
	
	def  displayMonth(month :Int, year:Int)=Action{
	  val measures = models.Measure.findMonth(month,year)
	  print(measures)
	  Ok(views.html.measures.index(measures));
	
	}
	
	def sumMonth(year :Int) = Action {
	   val measures = models.Measure.sumMonth(year)
	   print(measures)
       Ok(views.html.measures.aggregates(measures));	 	

	}

} 
