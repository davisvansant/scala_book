object match_expressions extends App {
  val i: Int = 10

  i match {
    case 1 => println("January")
    case 2 => println("February")
    case 3 => println("March")
    case 4 => println("April")
    case 5 => println("May")
    case 6 => println("June")
    case 7 => println("July")
    case 8 => println("August")
    case 9 => println("September")
    case 10 => println("October")
    case 11 => println("November")
    case 12 => println("December")
    case _ => println("Invalid Month")
  }

  val month_name = i match {
    case 1 => "January"
    case 2 => "February"
    case 3 => "March"
    case 4 => "April"
    case 5 => "May"
    case 6 => "June"
    case 7 => "July"
    case 8 => "August"
    case 9 => "September"
    case 10 => "October"
    case 11 => "November"
    case 12 => "December"
    case _ => "Invalid Month"
  }

  def convert_boolean_to_string_message(bool: Boolean): String = {
    if (bool) "true" else "false"
  }

  val t = convert_boolean_to_string_message(true)
  val f = convert_boolean_to_string_message(false)

  println(t)
  println(f)

  def convert_boolean_to_string_message_match(bool: Boolean): String = bool match {
    case true => "something is true"
    case false => "something is false"
  }

  println(convert_boolean_to_string_message_match(true))
  println(convert_boolean_to_string_message_match(false))

  def is_true(a: Any) = a match {
    case 0 | "" => false
    case _ => true
  }

  println(is_true(0))
  println(is_true(""))
  println(is_true("awesome"))

  val even_or_odd = i match {
    case 1 | 3 | 5 | 7 | 9 => println("odd")
    case 2 | 4 | 6 | 8 | 10 => println("even")
    case _ => println("something else")
  }

  val cmd = "start"

  cmd match {
    case "start" | "go" => println("starting")
    case "stop" | "quit" | "exit" => println("stopping")
    case _ => println("doing nothing")
  }

  val count = 3

  count match {
    case 1 => println("one, a lonely number")
    case x if x == 2 || x == 3 => println("twos company, threes a crowd")
    case x if x > 3 => println("4+, thats a party")
    case _ => println("i'm guessing your number is zero is less")
  }

  val number = 30

  number match {
    case a if 0 to 9 contains a => println("0-9 range: " + a)
    case b if 10 to 19 contains b => println("10-19 range: " + b)
    case c if 20 to 29 contains c => println("20-29 range: " + c)
    case _ => println("hmmm...")
  }

  class Stock(var symbol: String, var price: Int)

  def buy(s: Any) : Unit = {
    println(s"Buying : $s")
  }

  def sell(s: Any) : Unit = {
    println(s"Selling : $s")
  }

  def doNothing(s: Any) : Unit = {
    println("Nothing!")
  }

  val stock = new Stock("XYZ", 10)

  stock match {
    case x if (x.symbol == "XYZ" && x.price < 20) => buy(x.symbol)
    case x if (x.symbol == "XYZ" && x.price > 50) => sell(x.symbol)
    case x => doNothing(x.symbol)
  }

}
