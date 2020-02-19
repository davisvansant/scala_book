object a_first_look_at_scala_methods extends App {
  def double(a: Int) = a * 2

  val something = double(2)
  println(something)

  val something_something = double(10)
  println(something_something)

  def add(a: Int, b: Int) = a + b

  def add_three(a: Int, b: Int, c: Int) = a + b + c

  val two = add(10, 30)
  println(two)

  val three = add_three(10, 20, 30)
  println(three)

  def addThenDouble(a: Int, b: Int): Int = {
    val sum = a + b
    val doubled = sum * 2
    doubled
  }

  val adder_doubled = addThenDouble(59, 120)
  println(adder_doubled)
}
