# Code example

___main/scala/examples/Model.scala

+ Unlike Java, you can declare multiple public classes in a source file which can be named arbitrarily.
+ Constructor arguments are called 'class arguments'.  In case classes they default to public `val` fields.
+ Functions and methods are declared with `def`  No-argument functions without side effects are typically invoked
  without parentheses (e.g. `item.price`).  You rarely need to use `return` in a function.
+ Variables are never nullable in canonical Scala.  We use `Option` instead.
+ Type parameters are included in square braces rather than angle braces.
+ A lot of types, functions, etc. are imported by default (e.g. `Option`, `BigDecimal`, `List`).
+ Type annotations are generally optional whenever possible (see `creditCardNumber2`), but generally are included
  for public method return types.
+ Lambdas can use the familiar arrow notation (`item => item.price * item.quantity`) or the underscore 
  shorthand (`_.creditCardNumber`). 
