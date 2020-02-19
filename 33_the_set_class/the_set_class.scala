object the_set_class extends App {
  val set = scala.collection.mutable.Set[Int]()

  set += 1
  set += 2 += 3
  set ++= Vector(4,5)

  println(set)

  set.add(6)
  set.add(5)

  set.foreach(println)

  set -= 1
  set -= (2, 3)
  set --= Array(4,5)

  for (n <- set) println(s"whats left $n")

  set.clear()
  for (n <- set) println(s"whats left $n")
  set
  for (n <- set) println(s"whats left $n")

}
