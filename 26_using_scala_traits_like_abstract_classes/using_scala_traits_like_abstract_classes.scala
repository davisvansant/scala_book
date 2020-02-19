object using_scala_traits_like_abstract_classes extends App {
  trait Pet {
    def speak = println("Yo")
    def comeToMaster(): Unit
  }

  class Dog(name: String) extends Pet {
    def comeToMaster(): Unit = println("here I come!")
  }

  val d = new Dog("Zeus")
  d.speak
  d.comeToMaster

  class Cat extends Pet {
    override def speak(): Unit = println("meow")
    def comeToMaster(): Unit = println("not gonna happen...")
  }

  val c = new Cat
  c.speak
  c.comeToMaster

  trait Speaker {
    def speak(): String
  }

  trait TailWagger {
    def startTail(): Unit = println("tail is wagging")
    def stopTail(): Unit = println("tail is stopped")
  }

  trait Runner {
    def startRunning(): Unit = println("I'm running")
    def stopRunning(): Unit = println("stopped running")
  }

  class new_Dog(name: String) extends Speaker with TailWagger with Runner {
    def speak(): String = "woof!"
  }

  class new_Cat(name: String) extends Speaker with TailWagger with Runner {
    def speak(): String = "Meow"
    override def startRunning(): Unit = println("Yeah...I dont run")
    override def stopRunning(): Unit = println("no need to stop")
  }

  val d2 = new new_Dog("Rover")
  d2.speak
  d2.startRunning
  d2.startTail

  val c2 = new new_Cat("Mr Business")
  c2.speak
  c2.startRunning
  c2.startTail

  val d3 = new new_Dog("stanker") with TailWagger with Runner
  d3.startTail
  d3.startRunning
}
