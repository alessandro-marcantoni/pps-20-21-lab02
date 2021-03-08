package lab02

object Functions {

  val parityVal: Int => String = {
    case x if x % 2 == 0 => "even"
    case _ => "odd"
  }

  def parityDef(x: Int) = x match {
    case x if x % 2 == 0 => "even"
    case _ => "odd"
  }

  println(parityVal(2))
  println(parityVal(3))

  val emptyVal: String => Boolean = {
    case x if x == "" => true
    case _ => false
  }

  val negVal: (String => Boolean) => (String => Boolean) = f => (s => !f(s))

  def emptyDef(x: String) = x match {
    case x if x == "" => true
    case _ => false
  }

  def negDef(predicate: String => Boolean): String => Boolean = {
    s => !predicate(s)
  }

  println(emptyVal(""))
  println(emptyVal("a"))

  println(negVal(emptyVal)(""))
  println(negVal(emptyVal)("a"))

  def genericNeg[T](predicate: T => Boolean): T => Boolean = predicate match {
    case _ => !predicate(_)
  }

}
