package lab02

object Currying {

  val curriedVal: Double => Double => Double => Boolean = x => y => z => x <= y && y <= z

  val nonCurriedVal: (Double, Double, Double) => Boolean = (x, y, z) => x <= y && y <= z

  def curriedDef(x: Double)(y: Double)(z: Double): Boolean = x <= y && y <= z
  // def curriedDef(x: Double) = (y: Double) => (z:Double) =>  x <= y && y <= z

  def nonCurriedDef(x:Double, y:Double, z:Double): Boolean = x <= y && y <= z

}
