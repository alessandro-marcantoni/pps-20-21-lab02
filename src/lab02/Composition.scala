package lab02

object Composition {

  def compose(f: Int => Int, g: Int => Int): Int => Int = {
    i => f(g(i))
  }

}
