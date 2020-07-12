package task

fun main() {
    for (number in -500..0) {
        println(number)
    }

    val fibArray = Array(15) { i -> i + 12 }

    var total: Int
    var secondToLast = 0
    var last = 1

    for (i in 1..13) { //Fib Seq
        total = secondToLast + last
        println(total)
        secondToLast = last
        last = total
    }
}
