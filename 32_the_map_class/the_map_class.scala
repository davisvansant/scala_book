object the_map_class extends App {
  import scala.collection.mutable.Map

  val states = collection.mutable.Map("AK" -> "Alaska")

  states += ("AL" -> "Alabama")

  states += ("AR" -> "Arkansas", "AZ" -> "Arizona")

  states.foreach(println)

  for ((k, v) <- states) println(k, v)

  states ++= Map("CA" -> "California", "CO" -> "Colorado")

  states.foreach(println)

  states -= "AR"
  states -= ("AL", "AZ")

  states.foreach(println)

  states("AK") = "Alaska, A Really Big State"

  states.foreach(println)

  val ratings = Map(
    "Lady in the Water" -> 3.0,
    "Snakes on a Plane" -> 4.0,
    "You, Me, and Dupree" -> 3.5
  )

  for ((k, v) <- ratings) println(s"key: $k, value: $v")

  ratings.foreach {
    case(movie, rating) => println(s"key: $movie, value: $rating")
  }

}
