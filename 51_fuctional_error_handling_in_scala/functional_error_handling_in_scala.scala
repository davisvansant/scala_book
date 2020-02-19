object fuctional_error_handling_in_scala extends App {
  import scala.util.{Try, Success, Failure}

  def toInt(s: String): Try[Int] = Try(Integer.parseInt(s.trim))

  val a = toInt("1")
  println(a)

  val b = toInt("boo")
  println(b)

  val x = "10"

  toInt(x) match {
    case Success(i) => println(i)
    case Failure(s) => println(s"Failed. Reason: $s")
  }

  val stringA = "1"
  val stringB = "2"
  val stringC = "3"

  val y = for {
    a <- toInt(stringA)
    b <- toInt(stringB)
    c <- toInt(stringC)
  } yield a + b + c

  println(y)
}
