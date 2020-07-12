EVERYTHING IN KOTLIN IS PUBLIC FINAL BY DEFAULT

fun main(args:Array<String>) -- default return type of a function is Unit (void)

fun main2(args:Array<String>) : Array<String> -- returns Array<String>

Functions with `{}` have "Block body"

Functions without `{}` have "Expression body" (one liners)

named arguments in functions -- myFunctionToAddNumbers(number1 = 4, number2 = 6);

fun doStuff(vararg payments:Int) -- variable number of payment received as Array. Only one vararg per function

Spread operator -- `*myArray` unpacks the array and passes elements as individual arguments
-------------------
Extension functions

fun String.upperFirstAndLastLetter(): String { return this.makeMagic()} -- appends function to String class
Util method as extension function for receiver type String class
----Inline functions
Works best with lambda parameters.
Inline function's body is directly generated into bytecode when the function is called rather than having function call
Usage -- inline fun myFunction():Unit{}
---Inheritance
Everything is final by default - so can't extend.
need to add `open/abstract class myClass` for functions also need open to override them
override also mean open
every constructor has to delegate to primary constructor
data classes cannot be open or abstract. But they can extend other classes and contain functions.
-----Interfaces
Interfaces extendable by default, no `open` needed
Interface properties do not have backing field like classes
---`object` keyword
Uses: Sigletons, companion object, Object Expressions.
There can only be one instance of Object class
Singleton -- When we want one and only one instance of a class during the run of application
    Created the first time that we use the instance. Object classes can extend or implement.
Companion Objects-- static doesn't exist in Kotlin. You can create CO inside classes and access them without instance of classes.
    You can use CO to call private constructors, implement Factory pattern
Anonymous Object (anonymous class in Java) -- instance is created, used and discarded. Multiple calls create multiple instance
-----------Enum
Use `enum class`  to declare enums
adding a function to enum forces to adding a `;` to the last enum value
--Imports
Packages don't have to match directory (but still lets match it)
--internal modifier
visible within the same module.
private -- visible within the same file.
--Notes 
When you declare var, kotlin generates set and get
When you declare val, kotlin generates only Get



