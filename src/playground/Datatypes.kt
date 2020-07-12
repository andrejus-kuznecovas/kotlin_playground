package playground

import java.math.BigDecimal

fun main() {
    val names = arrayOf("Joe", "Rogan")

    val longs = arrayOf<Long>(1, 2, 3, 4)

    println(longs[1])

    val evens = Array<Long>(16) { i -> i * 2L }
    for (number in evens) {
        println(number)
    }

    val mixedArray = arrayOf("hello", 22, BigDecimal(100), 'a')
    val intArray2 = intArrayOf()

    var str: String? = "not null"
    str?.toUpperCase()
}