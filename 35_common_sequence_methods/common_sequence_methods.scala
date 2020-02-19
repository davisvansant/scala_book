object common_sequence_methods extends App {
  val nums = (1 to 10).toList
  val names = List("joel", "ed", "chris", "maurice")

  val doubles = nums.map(_ * 2)
  println(doubles)

  val capNames = names.map(_.capitalize)
  println(capNames)

  val lessthanfive = nums.map(_ < 5)
  println(lessthanfive)

  val filter_less_than_five = nums.filter(_ < 5)
  println(filter_less_than_five)

  val evens = nums.filter(_ % 2 == 0)
  println(evens)

  val shortnames = names.filter(_.length <= 4)
  println(shortnames)

  names.foreach(println)
  nums.filter(_ < 4).foreach(println)

  nums.head
  names.head

  println("foo".head)
  println("bar".head)

  // val emptylist = List[Int]()
  // emptylist.head

  nums.tail
  names.tail

  println("foo".tail)
  println("bar".tail)

  // emptylist.tail

  println(nums.take(1))
  println(nums.take(2))
  println(names.take(1))
  println(names.take(2))
  println(nums.takeWhile(_ < 5))
  println(names.takeWhile(_.length < 5))

  println(nums.drop(1))
  println(nums.drop(5))
  println(names.drop(1))
  println(names.drop(2))
  println(nums.dropWhile(_ < 5))
  println(names.dropWhile(_ != "chris"))

  def add(x: Int, y: Int): Int = {
    val theSum = x + y
    println(s"received $x and $y, their sum is $theSum")
    theSum
  }

  val a = List(1, 2 ,3 ,4)

  a.reduce(add)
  println(a.reduce(_ + _))
  println(a.reduce(_ * _))

}
