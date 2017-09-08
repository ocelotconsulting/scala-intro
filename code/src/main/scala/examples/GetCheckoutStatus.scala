package examples

object GetCheckoutStatus extends (Cart => (Boolean, String)) {
  override def apply(cart: Cart): (Boolean, String) = cart match {
    case Cart(_, None) =>
      false -> "customer is not logged in"
    case Cart(Nil, _) =>
      false -> "cart is empty"
    case Cart(_, Some(Customer(_, None))) =>
      false -> "credit card number missing"
    case _ =>
      true -> "ready to check out"
  }
}
