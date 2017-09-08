# My Take on Scala

Scala is a lot of fun to write in.  Whether it's the best choice for a particular use case is another matter.

It's certainly possible to lift and shift your OO code patterns from Java/C# to Scala but IMO it's far cleaner to just
embrace FP.  Not every problem is best solved with OO - IMO most are better solved procedurally, with a functional style.

## Thumbs up

+ Designed for FP and immutability
+ Better compile time safety than other statically typed languages
+ No null checks
+ Pattern matching
+ Case classes
+ For comprehensions
+ Futures and future combinators
+ Fewer useless abstractions - use functions!
+ No checked exceptions
+ A few great libs like Scalatra, Play

## Mixed bag

+ Operators and infix notation
+ SBT
+ Macros
+ Traits with multiple inheritance
+ DSLs
+ Java interop and open-source libraries via Maven Central, etc.
+ Libraries like Akka, Slick
+ Actors

## Thumbs down

+ Compiler can be slow
+ Using an API can be more difficult because your IDE will be less useful
+ Not a lot of diversity in the ecosystem - mainly Lightbend
+ Enables some esoteric design patterns like type classes
