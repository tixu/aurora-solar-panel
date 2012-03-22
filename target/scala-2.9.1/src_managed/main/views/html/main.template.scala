
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
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.Html = {
        _display_ {

Seq(format.raw/*1.32*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(Seq(/*7.17*/title)),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq(/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css"))),format.raw/*8.94*/("""">
        
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq(/*10.59*/routes/*10.65*/.Assets.at("images/favicon.png"))),format.raw/*10.97*/("""">
        <script src=""""),_display_(Seq(/*11.23*/routes/*11.29*/.Assets.at("javascripts/jquery-1.7.1.min.js"))),format.raw/*11.74*/("""" type="text/javascript"></script>
		<script src="type="text/javascript" href=""""),_display_(Seq(/*12.46*/routes/*12.52*/.Assets.at("javascripts/highcharts.js"))),format.raw/*12.91*/("""></script>
		<script src="type="text/javascript" href=""""),_display_(Seq(/*13.46*/routes/*13.52*/.Assets.at("javascripts/maingraph.js"))),format.raw/*13.90*/("""></script>
    </head>
    <body>
        """),_display_(Seq(/*16.10*/content)),format.raw/*16.17*/("""
    </body>
</html>
"""))}
    }
    
    def render(title:String,content:Html) = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.Html) = (title) => (content) => apply(title)(content)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Mar 16 06:06:48 CET 2012
                    SOURCE: /home/security/workspace/PLAY-STATUS/status/app/views/main.scala.html
                    HASH: b8afc038ba4c9d78b4ac40e903b14f877d8ceaaa
                    MATRIX: 509->1|611->31|694->84|720->89|812->151|826->157|881->191|982->261|997->267|1051->299|1107->324|1122->330|1189->375|1300->455|1315->461|1376->500|1463->556|1478->562|1538->600|1612->643|1641->650
                    LINES: 19->1|22->1|28->7|28->7|29->8|29->8|29->8|31->10|31->10|31->10|32->11|32->11|32->11|33->12|33->12|33->12|34->13|34->13|34->13|37->16|37->16
                    -- GENERATED --
                */
            