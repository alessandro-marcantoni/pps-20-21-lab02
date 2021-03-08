package lab02

import lab02.Fibonacci.fib
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class FibonacciTest {

  @Test
  def fibonacciTest(): Unit = {
    assertEquals(0, fib(0))
    assertEquals(1, fib(1))
    assertEquals(1, fib(2))
    assertEquals(2, fib(3))
    assertEquals(3, fib(4))
    assertEquals(5, fib(5))
    assertEquals(8, fib(6))
  }

}
