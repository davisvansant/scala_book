object two_notes_about_strings extends App {
  val firstName = "John"
  val mi = 'C'
  val lastName = "Doe"

  val name = firstName + " " + mi + " " + lastName

  val better_name = s"$firstName $mi $lastName"

  println(name)
  println(better_name)

  println(s"Name: $firstName $mi $lastName")

  println(s"Name: ${firstName} ${mi} ${lastName}")

  println(s"1+1 = ${1+1}")

  val speach = """Four score and
                |seven years ago
                |our fathers....""".stripMargin

  println(speach)
}
