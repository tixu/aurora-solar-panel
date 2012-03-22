
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: String):play.api.templates.Html = {
        _display_ {

Seq(format.raw/*1.17*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(Seq(/*7.17*/title)),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq(/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css"))),format.raw/*8.94*/("""">
        
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq(/*10.59*/routes/*10.65*/.Assets.at("images/favicon.png"))),format.raw/*10.97*/("""">
        <script src=""""),_display_(Seq(/*11.23*/routes/*11.29*/.Assets.at("javascripts/jquery-1.7.1.min.js"))),format.raw/*11.74*/("""" type="text/javascript"></script>
		<script type="text/javascript" src=""""),_display_(Seq(/*12.40*/routes/*12.46*/.Assets.at("javascripts/highcharts.js"))),format.raw/*12.85*/(""""></script>
		<script type="text/javascript" src=""""),_display_(Seq(/*13.40*/routes/*13.46*/.Assets.at("javascripts/maingraph.js"))),format.raw/*13.84*/(""""></script>
    </head>
    <body>
       <h1>Statistic</h1>
    
    <h1 id="clock"></h1>
    
    <div id="container" style="width: 100%; height: 400px"></div>
     
    </body>
</html>

    
    

"""))}
    }
    
    def render(title:String) = apply(title)
    
    def f:((String) => play.api.templates.Html) = (title) => apply(title)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Mar 16 06:17:11 CET 2012
                    SOURCE: /home/security/workspace/PLAY-STATUS/status/app/views/index.scala.html
                    HASH: 43702cf163448b9fa8412024068880da4daa46e2
                    MATRIX: 505->1|592->16|675->69|701->74|793->136|807->142|862->176|963->246|978->252|1032->284|1088->309|1103->315|1170->360|1275->434|1290->440|1351->479|1433->530|1448->536|1508->574
                    LINES: 19->1|22->1|28->7|28->7|29->8|29->8|29->8|31->10|31->10|31->10|32->11|32->11|32->11|33->12|33->12|33->12|34->13|34->13|34->13
                    -- GENERATED --
                */
            