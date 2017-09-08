# Example app

We don't use the `new` keyword at all.  Case classes come with built-in factory methods:

___main/scala/examples/CalculateTotalExample.scala

+ An expression like `Customer(42, None)` is sugar for `Customer.apply(42, None)`.
+ `Some` and `None` are the two sub-types of Option. 
