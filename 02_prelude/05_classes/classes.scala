object classes extends App {
  class Person(var firstname: String, var lastname: String) {
    def printfullname() = println(s"$firstname $lastname")
  }

  var p = new Person("Julia", "Kern")
  println(p)
  println(p.firstname)
  println(p.lastname)
  p.printfullname()
}
