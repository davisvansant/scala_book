object for_expressions extends App {
  val nums = Seq(1,2,3)
  val doublednums = for (n <- nums) yield n * 2

  nums.foreach(println)
  doublednums.foreach(println)

  val names = List("adam", "david", "frank")
  val ucnames = for (name <- names) yield name.capitalize

  names.foreach(println)
  ucnames.foreach(println)

  val new_names = List("_adam", "_david", "_frank")

  new_names.foreach(println)

  val cap_names = for (name <- new_names) yield {
    val nameWithoutUnderscore = name.drop(1)
    val cap_names = nameWithoutUnderscore.capitalize
    cap_names
  }

  cap_names.foreach(println)

  val another_cap_names = for (n <- new_names) yield n.drop(1).capitalize

  another_cap_names.foreach(println)

}
