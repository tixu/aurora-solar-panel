// @SOURCE:/home/security/workspace/PLAY-STATUS/status/conf/routes
// @HASH:fcd6bfa33c8f455a966fddc13cd589bc2fb12aaa
// @DATE:Wed Mar 21 21:31:02 CET 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:6
class ReverseApplication {
    


 
// @LINE:6
def index() = {
   Call("GET", "/")
}
                                                        

                      
    
}
                            

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:8
// @LINE:7
class ReverseMeasures {
    


 
// @LINE:11
def display() = {
   Call("GET", "/measures/display")
}
                                                        
 
// @LINE:8
def list() = {
   Call("GET", "/measures/list")
}
                                                        
 
// @LINE:7
def index() = {
   Call("GET", "/measures")
}
                                                        
 
// @LINE:12
def sumMonth(year:Int) = {
   Call("GET", "/measures/year/" + implicitly[PathBindable[Int]].unbind("year", year))
}
                                                        
 
// @LINE:13
def displayMonth(month:Int, year:Int) = {
   Call("GET", "/measures/year/" + implicitly[PathBindable[Int]].unbind("year", year) + "/month/" + implicitly[PathBindable[Int]].unbind("month", month))
}
                                                        

                      
    
}
                            

// @LINE:15
class ReverseAssets {
    


 
// @LINE:15
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            
}
                    


// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:6
class ReverseApplication {
    


 
// @LINE:6
def index = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"/"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:8
// @LINE:7
class ReverseMeasures {
    


 
// @LINE:11
def display = JavascriptReverseRoute(
   "controllers.Measures.display",
   """
      function() {
      return _wA({method:"GET", url:"/measures/display"})
      }
   """
)
                                                        
 
// @LINE:8
def list = JavascriptReverseRoute(
   "controllers.Measures.list",
   """
      function() {
      return _wA({method:"GET", url:"/measures/list"})
      }
   """
)
                                                        
 
// @LINE:7
def index = JavascriptReverseRoute(
   "controllers.Measures.index",
   """
      function() {
      return _wA({method:"GET", url:"/measures"})
      }
   """
)
                                                        
 
// @LINE:12
def sumMonth = JavascriptReverseRoute(
   "controllers.Measures.sumMonth",
   """
      function(year) {
      return _wA({method:"GET", url:"/measures/year/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("year", year)})
      }
   """
)
                                                        
 
// @LINE:13
def displayMonth = JavascriptReverseRoute(
   "controllers.Measures.displayMonth",
   """
      function(month,year) {
      return _wA({method:"GET", url:"/measures/year/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("year", year) + "/month/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("month", month)})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:15
class ReverseAssets {
    


 
// @LINE:15
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {

// @LINE:6
class ReverseApplication {
    


 
// @LINE:6
def index() = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq())
)
                              

                      
    
}
                            

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:8
// @LINE:7
class ReverseMeasures {
    


 
// @LINE:11
def display() = new play.api.mvc.HandlerRef(
   controllers.Measures.display(), HandlerDef(this, "controllers.Measures", "display", Seq())
)
                              
 
// @LINE:8
def list() = new play.api.mvc.HandlerRef(
   controllers.Measures.list(), HandlerDef(this, "controllers.Measures", "list", Seq())
)
                              
 
// @LINE:7
def index() = new play.api.mvc.HandlerRef(
   controllers.Measures.index(), HandlerDef(this, "controllers.Measures", "index", Seq())
)
                              
 
// @LINE:12
def sumMonth(year:Int) = new play.api.mvc.HandlerRef(
   controllers.Measures.sumMonth(year), HandlerDef(this, "controllers.Measures", "sumMonth", Seq(classOf[Int]))
)
                              
 
// @LINE:13
def displayMonth(month:Int, year:Int) = new play.api.mvc.HandlerRef(
   controllers.Measures.displayMonth(month, year), HandlerDef(this, "controllers.Measures", "displayMonth", Seq(classOf[Int], classOf[Int]))
)
                              

                      
    
}
                            

// @LINE:15
class ReverseAssets {
    


 
// @LINE:15
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            
}
                    
                