package chapter7

import java.util.stream.Collectors

fun main() {
    val seasonList = listOf("Spring", "Winter", "fall")
    println(seasonList.javaClass)

    val emptyList: List<String> = emptyList()

    val notNullList = listOfNotNull("hello", null, "goodbue")
    println(notNullList) //full was never added to the list

    val mutableList = mutableListOf<Int>(1, 2, 3, 4) //java.util.ArrayList
    mutableList.add(45)

    val array = arrayOf("Black", "green")
    val colorList = listOf(*array) //or array.toList()
    val blackList = colorList.stream().filter { color -> color == "Black" }.collect(Collectors.toList())

    //Kotlin added list functions
    colorList.last()
    colorList.asReversed()
    colorList.getOrNull(45)
    //combined list
    colorList.zip(blackList)
    val combinedList = colorList + blackList//concat lists

    val noDuplicatesList = colorList.union(blackList)

}