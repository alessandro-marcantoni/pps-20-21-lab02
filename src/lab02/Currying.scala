package lab02

object Currying {

  // CurriedFunType
  val p1: Double => (Double => (Double => Boolean)) = {
    x => (y => (z => x <= y && y <= z))
  }

  // NonCurriedFunType
  val p2: (Double, Double, Double) => Boolean = (x, y, z) => {
    x <= y && y <= z
  }

  // CurriedMethod
  def p3(x: Double)(y: Double)(z: Double): Boolean = x match {
    case x if x <= y => (y <= z)
    case _ => false
  }

  // NonCurriedMethod
  def p4(x:Double, y:Double, z:Double): Boolean = x match {
    case x if x <= y && y <= z => true
    case _ => false
  }

}
