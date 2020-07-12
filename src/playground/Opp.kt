package playground

val MY_CONSTANT = 100
fun main() {
    var emp = Employees("part time guy", false)
    println(emp.firstName);
}

data class Car(val color: String, val model: String, val year: Int) {
    
}

private class Employees(val firstName: String, fullTime: Boolean = true) {
    var fullTime = fullTime
        get() {
            println("custom get")
            return field
        }
        set(value) {
            println("running custom set")
            field = value
        }

}

