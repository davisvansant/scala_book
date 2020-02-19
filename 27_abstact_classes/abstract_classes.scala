object abstract_classes extends App {
  // trait Animal(name: String)
  //
  // abstract_classes.scala:2: error: traits or objects may not have parameters
  // trait Animal(name: String)
  //             ^
  // one error found
  //

  abstract class Animal(name: String)

  abstract class Pet (name: String) {
    def speak(): Unit = println("Yo")
    def comeToMaster(): Unit
  }

  class Dog(name: String) extends Pet(name) {
    override def speak() = println("woof")
    def comeToMaster() = println("here I come!")
  }

  val d = new Dog("stinky")
  d.speak
  d.comeToMaster

  abstract class pet_two (name: String) {
    def speak: Unit = println(s"My name is $name")
  }

  class dog_two(name: String) extends pet_two(name)

  val d2 = new dog_two("Fido")
  d2.speak
}
