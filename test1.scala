import scala.io.StdIn._
object test1 {
    def main(args:Array[String]): Unit={
        println("ENTER FIRST NUMBER")
        var a =readInt()
        println("ENTER SECOND NUMBER")
        var b= readInt()
        if(a>b){
            println("A is greater")
        }
        else{
            println("B IS GREATER")
        }
    }
}