package lab02

import lab02.Functions._
import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class FunctionsTest {

  @Test
  def testParityDef() {
    assertEquals("even", parityDef(2))
    assertEquals("odd", parityDef(3))
  }

  @Test
  def testNegDef() {
    assertTrue(emptyDef(""))
    assertFalse(emptyDef("a"))

    assertFalse(negDef(emptyDef)(""))
    assertTrue(negDef(emptyDef)("a"))
  }

  @Test
  def testGenericNegDef() {
    assertFalse(genericNeg(emptyDef)(""))
    assertTrue(genericNeg(emptyDef)("a"))

    val even: Int => Boolean = x => x match {
      case x if x % 2 == 0 => true
      case _ => false
    }

    assertTrue(even(2))
    assertFalse(even(3))

    assertFalse(genericNeg(even)(2))
    assertTrue(genericNeg(even)(3))

  }

}
