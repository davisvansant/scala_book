object an_oop_example extends App {
  import scala.collection.mutable.ArrayBuffer

  sealed trait Topping
  case object Cheese extends Topping
  case object Pepperoni extends Topping
  case object Sausage extends Topping
  case object Mushrooms extends Topping
  case object Onions extends Topping

  sealed trait CrustSize
  case object SmallCrustSize extends CrustSize
  case object MediumCrustSize extends CrustSize
  case object LargeCrustSize extends CrustSize

  sealed trait CrustType
  case object RegularCrustType extends CrustType
  case object ThinCrustType extends CrustType
  case object ThickCrustType extends CrustType

  class Pizza (
    var crustSize: CrustSize,
    var crustType: CrustType,
    var toppings : ArrayBuffer[Topping]
  ) {
    def addTopping(t: Topping): Unit = toppings += t
    def removeTopping(t: Topping): Unit = toppings -= t
    def removeAllToppings(): Unit = toppings.clear()

    override def toString(): String = {
      val toppingsString = for (t <- toppings) yield t
      s"""Pizza:
         |  Crust Size: $crustSize
         |  Crust Type: $crustType
         |  $toppingsString
       """.stripMargin
     }

    def getPrice(
      toppingsPrices: Map[Topping, Int],
      crustSizePrices: Map[CrustSize, Int],
      crustTypePrices: Map[CrustType, Int]
    ): Int = ???
  }

  class Order (
    var pizzas: ArrayBuffer[Pizza],
    var customer: Customer
  ) {
    def addPizza(p: Pizza): Unit = pizzas += p
    def removePizza(p: Pizza): Unit = pizzas -= p
    def getBasePrice(): Int = ???
    def getTaxes(): Int = ???
    def getTotalPrice(): Int = ???
    def printOrder(): Unit = {
      for (p <- pizzas) {
        println(p)
      }
    }
  }

  class Customer (
    var name: String,
    var phone: String,
    var Address: Address
  )

  class Address (
    var street1: String,
    var street2: String,
    var city: String,
    var state: String,
    var zipCode: String
  )

  val p1 = new Pizza (
    MediumCrustSize,
    ThinCrustType,
    ArrayBuffer(Cheese)
  )

  val p2 = new Pizza (
    LargeCrustSize,
    ThinCrustType,
    ArrayBuffer(Cheese, Pepperoni, Sausage)
  )

  val address = new Address (
    "123 Main Stree",
    "Apt. 1",
    "Talkeetna",
    "Alaska",
    "99676"
  )

  val customer = new Customer (
    "Alvin Alexander",
    "907-555-1212",
    address
  )

  val o = new Order (
    ArrayBuffer(p1, p2),
    customer
  )

  o.addPizza (
    new Pizza (
      SmallCrustSize,
      ThinCrustType,
      ArrayBuffer(Cheese, Mushrooms)
    )
  )

  o.printOrder


}
