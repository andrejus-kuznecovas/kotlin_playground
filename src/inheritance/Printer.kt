package inheritance

fun main() {
    val laserPrinter = LaserPrinter("Deskjet", 45)
    val uniqueLaserPrinter = SpecialLaserPrinter("Toshiba", 45)

}

abstract class Printer(val modelName: String) { //() is primary constructor
    open fun printModel() = println("Model name is $modelName")
    abstract fun printBestprice(): Double
}

open class LaserPrinter(modelName: String, pagesPerMinute: Int) : Printer(modelName) {
    final override fun printModel() = println("Laser model name is $modelName")
    override fun printBestprice(): Double = 54.0
}

class SpecialLaserPrinter(modelName: String, pagesPerMinute: Int) : LaserPrinter(modelName, pagesPerMinute) {
}

interface MyInterface {
    val number: Int
    val number2: Int
        get() = number * 100 //concrete implementation

    fun myFunction(str: String): String
}

interface MySubInterface : MyInterface {
    fun mySubFunction(num: Int): String
}

open class SomethingClass() : MySubInterface {
    override val number: Int = 45
    override fun mySubFunction(num: Int): String {
        TODO("Not yet implemented")
    }

    override fun myFunction(str: String): String {
        TODO("Not yet implemented")
    }
}

