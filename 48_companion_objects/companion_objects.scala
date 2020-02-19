object companion_objects extends App {
  // class Person {
  //   var name: Option[String] = None
  //   var age: Option[Int] = None
  //   override def toString = s"$name, $age"
  // }
  // object Person {
  //   def apply(name: Option[String], age: Option[Int]): Person = {
  //     var p = new Person
  //     p.name = name
  //     p
  //   }
  // }

  // val p = Person.apply("Fred Flintsone")
  //
  // val zenMasters = List(
  //   Person("Nansen"),
  //   Person("Joshu")
  // )
  //
  // println(p.name)
  // for (n <- zenMasters) println(n.name)

  // val p1 = Person(Some("Fred"))
  // val p2 = Person(None)

  // val p3 = Person(Some("Wilma"), Some(33))
  // val p4 = Person(Some("Wilma"), None)

  // println(p1)
  // println(p2)
  // println(p3)
  // println(p4)

  class Person(var name: String, var age: Int)

  object Person {
    def unapply(p: Person): Tuple2[String, Int]= (p.name, p.age)
  }

  val p = new Person("Lori", 29)

  println(p.name, p.age)

  val result = Person.unapply(p)

  println(result)

  val (name, age) = Person.unapply(p)
  println(name)
  println(age)
}
