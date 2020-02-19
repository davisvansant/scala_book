object pure_functions extends App {
  def double(i: Int): Int = i * 2

  def sum(list: List[Int]): Int = list match {
    case Nil => 0
    case head :: tail => head + sum(tail)
  }

  val d = double(5)
  println(d)

  val l: List[Int] = List(2, 4 ,6)
  val s = sum(l)
  println(s)

  val other_l: List[Int] = List(10, 20, 30, 40)
  println(sum(other_l))
}
