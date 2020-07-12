package playground

fun main() {
    println(labelMultiply(3, 4, "The result is here:"))
    println(labelMultiplySimplified(3, 4))
    /**/
    val employee = YellingEmployee("Tom")
    //println(employee.upperCaseFirstName())
    /*vararg*/
    val car1 = CarData("Blue", "Jaguar", 2012)
    val car2 = CarData("Red", "Mustang", 4512)
    val car3 = CarData("Green", "Soprano", 1233)
    //printColors(car1, car2, car3, inputData = "Color is:")
    /*spead operator*/
    val manyCars = arrayOf(car1, car2, car3)
    //printModels(*manyCars) //spread operator *
    // Extension functions
    val lowerCaseString = "this is lower case"
    println(lowerCaseString.upperFirstAndLastLetter())

}


fun labelMultiplySimplified(
    operand1: Int, operand2: Int,
    label: String = "The simplified  answer is"
) =
    "$label ${operand1 * operand2}"

class YellingEmployee(val firstName: String) {
    fun upperCaseFirstName() = firstName.toUpperCase()
}

data class CarData(val color: String, val model: String, val year: Int) {

}

fun printColors(vararg cars: CarData, inputData: String) {
    for (car in cars) {
        println("$inputData ${car.color}")
    }
}

fun printModels(vararg cars: CarData) {
    for (car in cars) {
        println(car.model)
    }
}

//Util method as extension function for receiver type String class
fun String.upperFirstAndLastLetter(): String {
    val firstLetter = this.substring(0, 1).toUpperCase() + substring(1) //didn't use this.substring
    return firstLetter.substring(0, firstLetter.length - 1) + firstLetter.substring(
        firstLetter.length - 1,
        firstLetter.length
    ).toUpperCase()
}

//Inline function
inline fun labelMultiply(operand1: Int, operand2: Int, label: String): String {
    return ("$label ${operand1 * operand2}")
}