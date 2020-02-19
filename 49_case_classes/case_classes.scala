object case_classes extends App {
  // case class Person(name: String, relation: String)
  //
  // val christina = Person("Christina", "niece")
  // println(christina.name, christina.relation)

  trait Person {
    def name: String
  }

  case class Student(name: String, year: Int) extends Person
  case class Teacher(name: String, specialty: String) extends Person

  def getPrintableString(p: Person): String = p match {
    case Student(name, year) =>
      s"$name is a student in Year $year"
    case Teacher(name, whatTheyTeach) =>
      s"$name teaches $whatTheyTeach"
  }

  val s = Student("Al", 1)
  val t = Teacher("Bob Donnan", "Mathematics")

  println(getPrintableString(s))
  println(getPrintableString(t))

  case class BaseballTeam(name: String, lastWorldSeriesWin: Int)

  val cubs1908 = BaseballTeam("Chicago Cubs", 1908)
  println(cubs1908)

  val cubs2016 = cubs1908.copy(lastWorldSeriesWin = 2016)
  println(cubs2016)

  case class Person_two(name: String, relation: String)

  val christina = Person_two("Christina", "niece")
  val hannah = Person_two("Hannah", "niece")

  println(christina == hannah)


}
