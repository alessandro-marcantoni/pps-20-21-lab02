package lab02

import lab02.Shapes.Shape._
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ShapesTest {

  val rectangle = Rectangle(10, 20)
  val circle = Circle(10)
  val square = Square(10)

  @Test
  def rectanglePerimeterTest(): Unit = {
    assertEquals(60, perimeter(rectangle))
  }

  @Test
  def circlePerimeterTest(): Unit = {
    assertEquals(20*Math.PI, perimeter(circle))
  }

  @Test
  def squarePerimeterTest(): Unit = {
    assertEquals(40, perimeter(square))
  }

  @Test
  def rectangleAreaTest(): Unit = {
    assertEquals(200, area(rectangle))
  }

  @Test
  def circleAreaTest(): Unit = {
    assertEquals(100*Math.PI, area(circle))
  }

  @Test
  def squareAreaTest(): Unit = {
    assertEquals(100, area(square))
  }

}
