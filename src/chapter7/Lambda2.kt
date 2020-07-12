package chapter7

fun main() {
    //run { (println("Im in lambda")) }
    val employees = listOf(
        Employee("asda", 212),
        Employee("tom", 3123),
        Employee("Mike Hunt", 420)
    )

}

fun countTo100() =
    with(StringBuilder()) {
        for (i in 1..99) {
            append(i)
            append(", ")
        }
        toString()
    }

fun countTo1000() =
    StringBuilder().apply {
        for (i in 1..99) {
            append(i)
            append(", ")
        }
    }.toString()


fun countTo99(): String {
    val numbers = StringBuilder()
    for (i in 1..99) {
        numbers.append(i)
        numbers.append(", ")
    }
    return numbers.toString()
}

