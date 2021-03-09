package lab02

import lab02.DryBTrees.Tree._
import org.junit.jupiter.api.Assertions.{assertEquals, assertTrue}
import org.junit.jupiter.api.Test

class DryBTreesTest {

  val tree = Branch(Branch(Leaf(1.0), Leaf(1.0)), Leaf(2.0))

  @Test
  def sizeTest(): Unit = {
    val aggregator: (Int, Int) => Int = _ + _
    val operator: Double => Int = _ => 1
    assertEquals(
      3,
      traversal(tree)(aggregator)(operator)
    )
    assertEquals(
      3,
      size(tree)
    )
  }

  @Test
  def findTest(): Unit = {
    val aggregator: (Boolean, Boolean) => Boolean = _ || _
    val operator: Double => Boolean = _ == 1.0
    assertTrue(
      traversal(tree)(aggregator)(operator)
    )
    assertTrue(
      find(tree, 1.0)
    )
  }

  @Test
  def countTest(): Unit = {
    val aggregator: (Int, Int) => Int = _ + _
    val operator: Double => Int = a => a match {
      case a if a == 1.0 => 1
      case _ => 0
    }
    assertEquals(
      2,
      traversal(tree)(aggregator)(operator)
    )
    assertEquals(
      2,
      count(tree, 1.0)
    )
  }



}
