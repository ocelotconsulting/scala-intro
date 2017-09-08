# Functions

+ The `apply` method indicates that an object can be invoked as a function.

___main/scala/examples/CalculateTotal.scala

+ The `object` keyword creates a singleton object.  You can declare types with `class`/`trait`/`type`.  When you 
declare and object in the same file as a class or trait with the same name, it's called a *companion* object.  This
pattern is widely used.
+ Many objects and types can be functions.  For example a `Seq` (e.g. List) is a function of `Int => T` 
where the argument is the index.  A `Set` is a function of `T => Boolean`.  Companion objects are often factory 
functions - e.g. `Option(x)` return an instance of `Some` if the argument is non-null or the object `None` if the 
argument is null.  
