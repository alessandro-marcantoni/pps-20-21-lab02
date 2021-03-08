package lab02

object Shapes {

  sealed trait Shape
  object Shape {
    case class Rectangle(base:Double, height:Double) extends Shape
    case class Circle(radius: Double) extends Shape
    case class Square(edge: Double) extends Shape

    def perimeter(shape: Shape): Double = shape match {
      case Rectangle(base, height) => 2 * (base + height)
      case Circle(radius) => 2 * Math.PI * radius
      case Square(edge) => 4 * edge
    }

    def area(shape: Shape): Double = shape match {
      case Rectangle(base, height) => base * height
      case Circle(radius) => Math.PI * radius * radius
      case Square(edge) => edge * edge
    }

  }

}
