package examples

class CalculateTotal(taxRate: BigDecimal) {
  def apply(cart: Cart): BigDecimal =
    cart.subTotal + (cart.taxableSubTotal * taxRate)
}

object CalculateTotal extends CalculateTotal(DefaultTaxRate)

// both of these statements are equivalent:
// CalculateTotal(cart)
// CalculateTotal.apply(cart)