object the_arraybuffer_class extends App {
  import scala.collection.mutable.ArrayBuffer

  val ints = ArrayBuffer[Int]()
  val names = ArrayBuffer[String]()

  ints += 1
  ints += 2

  names += "nice"
  names += "stuff"

  ints.foreach(println)
  names.foreach(println)

  val nums = ArrayBuffer(1, 2, 3)

  println(nums)
  for (n <- nums) println(n)

  nums += 4
  nums += 5 += 6
  nums ++= List(7, 8, 9)

  println(nums)
  nums.foreach(println)

  nums -= 9
  nums -= 7 -= 8
  nums --= Array(5, 6)

  nums.foreach(println)

  val a = ArrayBuffer(1, 2, 3)
  a.append(4)
  a.append(5, 6)
  a.appendAll(Seq(7,8))
  println(a)
  a.clear
  println(a)

  val b = ArrayBuffer(9, 10)
  b.insert(0, 8)
  b.insertAll(0, Vector(4, 5, 6, 7))
  b.prepend(3)
  b.prepend(1, 2)
  b.prependAll(Array(0))

  println(b)

  val c = ArrayBuffer.range('a', 'h')
  println(c)
  c.remove(0)
  c.remove(2, 3)
  println(c)

  val d = ArrayBuffer.range('a', 'h')
  d.trimStart(2)
  d.trimEnd(2)
  println(d)
}
