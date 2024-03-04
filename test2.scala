// import scala.io.StdInt._
// object test2 {
//     def math(x:Int,y:Int): Unit ={
//         var result = (x:Int) + (y:Int)
//         println(result)
//     }
//     def main(args:Array[String]): Unit = {
//         math(10,20)

//     }
// }
object test2 {
    def main(args:Array[String]): Unit={
        var sum=(x:Int,y:Int)=>(x+y)  /// anonymous function
        println(sum(10,20))
    }
}