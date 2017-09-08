package examples

object CalculateTotalExample extends App {
  val cart = Cart(
    items = List(
      Item(1, 1, taxable = true, description = "55lb drum of lard", 24.99),
      Item(2, 2, taxable = false, description = "Packet of gravel", 0.99)
    ),
    customer = Some(Customer(42, None))
  )

  println(cart.creditCardNumber.getOrElse("(not provided)"))
  println(s"sub-total: ${cart.subTotal}")
  println(s"total: ${CalculateTotal(cart)}")
}
