# Infix notation

+ Any function of *arity* 1 can be invoked infix:

___main/scala/examples/Infix.scala

+ While this may seem inconsistent, in fact it unifies operators with method calls.  It's actually legal (albeit silly)
to write an arithmetic expression as a method call, e.g.: `x.+(y)`.
+ Scala more or less supports the C++ *operator overloading* feature, although it would be more accurate to say that
scala allows special characters in method names.
+ Some style guides frown on using infix with regular methods, but sometimes fewer parentheses can enhance readability. 
+ Clever use of infix notation can be used to implement DSLs in scala - e.g. scalatest:

___test/scala/examples/ScalaTestExampleSpec.scala
