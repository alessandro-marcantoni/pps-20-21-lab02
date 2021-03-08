package lab02

import lab02.ExtendedOption.Option._
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ExtendedOptionTest {

  @Test
  def filterTest(): Unit = {
    val predicate: Int => Boolean = _ => true

    assertEquals(Some(5), filter(Some(5))(_ > 2))
    assertEquals(None(), filter(Some(5))(_ > 8))
    assertEquals(None(), filter(None())(predicate))
  }

}
