// def isEven(n: Int): Boolean = n % 2 == 0
//   def isOdd(n: Int): Boolean = !isEven(n)
//   def isPositive(n: Int): Boolean = n > 0
//   def isNegative(n: Int): Boolean = n < 0
//   def isZero(n: Int): Boolean = n == 0

//   // Higher-order function to filter a list of numbers based on a given predicate function
//   def filterList(numbers: List[Int], filterFunc: Int => Boolean): List[Int] = {
//     numbers.filter(filterFunc)
//   }

//   def main(args: Array[String]): Unit = {
//     val numbers = List(-3, -2, -1, 0, 1, 2, 3)

//     println("Filtering even numbers:")
//     println(filterList(numbers, isEven)) // Output: List(-2, 0, 2)
//     println()

//     println("Filtering positive numbers:")
//     println(filterList(numbers, isPositive)) // Output: List(1, 2, 3)
//     println()

//     println("Filtering zero numbers:")
//     println(filterList(numbers, isZero)) // Output: List(0)
//     println()
//   }

object test7 {
    def even(n:Int): Boolean = n%2 == 0
    def odd(n:Int): Boolean = !odd(n)
    def positive(n:Int): Boolean = n>0 
    def Negative(n:Int): Boolean= n<0

    def filterList(number: List[Int], filterfuc: Int=>Boolean): List[Int]={
        number.filter(filterfuc)
    }
        def main(args:Array[String]): Unit={
            val number = List(-2,-1,0,1,2,3,4,5)

            println("NUMBER IS POSITIVE")
            println(filterList(number,positive))
            
            println("NUMBER IS EVEN")
            println(filterList(number,even))
            
            println("NUMBER IS ODD")
            println(filterList(number,odd))
        }
    
}
