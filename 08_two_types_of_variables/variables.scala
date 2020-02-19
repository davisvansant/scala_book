object variables extends App {
  val s = "hello" // immutable
  var i = 42 // mutable

  println("variable is " + s)
  println("variable is " + i)

  i = 50

  println("variable is now " + i)

  // now we are getting "rusty"

  val new_s: String = "hello from explicit string"
  val new_i: Int = 84

  println(new_s)
  println(new_i)

  val hello = "Hello, world"
  println(hello)
}
