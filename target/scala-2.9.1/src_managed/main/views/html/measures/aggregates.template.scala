
package views.html.measures

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
object aggregates extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Seq[Aggregate],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(measures: Seq[Aggregate]):play.api.templates.Html = {
        _display_ {

Seq(format.raw/*1.28*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>Statistics</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq(/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css"))),format.raw/*8.94*/("""">
        
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq(/*10.59*/routes/*10.65*/.Assets.at("images/favicon.png"))),format.raw/*10.97*/("""">
        <script src=""""),_display_(Seq(/*11.23*/routes/*11.29*/.Assets.at("javascripts/jquery-1.7.1.min.js"))),format.raw/*11.74*/("""" type="text/javascript"></script>
		<script type="text/javascript" src=""""),_display_(Seq(/*12.40*/routes/*12.46*/.Assets.at("javascripts/highcharts.js"))),format.raw/*12.85*/(""""></script>
	
	<script type="text/javascript"> $(function () """),format.raw("""{"""),format.raw/*14.49*/(""" var chart;
    $(document).ready(function() """),format.raw("""{"""),format.raw/*15.35*/("""
        chart = new Highcharts.Chart("""),format.raw("""{"""),format.raw/*16.39*/("""
            chart: """),format.raw("""{"""),format.raw/*17.21*/("""
                renderTo: 'container',
                type: 'column',
                marginRight: 130,
                marginBottom: 25
            """),format.raw("""}"""),format.raw/*22.14*/(""",
            title: """),format.raw("""{"""),format.raw/*23.21*/("""
                text: 'Production',
                x: -20 //center
            """),format.raw("""}"""),format.raw/*26.14*/(""",
            subtitle: """),format.raw("""{"""),format.raw/*27.24*/("""
                text: 'Source: aurora 1',
                x: -20
            """),format.raw("""}"""),format.raw/*30.14*/(""",
            xAxis: """),format.raw("""{"""),format.raw/*31.21*/("""
             categories :[
		                """),_display_(Seq(/*33.20*/measures/*33.28*/.map/*33.32*/ { measure =>_display_(Seq(format.raw/*33.45*/(""" '"""),_display_(Seq(/*33.48*/{measure.taken})),format.raw/*33.63*/("""',""")))})),format.raw/*33.66*/("""
		               ]                   
            """),format.raw("""}"""),format.raw/*35.14*/(""",
            yAxis: """),format.raw("""{"""),format.raw/*36.21*/("""
                title: """),format.raw("""{"""),format.raw/*37.25*/("""
                    text: 'KWH'
                """),format.raw("""}"""),format.raw/*39.18*/(""",
                plotLines: ["""),format.raw("""{"""),format.raw/*40.30*/("""
                    value: 0,
                    width: 1,
                    color: '#808080'
                """),format.raw("""}"""),format.raw/*44.18*/("""]
            """),format.raw("""}"""),format.raw/*45.14*/(""",
            tooltip: """),format.raw("""{"""),format.raw/*46.23*/("""
                formatter: function() """),format.raw("""{"""),format.raw/*47.40*/("""
                        return '<b>'+ this.series.name +'</b><br/>'+
                        this.x +': '+ this.y +'KWH';
                """),format.raw("""}"""),format.raw/*50.18*/("""
            """),format.raw("""}"""),format.raw/*51.14*/(""",
            legend: """),format.raw("""{"""),format.raw/*52.22*/("""
                layout: 'vertical',
                align: 'right',
                verticalAlign: 'top',
                x: -10,
                y: 100,
                borderWidth: 0
            """),format.raw("""}"""),format.raw/*59.14*/(""",

            series: ["""),format.raw("""{"""),format.raw/*61.23*/("""
                name: 'aurora1',
                data:["""),_display_(Seq(/*63.24*/measures/*63.32*/.map/*63.36*/ { measure =>_display_(Seq(format.raw/*63.49*/(""" """),_display_(Seq(/*63.51*/{measure.produced})),format.raw/*63.69*/(""",""")))})),format.raw/*63.71*/("""]
            """),format.raw("""}"""),format.raw/*64.14*/("""]
        """),format.raw("""}"""),format.raw/*65.10*/(""");
    """),format.raw("""}"""),format.raw/*66.6*/(""");
"""),format.raw("""}"""),format.raw/*67.2*/(""");
</script>	
	
	
    </head>
    <body>
       <h1>Statistic</h1>
           <div id="container" style="width: 100%; height: 400px"></div>
     
    </body>
</html>
"""))}
    }
    
    def render(measures:Seq[Aggregate]) = apply(measures)
    
    def f:((Seq[Aggregate]) => play.api.templates.Html) = (measures) => apply(measures)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Mar 20 22:42:06 CET 2012
                    SOURCE: /home/security/workspace/PLAY-STATUS/status/app/views/measures/aggregates.scala.html
                    HASH: 4e423ff1179a78938687737450b4be1d482b76ee
                    MATRIX: 527->1|625->27|779->151|793->157|848->191|949->261|964->267|1018->299|1074->324|1089->330|1156->375|1261->449|1276->455|1337->494|1446->556|1539->602|1625->641|1693->662|1892->814|1961->836|2090->918|2162->943|2288->1022|2357->1044|2435->1091|2452->1099|2465->1103|2511->1116|2545->1119|2582->1134|2617->1137|2716->1189|2785->1211|2857->1236|2954->1286|3032->1317|3194->1432|3256->1447|3327->1471|3414->1511|3601->1651|3662->1665|3732->1688|3978->1887|4050->1912|4138->1969|4155->1977|4168->1981|4214->1994|4247->1996|4287->2014|4321->2016|4383->2031|4441->2042|4495->2050|4545->2054
                    LINES: 19->1|22->1|29->8|29->8|29->8|31->10|31->10|31->10|32->11|32->11|32->11|33->12|33->12|33->12|35->14|36->15|37->16|38->17|43->22|44->23|47->26|48->27|51->30|52->31|54->33|54->33|54->33|54->33|54->33|54->33|54->33|56->35|57->36|58->37|60->39|61->40|65->44|66->45|67->46|68->47|71->50|72->51|73->52|80->59|82->61|84->63|84->63|84->63|84->63|84->63|84->63|84->63|85->64|86->65|87->66|88->67
                    -- GENERATED --
                */
            