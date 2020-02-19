object anonymous_functions extends App {
  val ints = List(1, 2, 3)

  val doubledInts = ints.map(_ * 2)

  println(ints)
  println(doubledInts)

  val ints_two = List.range(1, 10)

  val x = ints_two.filter(_ > 5)
  println(x)
  val y = ints_two.filter(_ < 5)
  println(y)

  val z = ints_two.filter(_ % 2 == 0)
  println(z)
}
