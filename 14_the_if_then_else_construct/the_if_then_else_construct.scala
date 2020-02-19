object the_if_then_else_construct extends App {
  def dosomething(): Unit = {
    println("Yeah!")
  }

  def donothing(): Unit = {
    println("nope...")
  }

  if ("a" == "b") {
    dosomething()
  } else {
    donothing()
  }

  val test_one = true
  val test_two = true

  if (test_two) {
    dosomething()
  } else if (test_two) {
    donothing()
  } else {
    println("I dunno...")
  }

  val minvalue = if (10 < 20) 10 else 20
  println(minvalue)

}
