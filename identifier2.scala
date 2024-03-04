import scala.compiletime.ops.int
object identifier2{
    def main(args: Array[String]) = {
        var num1 :Int =50;
        var num2 :Int =27;
        var num3 :Int =44;
//        num2 = num3 + num1;
        num3 = num1 - num2;
        println(num1);
        println(num2);
        println(num3);
    }
}