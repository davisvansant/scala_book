object no_null_values extends App {
  def toInt(s: String): Option[Int] = {
    try {
      Some(Integer.parseInt(s.trim))
    } catch {
      case e: Exception => None
    }
  }

  val a = toInt("1")
  println(a)

  val b = toInt("foo")
  println(b)

  val x: String = "20"

  toInt(x) match {
    case Some(i) => println(i)
    case None => println("That didnt work")
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

  val stringX = "abc"
  val stringY = "def"
  val stringZ = "ghi"

  val z = for {
    a <- toInt(stringX)
    b <- toInt(stringY)
    c <- toInt(stringZ)
  } yield a + b + c

  println(z)

  toInt("1").foreach(println)
  toInt("x").foreach(println)

  class Address (
    var street1: String,
    var street2: Option[String],
    var city: String,
    var state: String,
    var zip: String
  )

  val palps = new Address(
    "Level 1313",
    None,
    "Coruscant City",
    "Coruscant",
    "555555555"
  )

 println(palps.street1)
 println(palps.street2)
 println(palps.city)
 println(palps.state)
 println(palps.zip)

}
