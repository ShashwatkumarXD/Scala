import scala.io.StdIn._
object test6 {
    def main(args:Array[String])={
        var result: Int=0
        
        // var weeknumber = readInt()
        // while (weeknumber > 7){
        //     println("ENTER NUMBER WITHIN 7")
        // }

        
        weeknumber match
            case '1'=>
                println("Mo")
            case '2'=>
                println("Tu")
            case '3'=>
                println("We")
            case '4'=>
                println("Thu")
            case '5'=>
                println("Fri")
            case '6'=>
                println("Sat")
            case '7'=>
                println("Sun")
            case_=>
                println("lauda")
        
    }
}