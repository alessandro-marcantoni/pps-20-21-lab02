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

  @Test
  def mapTest(): Unit = {
    val function: Int => Boolean = _ > 2

    assertEquals(Some(true), map(Some(5))(_ > 2))
    assertEquals(Some(10), map(Some(5))(_ * 2))
    assertEquals(None(), map(None())(function))
  }

  @Test
  def map2Test(): Unit = {
    val combinator: (Int, Double) => Double = _ * _

    assertEquals(Some(10.0), map2(Some(2))(Some(5.0))(combinator))
    assertEquals(None(), map2(None())(Some(5.0))(combinator))
    assertEquals(None(), map2(Some(2))(None())(combinator))
  }

}
