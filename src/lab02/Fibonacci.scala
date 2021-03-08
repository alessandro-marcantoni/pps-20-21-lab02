package lab02

object Fibonacci {

  def fib(n: Int): Int = n match {
    case n if n <= 1 => n
    case _ => fib(n-1) + fib(n-2)
  }

}
