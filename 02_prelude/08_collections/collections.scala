object collections extends App {
  val nums_01 = List.range(0,10)
  println(nums_01)

  val nums_02 = (1 to 10 by 2).toList
  println(nums_02)

  val letters_01 = ('a' to 'f').toList
  println(letters_01)

  val letters_02 = ('a' to 'f' by 2).toList
  println(letters_02)

  val nums_03 = (1 to 10).toList
  println(nums_03)

  val names = List("joel", "ed", "chris", "maurice")
  names.foreach(println)

  nums_03.filter(_ < 4).foreach(println)

  val doubles = nums_03.map(_ * 2)
  doubles.foreach(println)

  val capNames = names.map(_.capitalize)
  capNames.foreach(println)

  val lessThanFive = nums_03.map(_ < 5)
  lessThanFive.foreach(println)

  println(nums_03.foldLeft(0)(_ * _))
  println(nums_03.foldLeft(1)(_ * _))
}
