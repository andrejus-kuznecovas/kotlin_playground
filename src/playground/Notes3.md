#LOOPS
Ranges - (1..5)('a'..'z') can be used for int, char, string
can be backwards
Numeric ranges have much more functionalities than String ranges and other types of ranges
When using for loops, data which you iterate must have iterator (String ranges do not have)
for (number in range downTo/until endNum step 10)
Not in -- 15 !in 1..10 == true
for(index in array.indices)
array.forEach{ prinln(it) } -- it's lambda
It's possible to give loops NAMES. @myLoop for(i in array). continue/break@myLoop
#If statement/expression
If can evaluate to a value (unlike Java). -- num = if(smth) 15 else 45
Expression must have if/else. Can be one liners or block( for more logic)
#When expression (switch of java)
when(num){ 45 -> dostuff }. We don't need break, compiler adds it.
Can use expressions, ranges, smart casting(when variable `is` some type)
When expression can also be assigned to a variable
Enum+when don't need else, otherwise else is needed (if assigning to variable)
When doesn't need variable in brackets -- just when {}
#Try/catch
Can be used as expression.
Kotlin doesnt check between checked and unchecked exceptions
No value can be returned from finally block of try/catch
-------------Chap 7
#Lambda
Can be run directly using `run` function.
Data classes override toString nicely.
When there is only one parameter, we can use `it`. -- employees.minBy {employee -> employees.startYear} == employees.minBy(it.startYear)
You can access all variables in lambda calls 
Can call top level functions run(::randomPrint) (member reference)
#Lambda with receiver
Receiver object -- object that has been passed to Lambda expression
when using `with`, we don't have to refer to the instance when we call it's member functions
Basically we can change instance without naming it or adding this.instance.
'apply' function is the same as 'with', just it always returns the receiver object
`return` from inlined lambdas also returns from the function it's called in.
You can have local return by adding `label@` and using `return@label`.
You can also use labels to call receiver objects of nested lambdas.

#Lists
All Collections take a generic type and all the read only interfaces are covariant.
Covariant -- you can treat a class as their parent classes.
Lists and ImutableLists. NotNullList doesn't add nulls to it.
Kotlin added list functions - last(), asReversed(), getOrNull(), max(), zip().
zip() - combines two list together and creates a list of Pairs, drops excess elements.
use list.union(otherlist)  to remove duplicates when combining lists
myList.distinct()  to remove duplicate entries in a list
#Maps
Just as lists, can be mutable or immutable.
immutableMap, mutamble map -- java.util.LinkedHashMap
Destructuring declaration -- taking instance's variables and distributing them.
val (firstPairValueHere, secondValue) = pair
To allow destructuring classes have to implement component functions
Data classes automatically get structuring declarations, as well as get
#Sets
add values by using mySet.plus(value), .minus(value), .average(), drop(3) (drops first 3 entries), 
#Collection functions
`filter` returns new instance of collection, doesn't change collection itself
'map' do something for each item in array
`all`, `any`, `count`, `find`, `groupBy`, `toSortedMap()`, `sortedBy` work as you expect
#sequences
To avoid intermediate collection creation or when you don't know how large collection will me. For example during .filter().map.filter.map....
Sequences are Kotlin's stream() function
No need to use sequences unless collection size is large and creates a lot of intermediate results
Need to end the asSequence with toList() or smth like that, same as Collectors.toList
#Generics
Generics are compile time feature.
Give compiler a hint of what types of objects collection is dealing with.
<T> == <T: Any?>. Add <T: Any> to make it not nullable
fun <T> printAnyType (colletion:List<T>)
fun <T> append(item1: T, item2: T) where T : CharSequence, T : Appendable
listAny is List<*> - star projection
#Reification
Kotlin feature which prevents type from being erased at runtime, for example with generics.
inline fun <reified T> getElementOfType(list: List<Any>): List<T> {
Use reification to check a instance type inside a function

#Covarience
subclass is not the same as subtype.
Short is a subclass of Number
Short is not a subtype of Number
We have to declare parameter as covariant to preserve subtyping to use subtypes of types
Looking down inheritence tree
Immutable lists are covariant, mutable are not covariant
If we want a class accept subtypes by adding `out` keyword
If we add `out` and make it covariant it can only use it in `out` positions (not `in`)
Function parameters - in position, function return - out position
We restrict by adding `out`, then it can only be used return, not input.
#Contravarience
Opposite of covariance. 
Contraveriance preserves instances of subclass and any of it's superclasses.
Looking up inheritence tree.
Do this by adding `in`.
Comes with price - we can't use return types, only input types. Because we are not guaranteed to get the type that we want
Basically `in`/`out` follow Liskov's Substitution principle with 
#Use-Site variance
Using `out` / `in` in methods
fun <T: Car> copyCars(source: MutableList<out T>, destination:MutableList<in T>){}