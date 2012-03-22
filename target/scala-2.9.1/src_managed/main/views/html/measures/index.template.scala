
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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Seq[Measure],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(measures: Seq[Measure]):play.api.templates.Html = {
        _display_ {

Seq(format.raw/*1.26*/("""

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
		                """),_display_(Seq(/*33.20*/measures/*33.28*/.map/*33.32*/ { measure =>_display_(Seq(format.raw/*33.45*/(""" '"""),_display_(Seq(/*33.48*/{
							        val format = new java.text.SimpleDateFormat("dd-MM-yyyy")
									format.format(measure.taken)})),format.raw/*35.39*/("""',""")))})),format.raw/*35.42*/("""
		               ]                   
            """),format.raw("""}"""),format.raw/*37.14*/(""",
            yAxis: """),format.raw("""{"""),format.raw/*38.21*/("""
                title: """),format.raw("""{"""),format.raw/*39.25*/("""
                    text: 'KWH'
                """),format.raw("""}"""),format.raw/*41.18*/(""",
                plotLines: ["""),format.raw("""{"""),format.raw/*42.30*/("""
                    value: 0,
                    width: 1,
                    color: '#808080'
                """),format.raw("""}"""),format.raw/*46.18*/("""]
            """),format.raw("""}"""),format.raw/*47.14*/(""",
            tooltip: """),format.raw("""{"""),format.raw/*48.23*/("""
                formatter: function() """),format.raw("""{"""),format.raw/*49.40*/("""
                        return '<b>'+ this.series.name +'</b><br/>'+
                        this.x +': '+ this.y +'KWH';
                """),format.raw("""}"""),format.raw/*52.18*/("""
            """),format.raw("""}"""),format.raw/*53.14*/(""",
            legend: """),format.raw("""{"""),format.raw/*54.22*/("""
                layout: 'vertical',
                align: 'right',
                verticalAlign: 'top',
                x: -10,
                y: 100,
                borderWidth: 0
            """),format.raw("""}"""),format.raw/*61.14*/(""",

            series: ["""),format.raw("""{"""),format.raw/*63.23*/("""
                name: 'aurora1',
                data:["""),_display_(Seq(/*65.24*/measures/*65.32*/.map/*65.36*/ { measure =>_display_(Seq(format.raw/*65.49*/(""" """),_display_(Seq(/*65.51*/{measure.produced})),format.raw/*65.69*/(""",""")))})),format.raw/*65.71*/("""]
            """),format.raw("""}"""),format.raw/*66.14*/("""]
        """),format.raw("""}"""),format.raw/*67.10*/(""");
    """),format.raw("""}"""),format.raw/*68.6*/(""");
"""),format.raw("""}"""),format.raw/*69.2*/(""");
</script>	
	
	
    </head>
    <body>
       <h1>Statistic</h1>
           <div id="container" style="width: 100%; height: 400px"></div>
     
    </body>
</html>
"""))}
    }
    
    def render(measures:Seq[Measure]) = apply(measures)
    
    def f:((Seq[Measure]) => play.api.templates.Html) = (measures) => apply(measures)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Mar 19 22:37:34 CET 2012
                    SOURCE: /home/security/workspace/PLAY-STATUS/status/app/views/measures/index.scala.html
                    HASH: c8908e977be4e9d9ea7ff4a2bd13a40e86a9c359
                    MATRIX: 520->1|616->25|770->149|784->155|839->189|940->259|955->265|1009->297|1065->322|1080->328|1147->373|1252->447|1267->453|1328->492|1437->554|1530->600|1616->639|1684->660|1883->812|1952->834|2081->916|2153->941|2279->1020|2348->1042|2426->1089|2443->1097|2456->1101|2502->1114|2536->1117|2671->1230|2706->1233|2805->1285|2874->1307|2946->1332|3043->1382|3121->1413|3283->1528|3345->1543|3416->1567|3503->1607|3690->1747|3751->1761|3821->1784|4067->1983|4139->2008|4227->2065|4244->2073|4257->2077|4303->2090|4336->2092|4376->2110|4410->2112|4472->2127|4530->2138|4584->2146|4634->2150
                    LINES: 19->1|22->1|29->8|29->8|29->8|31->10|31->10|31->10|32->11|32->11|32->11|33->12|33->12|33->12|35->14|36->15|37->16|38->17|43->22|44->23|47->26|48->27|51->30|52->31|54->33|54->33|54->33|54->33|54->33|56->35|56->35|58->37|59->38|60->39|62->41|63->42|67->46|68->47|69->48|70->49|73->52|74->53|75->54|82->61|84->63|86->65|86->65|86->65|86->65|86->65|86->65|86->65|87->66|88->67|89->68|90->69
                    -- GENERATED --
                */
            