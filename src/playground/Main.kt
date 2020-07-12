package playground

typealias SetOfEmployees = Set<Employee>

fun main() {
    val employeeOne = Employee("Mary", 1)
    val employeeTwo = Employee("Mary", 1)
    val employeeThree = Employee("Mary", 2)

    println(employeeOne == employeeTwo)
    println(employeeOne === employeeTwo)
    println(employeeOne == employeeThree)
    println(employeeOne.equals(employeeTwo)) //true
    println(employeeOne.equals(employeeThree)) //false

    val someObject: Any = employeeOne
    if (someObject is Employee) {
        val newEmployee = someObject as Employee

    }
    val number: Int = 20
    val number2 = 100
    val employee1 = Employee("Dude", 500)
    val employee2: Employee

    employee1.name = "Dude2"

    val employees: SetOfEmployees = emptySet()
    employees.size

    val change = 4.55
    println("\$change=$change")


}

class Employee(var name: String, val id: Int) {

    override fun equals(obj: Any?): Boolean {
        if (obj is Employee) {
            return name == obj.name && id == obj.id
        }
        return false
    }

    override fun toString(): String {
        return "Employee(name=$name, id=$id)"
    }

}