object the_list_class extends App {
  val ints = List(1, 2, 3)
  val names = List("Joel", "Chris", "Ed")

  val ints_two: List[Int] = List(1, 2, 3)
  val names_two: List[String] = List("Tom Servo", "Crow", "Joel")

  val b = 0 +: ints
  val b_two = List(-1, 0) ++: ints

  println(ints)
  println(names)

  println(ints_two)
  println(names_two)

  ints.foreach(println)
  names.foreach(println)

  b.foreach(println)
  b_two.foreach(println)

  for (i <- ints_two) println(i)
  for (n <- names_two) println(n)
}
