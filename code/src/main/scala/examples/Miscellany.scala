package examples

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

object Miscellany extends App {
  // the body of a class, outside of any declaration
  // runs on construction (once in an object)
  println("in object constructor")

  // use a block to initialize a val
  // nest a function in there
  // go crazy
  val someComplexResult: Int = {
    def secretFn(x: Int, y: Int) = x + y + 37

    // last value in block is the result of the block
    secretFn(23, 16)
  }

  // default parameter value
  def add(left: Int, right: Int = 1) = left + right

  println(add(2))
  println(add(2, 2))

  // this is going to take a while so make it lazy
  lazy val aLazyValue = {
    var result = 0
    for (i <- 1 to 10000000) {
      result += i
    }
    result
  }

  // a basic async abstraction is Future
  // the calculation of 2 + 2 will be in a background thread
  // execution context passed implicitly
  val theFuture: Future[Int] = Future(2 + 2)

  theFuture onComplete println // print 4 when the calculation is done

  // we can use a for comprehension for async code
  val anotherFuture: Future[Int] = for {
    result <- theFuture
  } yield result + 1

  val sameThing = theFuture.map(_ + 1)
}
