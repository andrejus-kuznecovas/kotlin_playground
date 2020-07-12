package chapter7

fun main() {
    val myList = mutableListOf("hello", "bye")

    printAnyCollection(myList)
    myList[0].toUpperCase()
    //
    val intList = mutableListOf(45, 15, 78, 9, 5)
    val shortList: List<Short> = listOf(10, 20, 40)
}

inline fun <reified T> getElementOfType(list: List<Any>): List<T> {
    var newList: MutableList<T> = mutableListOf()
    for (e in list) {
        if (e is T) {
            newList.add(e)
        }
    }
    return newList
}

fun <T : Number> convertToInt(collection: List<T>) { //Only accepts number and it's subclasses
    for (num in collection) {
        num.toInt()
    }
}

fun <T> append(item1: T, item2: T) where T : CharSequence, T : Appendable {
    item1.append(item2)
}

fun <T : Any> printAnyCollection(collection: List<T>) {// <T:Any> indicates function uses generics
    for (item in collection) {
        println(item)
    }
}

fun <T> List<T>.printCollection() {//extension function
    for (item in this) {
        println(item)
    }
}