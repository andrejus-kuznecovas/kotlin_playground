package chapter7

fun main() {
    val immutableMap = mapOf(
        1 to Car("green", "toyota"),
        2 to Car("red", "Honda"),
        3 to Car("Yellow", "Tesla")
    )

    val mutableMap = mutableMapOf(
        "First car" to Car("green", "toyota"),
        "Tom's car" to Car("Yellow", "Tesla"),
        "Jerry's car" to Car("red", "Honda")
    )

    val setInts = setOf(10, 45)
    setInts.plus(20)
    val pair = Pair(10, "ten")
    val (firstPairValueHere, secondValue) = pair //destributing values
    //println(firstPairValueHere)

    for ((key, value) in mutableMap) {//destructuring
        //println("$key ${value}")
    }

    val car = Car("blue", "Tesla")
    val (color, model) = car
}

class Car(val color: String, val model: String) {
    operator fun component1() = color //implement component functions to allow destructuring
    operator fun component2() = model // data classes get these automatically
}