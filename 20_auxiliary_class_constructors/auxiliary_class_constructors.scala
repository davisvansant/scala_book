object auxiliary_class_constructors extends App {
  val DefaultCrustSize = 12
  val DefaultCrustType = "THIN"

  class Pizza (var crustSize: Int, var crustType: String) {
    def this(crustSize: Int) {
      this(crustSize, DefaultCrustType)
    }

    def this(crustType: String) {
      this(DefaultCrustSize, crustType)
    }

    def this() {
      this(DefaultCrustSize, DefaultCrustType)
    }

    override def toString = s"A $crustSize inch pizza with a $crustType crust"
  }

  val p1 = new Pizza(DefaultCrustSize, DefaultCrustType)
  val p2 = new Pizza(DefaultCrustSize)
  val p3 = new Pizza(DefaultCrustType)
  val p4 = new Pizza

  println(p1)
  println(p2)
  println(p3)
  println(p4)
}
