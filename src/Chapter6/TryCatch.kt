package Chapter6

fun main() {
    println(getNumber("22"))
    println(getNumber("NO"))
    println(getNumber(null))

    getNumber("22") ?: IllegalArgumentException("Number isn't an int") //elvis operator
}

fun getNumber(str: String?): Int? {
    return try {
        Integer.parseInt(str)
    } catch (e: NumberFormatException) {
        null
    } finally {
        println("Finally here")
    }
}