object enumerations extends App {

  sealed trait DaysOfWeek
  case object Sunday extends DaysOfWeek
  case object Monday extends DaysOfWeek
  case object Tuesday extends DaysOfWeek
  case object Wednesday extends DaysOfWeek
  case object Thursday extends DaysOfWeek
  case object Friday extends DaysOfWeek

  sealed trait Suit
  case object Clubs extends Suit
  case object Spades extends Suit
  case object Diamonds extends Suit
  case object Heart extends Suit

  sealed trait Topping
  case object Cheese extends Topping
  case object Pepperoni extends Topping
  case object Sausage extends Topping
  case object Mushrooms extends Topping

  sealed trait CrustSize
  case object SmallCrustSize extends CrustSize
  case object MediumCrustSize extends CrustSize
  case object LargeCrustSize extends CrustSize

  sealed trait CrustType
  case object RegularCrustType extends CrustType
  case object ThinCrustType extends CrustType
  case object LargeCrustType extends CrustType

  class Pizza (
    var CrustSize: CrustSize = MediumCrustSize,
    var CrustType: CrustType = RegularCrustType
  ) {
    val toppings = scala.collection.mutable.ArrayBuffer[Topping]()

    def addTopping(t: Topping): Unit = toppings += t
    def removeTopping(t: Topping): Unit = toppings += t
    def removingAllToppings(): Unit = toppings.clear()
  }

}
