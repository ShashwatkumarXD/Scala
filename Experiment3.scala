object Experiment3 {
  def main(args: Array[String]) = {
    val add = (_: Int) + (_: Int)
    val sub = (_: Int) - (_: Int)
    val mul = (_: Int) * (_: Int)

    println(add(10, 20))
    println(sub(20, 10))
    println(mul(10, 20))
  }
}