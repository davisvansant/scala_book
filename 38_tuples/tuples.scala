object tuples extends App {
  class Person (var name: String)
  val t = (3, "Three", new Person("Al"))

  println(t)

  val d = ("Maggie", 30)

  println(d)

  val t_two = (10, "a number", new Person("Weird"))

  println(t_two._1)
  println(t_two._2)
  println(t_two._3.name)

  val(x, y, z) = (100, "One", new Person("Monster"))

  println(x)
  println(y)
  println(z.name)

  def getStockInfo = {
    ("NFLX", 100.00, 101.00)
  }

  val (symbol, currentPrice, bidPrice) = getStockInfo

  println(symbol)
  println(currentPrice)
  println(bidPrice)


}
