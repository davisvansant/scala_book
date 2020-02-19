object the_vector_class extends App {
  val nums = Vector(1, 2, 3, 4, 5)
  val strings = Vector("one", "two")
  val peeps = Vector(
    ("Bert"),
    ("Ernie"),
    ("Grover")
  )

  println(nums)
  println(strings)
  println(peeps)

  val a = Vector(1,2,3)

  val b = a :+ 4

  b.foreach(println)

  val b_two = a ++ Vector(4, 5)

  for (i <- b_two) println(i)

  val b_three = 1000 +: a

  for (i <- b_three) println(s"b_three is $i")

  val b_four = Vector(-1, 0) ++: a

  for (i <- b_four) println(s"b_four is $i")
}
