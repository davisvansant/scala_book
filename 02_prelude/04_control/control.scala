object control extends App {
  val a = 10
  val b = 30
  val x = if (a < b) a else b

  println(s"a is $a")
  println(s"b is $b")
  println(s"x is $x")

  val result = a match {
    case 1 => "a is one!"
    case 2 => "a is two!"
    case 3 => "a is something...?"
    case _ => "not one, two, or something!"
  }

  println(result)

  val bool = true

  val booleanAsString = bool match {
    case true => "bool is true!"
    case false => "bool is false!"
  }

  println(booleanAsString)

  def getClassAsString(x: Any):String = x match {
    case s: String => s + " is a string"
    case i: Int => "Int"
    case f: Float => "Float"
    case l: List[_] => "list"
    case _ => "unknown"
  }

  println("Match for type returned from 'getClassAsString' is a: " + getClassAsString(x))

  def throw_an_exception(exception: Boolean): Int = {
    if (exception) throw new RuntimeException("something terrible has happened")
    else 10000
  }

  try {
    throw_an_exception(false)
  } catch {
    case e: RuntimeException => println("breaking stuff")
  } finally {
    println("...moving on...")
  }

  for (n <- 1 to 10) println(n)

  val stuff = List("a", "b", "c", "d")

  for (l <- stuff) println(l)

  var looper = 0

  while (looper < 10) {
    println("looping with a looper " + looper)
    looper = looper + 1
  }
}
