object command_line_io extends App {
  println("Hello, World")

  print("Hello without newline")

  System.err.println("bad things going on...")

  import scala.io.StdIn.readLine

  print("enter your first name: ")
  val firstName = readLine()

  print("enter your last name: ")
  val lastName = readLine()

  println(s"Your name is $firstName $lastName")
}
