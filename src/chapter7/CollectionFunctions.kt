package chapter7

fun main() {
    val setInts = setOf(45, 12, 45, 66, 87, 98, 10, 56, 58) //duplicated values are ignored
    val immutableMap = mapOf(
        1 to Car("green", "toyota"),
        2 to Car("red", "Honda"),
        3 to Car("Yellow", "Tesla"),
        17 to Car("brown", "bmw")
    )

    val mutableMap = mutableMapOf(
        1 to Car("green", "toyota"),
        2 to Car("red", "Honda"),
        3 to Car("Yellow", "Tesla")
    )

    //filtering
    println(setInts.filter { it % 2 != 0 })

    println(immutableMap.filter { it.value.color == "green" })

    println(mutableMap.filter { it.value.color == "red" })

    //mapping
    val ints = arrayOf(1, 2, 3, 4, 56, 4)
    val add10List = ints.map { it + 10 }

    val colorMap = immutableMap.map { it.value.color }
    immutableMap.filter { it.value.model == "bmw" }.map { it.key }

    //Check if all/any/count
    immutableMap.all { it.value.model.isNotBlank() }
    immutableMap.any { it.value.model == "ford" }
    immutableMap.count { it.value.color == "brown" }

    val carsOnly = immutableMap.values
    carsOnly.find { it.color == "brown" }

    carsOnly.groupBy { it.color }
}




