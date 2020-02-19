object methods extends App {
  def sum(a: Int, b: Int): Int = a + b
  def concat(s1: String, s2: String): String = s1 + s2

  val method_sum = sum(10, 40)
  val method_concat = concat("Hello", "there")

  println(method_sum)
  println(method_concat)
}
