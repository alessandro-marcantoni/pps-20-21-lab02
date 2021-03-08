package lab02

import lab02.Currying._
import org.junit.jupiter.api.Assertions.{assertFalse, assertTrue}
import org.junit.jupiter.api.Test

class CurryingTest {

  @Test
  def testPredicate(): Unit = {
    assertTrue(p4(10, 20, 30))
    assertFalse(p4(20, 10, 30))
  }

  @Test
  def testPredicateCurrying(): Unit = {
    assertTrue(p3(10)(20)(30))
    assertFalse(p3(20)(10)(30))
  }

}
