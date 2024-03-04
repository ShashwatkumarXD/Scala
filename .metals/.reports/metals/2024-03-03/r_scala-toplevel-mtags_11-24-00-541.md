error id: file:///D:/Big%20Data/EXP.scala:[8..9) in Input.VirtualFile("file:///D:/Big%20Data/EXP.scala", "object  {
def Weekday(weekday: Int): String = weekday match {
    				case 1 => "Monday"
    				case 2 => "Tuesday"
    				case 3 => "Wednesday"
    				case 4 => "Thursday"
    				case 5 => "Friday"
    				case 6 => "Saturday"
    				case 7 => "Sunday"
    				case _ => "Invalid weekday number"
  			}
  			def main(args: Array[String]) = {
    				println("Enter a weekday number:")
    				val n = scala.io.StdIn.readInt()
    				val result = Weekday(n)
    				println(result)
  			}
}
")
file:///D:/Big%20Data/EXP.scala
file:///D:/Big%20Data/EXP.scala:1: error: expected identifier; obtained lbrace
object  {
        ^
#### Short summary: 

expected identifier; obtained lbrace