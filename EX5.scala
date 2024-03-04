abstract class Shape {
 def draw(): Unit
}
class Circle extends Shape {
 override def draw(): Unit = println("Drawing a circle")
}
class Rectangle extends Shape {
 override def draw(): Unit = println("Drawing a rectangle")
}
class Triangle extends Shape {
 override def draw(): Unit = println("Drawing a triangle")
}
object Main {
 def main(args: Array[String]): Unit = {
 val circle = new Circle()
 val rectangle = new Rectangle()
 val triangle = new Triangle()
 println("Drawing shapes:")
 circle.draw()
 rectangle.draw()
 triangle.draw()
 }
}