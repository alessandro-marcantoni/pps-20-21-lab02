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

}
