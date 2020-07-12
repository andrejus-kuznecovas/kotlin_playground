package Chapter6

fun main() {
    var someCondition = true;

    val num = if (someCondition) 12 else 4

    val num2 = if (!someCondition) {
        println("im doing some logic here ")
        45
    } else {
        println("no logic found here")
        num * 45

    }
    println(num2)
}