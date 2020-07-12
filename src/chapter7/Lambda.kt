package chapter7

fun main() {
    //run { (println("Im in lambda")) }
    val employees = listOf(
        Employee("asda", 212),
        Employee("tom", 3123),
        Employee("Mike Hunt", 420)
    )

    println(employees.minBy { it.startYear })
    println(employees.minBy(Employee::startYear))

    run(::randomPrint)

}

data class Employee(val firstname: String, val startYear: Int)

fun useParameter(employees: List<Employee>, num: Int) {
    employees.forEach { (println(it.firstname)) }
}

fun randomPrint() = "random print"
