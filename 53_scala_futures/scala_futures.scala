// package scala_futures

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.{Failure, Success}

object scala_futures extends App {
  val startTime = CurrentTime

  val aaplFuture = getStockPrice("AAPL")
  val amznFuture = getStockPrice("AMZN")
  val googFuture = getStockPrice("GOOG")

  val result: Future[(Double, Double, Double)] = for {
    aapl <- aaplFuture
    amzn <- amznFuture
    goog <- googFuture
  } yield (aapl, amzn, goog)

  result.onComplete {
    case Success(x) => {
      val totalTime = deltaTime(startTime)
      println(s"In Success case, time delta: ${totalTime}")
      println(s"The stock prices are: $x")
    }
    case Failure(e) => e.printStackTrace
  }
  sleep(5000)

  def sleep(time: Long): Unit = Thread.sleep(time)

  def getStockPrice(stockSymbol: String): Future[Double] = Future {
    val r = scala.util.Random
    val randomSleepTime = r.nextInt(3000)
    val randomPrice = r.nextDouble * 1000
    sleep(randomSleepTime)
    randomPrice
  }
  def CurrentTime = System.currentTimeMillis()
  def deltaTime(t0: Long) = CurrentTime - t0
}
