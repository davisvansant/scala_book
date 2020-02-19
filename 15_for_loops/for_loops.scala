object for_loops extends App {
  val nums = Seq(1,2,3)

  for (n <- nums) println(n)

  val people = List(
    "Bill",
    "Candy",
    "Karen",
    "Leo",
    "Ragina"
  )

  for (p <- people) println(p)

  people.foreach(println)

  val ratings = Map(
    "Lady in the Water" -> 3.0,
    "Snakes on a Plane" -> 4.0,
    "You, me and Dupree" -> 3.5
  )

  for ((k, v) <- ratings) println(s"Movie: $k, Rating: $v")

  ratings.foreach{
    case(k,v) => println(s"key: $k, value: $v")
  }
}
