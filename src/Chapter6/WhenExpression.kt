package Chapter6

import java.math.BigDecimal

enum class Season {
    SPRING, SUMMER, FALL, WINTER
}

fun main() {

    var someObj: Any = 45
    var y = 45

    val obj1: Any = "Im Any string"
    val obj: Any = BigDecimal(65)

    when (someObj) {
        45 -> println()
        else -> println("Doesn't match")
    }
    val z = when (someObj) {
        40, 41, 42 -> {
            println("Between 40 and 42")
            2
        }
        in 100..200 -> println("Between 100 and 200")
        y + 45 -> println("sum of $y and 45")
        is Int -> println(someObj.minus(45))
        is String -> println(someObj.toUpperCase())
        else -> println("Doesn't match")
    }

}