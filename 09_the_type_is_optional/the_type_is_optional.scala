object the_type_is_optional extends App {
  val count: Int = 1
  val name: String = "Alvin"

  // this is preferred

  val count_inferred = 1
  val name_inferred = "Alvin"

  class Person(var name: String) {
    def print() = println(name)
  }

  val candy = new Person("Candy")
  val leo: Person = new Person("Leo")

  candy.print
  leo.print
}
