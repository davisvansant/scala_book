object scala_classes extends App {
  class Person(var firstname: String, var lastname: String)

  val p = new Person("Bill", "Panner")

  println(p.firstname + " " + p.lastname)

  class new_person(val firstname: String, var lastname: String) {
    println("it begins...")

    var age = 0

    private val HOME = System.getProperty("user.home")

    override def toString(): String = s"$firstname $lastname is $age"
    def printhome(): Unit = println(s"HOME = $HOME")
    def printfullname(): Unit = println(this)

    printhome()
    printfullname()
    println("the end...")
  }

  val new_p = new new_person("Kim", "Carnes")
  new_p.age
  new_p.age = 36
  new_p
  new_p.printhome
  new_p.printfullname

  class Pizza(var crustSize: Int, var crustType: String)

  class Stock(val timeout: Int, val linger: Int) {
    override def toString = s"timeout: $timeout, linger: $linger"
  }

  class Address (
    var street1: String,
    var street2: String,
    var city: String,
    var state: String
  )

  val pizza = new Pizza(8, "Tasty")
  println(pizza)
  println(pizza.crustSize)
  println(pizza.crustType)

  val stock = new Stock(1000, 34)
  println(stock)
  println(stock.timeout)
  println(stock.linger)

  val address = new Address("One", "Main", "Flavortown", "Tasty")
  println(address)
  println(address.street1)
  println(address.street2)
  println(address.city)
  println(address.state)
}
