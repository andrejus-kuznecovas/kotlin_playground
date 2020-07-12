package task

fun main() {
    val bike = MountainBicycle(45, 12, 45, 45, "Red")
    bike.speed
}

open class Bicycle(var cadence: Int, var speed: Int, var gear: Int) {
    fun applyBrake(decrement: Int) {
        speed -= decrement
    }

    fun speedUp(increment: Int) {
        speed += increment
    }
}

class MountainBicycle(cadence: Int, speed: Int, gear: Int, var seatHeight: Int) : Bicycle(cadence, speed, gear) {
    constructor(cadence: Int, speed: Int, gear: Int, seatHeight: Int, color: String) : this(
        cadence,
        speed,
        gear,
        seatHeight
    ) {
        println(color)
    }
}

class RoadBike(val tireWidth: Int, cadence: Int, speed: Int, gear: Int) : Bicycle(cadence, speed, gear)
