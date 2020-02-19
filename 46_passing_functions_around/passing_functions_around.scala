object passing_functions_around extends App {
  val nums = (1 to 10).toList
  val doubles = nums.map(_ * 2)
  val lessThanFive = nums.filter(_ < 5)

  println(nums)
  println(doubles)
  println(lessThanFive)

  def double(i: Int): Int = i * 2

  val x = nums.map(double)

  println(x)

  println(List("foo", "bar").map(_.toUpperCase))
  println(List("foo", "bar").map(_.capitalize))
  println(List(1,2,3,4,5).map(_ * 10))
  println(List(1,2,3,4,5).filter(_ > 2))
  println(List(5,1,3,11,7).takeWhile(_ < 6))

  def toUpper(s: String): String = s.toUpperCase

  println(List("foo", "bar").map(toUpper))
  println(List("foo", "bar").map(s => toUpper(s)))

  println(List("foo", "bar").map(s => s.toUpperCase))
  println(List("foo", "bar").map(_.toUpperCase))
}
