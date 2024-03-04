object Exp4Q4 {
  				def toUpper(str: String): String = {
    					str.toUpperCase
  				}
  				def toLower(str: String): String = {
    					str.toLowerCase
  				}
  				def reverse(str: String): String = {
    					str.reverse
  				}
def formatNames(name: String)(formatFunction: String => String): String = {
    					formatFunction(name)
  				}

  				def main(args: Array[String]): Unit = {
    					val name = "I am a good boy "
val upperCaseName = formatNames(name)(toUpper)
println("Upper case name: " + upperCaseName)
val lowerCaseName = formatNames(name)(toLower)
println("Lower case name: " + lowerCaseName)
val reversedName = formatNames(name)(reverse)
println("Reversed name: " + reversedName)
  				}
}
