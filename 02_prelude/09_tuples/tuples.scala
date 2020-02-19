object tuples extends App {
  class Person(var name: String)

  val t = (11, "Eleven", new Person("Eleven"))

  println(t._1)
  println(t._2)
  println(t._3)

  val (num, string, person) = (11, "Eleven", new Person("Eleven"))

  println(num, string, person)
}
