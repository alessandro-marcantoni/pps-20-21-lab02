package lab02

import lab02.Composition._
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CompositionTest {

  @Test
  def testComposition(): Unit = {
    assertEquals(20, compose(_*2, _+2)(8))
    assertEquals(18, compose(_+2, _*2)(8))
  }

  @Test
  def testGenericComposition(): Unit = {
    val f1: Int => Int = _ * 2
    val g1: Int => Int = _ + 2
    assertEquals(20, genericCompose(f1, g1)(8))
    assertEquals(18, genericCompose(g1, f1)(8))

    val f2: Double => Double = _ * 2.0
    val g2: Double => Double = _ + 2.0
    assertEquals(20.0, genericCompose(f2, g2)(8.0))
    assertEquals(18.0, genericCompose(g2, f2)(8.0))
  }

}
