// @SOURCE:/home/security/workspace/PLAY-STATUS/status/conf/routes
// @HASH:fcd6bfa33c8f455a966fddc13cd589bc2fb12aaa
// @DATE:Wed Mar 21 21:31:02 CET 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {


// @LINE:6
val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:7
val controllers_Measures_index1 = Route("GET", PathPattern(List(StaticPart("/measures"))))
                    

// @LINE:8
val controllers_Measures_list2 = Route("GET", PathPattern(List(StaticPart("/measures/list"))))
                    

// @LINE:11
val controllers_Measures_display3 = Route("GET", PathPattern(List(StaticPart("/measures/display"))))
                    

// @LINE:12
val controllers_Measures_sumMonth4 = Route("GET", PathPattern(List(StaticPart("/measures/year/"),DynamicPart("year", """[^/]+"""))))
                    

// @LINE:13
val controllers_Measures_displayMonth5 = Route("GET", PathPattern(List(StaticPart("/measures/year/"),DynamicPart("year", """[^/]+"""),StaticPart("/month/"),DynamicPart("month", """[^/]+"""))))
                    

// @LINE:15
val controllers_Assets_at6 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    
def documentation = List(("""GET""","""/""","""controllers.Application.index"""),("""GET""","""/measures""","""controllers.Measures.index"""),("""GET""","""/measures/list""","""controllers.Measures.list"""),("""GET""","""/measures/display""","""controllers.Measures.display"""),("""GET""","""/measures/year/$year<[^/]+>""","""controllers.Measures.sumMonth(year:Int)"""),("""GET""","""/measures/year/$year<[^/]+>/month/$month<[^/]+>""","""controllers.Measures.displayMonth(month:Int, year:Int)"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.index, HandlerDef(this, "controllers.Application", "index", Nil))
   }
}
                    

// @LINE:7
case controllers_Measures_index1(params) => {
   call { 
        invokeHandler(_root_.controllers.Measures.index, HandlerDef(this, "controllers.Measures", "index", Nil))
   }
}
                    

// @LINE:8
case controllers_Measures_list2(params) => {
   call { 
        invokeHandler(_root_.controllers.Measures.list, HandlerDef(this, "controllers.Measures", "list", Nil))
   }
}
                    

// @LINE:11
case controllers_Measures_display3(params) => {
   call { 
        invokeHandler(_root_.controllers.Measures.display, HandlerDef(this, "controllers.Measures", "display", Nil))
   }
}
                    

// @LINE:12
case controllers_Measures_sumMonth4(params) => {
   call(params.fromPath[Int]("year", None)) { (year) =>
        invokeHandler(_root_.controllers.Measures.sumMonth(year), HandlerDef(this, "controllers.Measures", "sumMonth", Seq(classOf[Int])))
   }
}
                    

// @LINE:13
case controllers_Measures_displayMonth5(params) => {
   call(params.fromPath[Int]("month", None), params.fromPath[Int]("year", None)) { (month, year) =>
        invokeHandler(_root_.controllers.Measures.displayMonth(month, year), HandlerDef(this, "controllers.Measures", "displayMonth", Seq(classOf[Int], classOf[Int])))
   }
}
                    

// @LINE:15
case controllers_Assets_at6(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    
}
    
}
                