package lab02

object DryBTrees {

  sealed trait Tree[A]
  object Tree {
    case class Leaf[A](value: A) extends Tree[A]
    case class Branch[A](left: Tree[A], right: Tree[A]) extends Tree[A]

    def traversal[A,B](t: Tree[A])(aggregator: (B, B) => B)(operator: A => B): B = t match {
      case Branch(l, r) => aggregator(traversal(l)(aggregator)(operator), traversal(r)(aggregator)(operator))
      case Leaf(e) => operator(e)
    }

    def size[A](t: Tree[A]): Int =
      traversal(t)((a: Int, b: Int) => a+b)(_ => 1)

    def find[A](t: Tree[A], elem: A): Boolean =
      traversal(t)((a: Boolean, b: Boolean) => a || b)((a:A) => a == elem)

    def count[A](t: Tree[A], elem: A): Int = {
      traversal(t)((a: Int, b: Int) => a+b)((a:A) => a match {
        case a if a == elem => 1
        case _ => 0
      })
    }

  }

}
