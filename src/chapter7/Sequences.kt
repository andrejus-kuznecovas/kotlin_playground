package chapter7

fun main() {
    val immutableMap = mapOf(
        1 to Car("green", "toyota"),
        2 to Car("red", "Honda"),
        3 to Car("Yellow", "Tesla"),
        17 to Car("brown", "bmw")
    )

    val colorMap = immutableMap.map { it.value.color }
    immutableMap.filter { it.value.model == "bmw" }.map { it.key }


    immutableMap.asSequence()
        .map { it.value.color }
        .toList()


}
