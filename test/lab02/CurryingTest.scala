package lab02

import lab02.Currying._
import org.junit.jupiter.api.Assertions.{assertFalse, assertTrue}
import org.junit.jupiter.api.Test

class CurryingTest {

  @Test
  def testPredicate(): Unit = {
    assertTrue(nonCurriedDef(10, 20, 30))
    assertFalse(nonCurriedDef(20, 10, 30))
  }

  @Test
  def testPredicateCurrying(): Unit = {
    assertTrue(curriedDef(10)(20)(30))
    assertFalse(curriedDef(20)(10)(30))
  }

}
