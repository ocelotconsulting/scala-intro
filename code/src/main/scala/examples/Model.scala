package examples

case class Customer(id: Int, creditCardNumber: Option[String])

case class Item(id: Int,
                quantity: Int,
                taxable: Boolean,
                description: String,
                price: BigDecimal)

case class Cart(items: List[Item], customer: Option[Customer]) {
  private def sum(itemList: List[Item]) =
    itemList.map(item => item.price * item.quantity).sum

  def subTotal: BigDecimal = sum(items)

  def taxableSubTotal: BigDecimal = sum(items.filter(_.taxable))

  def creditCardNumber: Option[String] = customer.flatMap(_.creditCardNumber)

  // equivalent to above - uses for comprehension and type inference
  def creditCardNumber2 = for {
    c <- customer
    n <- c.creditCardNumber
  } yield n
}
