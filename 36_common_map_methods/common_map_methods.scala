object common_map_methods extends App {
  val m = Map(
    1 -> "a",
    2 -> "b",
    3 -> "c",
    4 -> "d"
  )

  for ((k, v) <- m) printf("key: %s, value: %s\n", k, v)

  val keys = m.keys
  println(keys)

  val values = m.values
  println(values)

  val contains_three = m.contains(3)
  println(contains_three)

  val ucMap = m.transform((k,v) => v.toUpperCase)
  println(ucMap)

  val twoAndThree = m.view.filterKeys(Set(2, 3)).toMap
  println(twoAndThree)

  val firstTwoElements = m.take(2)
  println(firstTwoElements)

  val states = scala.collection.mutable.Map(
    "AL" -> "Alabama",
    "AK" -> "Alaska"
  )

  println(states)

  states += ("AZ" -> "Arizona")
  println(states)

  states += ("CO" -> "Colorado", "KY" -> "Kentucky")
  println(states)

  states -= "KY"
  states -= ("AZ", "CO")
  println(states)

  states("AK") = "Alaska, The Big State"
  println(states)

  states.retain((k, v) => k == "AK")
  println(states)
}
