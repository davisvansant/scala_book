
object traits extends App {

  trait Speaker {
    def speak(): String
  }

  trait TailWagger {
    def startTail(): Unit = println("tail is wagging")
    def stopTail(): Unit = println("tail is stopped")
  }

  trait Runner {
    def startRunning(): Unit = println("I'm running")
    def stopRunning(): Unit = println("Stopped running")
  }

  class Dog(name: String) extends Speaker with TailWagger with Runner {
    def speak(): String = "Woof!"
  }

  class Cat extends Speaker with TailWagger with Runner {
    def speak(): String = "Meow"
    override def startRunning(): Unit = println("Yeah ... I dont run")
    override def stopRunning(): Unit = println("no need to stop")
  }

  val tw = new TailWagger {}
  tw.startTail
  tw.stopTail

  val r = new Runner {}
  r.startRunning
  r.stopRunning

  val d = new Dog("Awesome")
  println(d.speak)

  val c = new Cat
  println(c.speak)
  c.startRunning
  c.stopRunning
}
