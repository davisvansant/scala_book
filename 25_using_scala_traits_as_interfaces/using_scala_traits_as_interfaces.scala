object using_scala_traits_as_interfaces extends App {
  trait TailWagger {
    def startTail(): Unit
    def stopTail(): Unit
  }

  class Dog extends TailWagger {
    def startTail(): Unit = println("tail is wagging")
    def stopTail(): Unit = println("tail is stopped")
  }

  val d = new Dog
  d.startTail
  d.stopTail

  trait Speaker {
    def speak(): String
  }

  trait extended_TailWagger {
    def startTail(): Unit
    def stopTail(): Unit
  }

  trait Runner {
    def startRunning(): Unit
    def stopRunning(): Unit
  }

  class what_up_dog extends Speaker with extended_TailWagger with Runner {
    def speak(): String = "woof!"
    def startTail(): Unit = println("Tail is wagging")
    def stopTail(): Unit = println("tail is stopped")
    def startRunning(): Unit = println("I'm running")
    def stopRunning(): Unit = println("stopped running")
  }

  val new_d = new what_up_dog
  new_d.speak
  new_d.startTail
  new_d.stopTail
  new_d.startRunning
  new_d.stopRunning
}
