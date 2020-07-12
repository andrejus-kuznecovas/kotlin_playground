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