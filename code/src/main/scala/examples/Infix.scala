package examples

object Infix extends App {
  val names = List("Huey", "Dewey", "Louie")

  // the same as names.foreach(n => println(n))
  names foreach println
}
