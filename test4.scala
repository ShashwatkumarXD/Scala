// object test4 {
//     def main(args:Array[String])={
//         var a=(x:Int,y:Int)=>x+y
//         var b=(x:Int,y:Int)=>x*y
//         var c=(x:Int,y:Int)=>x-y

//         println(a(10,20))
//         println(b(10,20))
//         println(c(20,20))

//     }
// }
import scala.io.StdIn._
object test4{
    def main(args:Array[String])={
        var result: Int=0
        println("ENTER NUMBER")
        var a=readInt()
        println("ENTER SECOND NUMBER")
        var c=readInt()
        println("ENTER OPERATOR")
        val b=readChar()

        b match{
            case '+'=>
                result=a + b
                println(result) 
            case '-'=>
                result=a - b
                println(result)
            case '*'=>
                result=a * b
                println(result)
            case '/'=>
                result=a / b
                println(result)
            case _ =>
                println("ENTER CORRECT INPUT")
                

        }
    }
}