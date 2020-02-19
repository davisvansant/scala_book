object a_few_built_in_types extends App {
  val b: Byte = 1
  val x: Int = 1
  val l: Long = 1
  val s: Short = 1
  val d: Double = 2.0
  val f: Float = 3.3f

  val i_inferred = 123
  val x_inferred = 1.0

  var bigint = BigInt(1234567890)
  var bigdecimal = BigDecimal(123456.789)

  println(bigint + bigint)

  println(bigint * bigint)

  println(bigint + 1)

  val name = "Bill"
  val c = 'a'

  val name_explicit: String = "Bill"
  val c_explicit: Char = 'a'
}
