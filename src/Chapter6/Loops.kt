package Chapter6

fun main() {
    //normal ranges
    val range = 1..5 //1,2,3,4,5
    val charRange = 'a'..'z'
    val stringRange = "ABD".."XYZ"
    //backward ranges
    val backwardRange = 5.downTo(2)
    var backwardCharRange = 'z'.downTo('a')
    //Incremental ranges
    val stepRange = 3..15
    val stepThree = stepRange.step(3)
    val reversedRange = range.reversed()
    //array
    val seasons = arrayOf("spring", "Summer", "winter", "fall")

    //Prints
//    println(6 in range)
//    println('q' in charRange)
//    println('Q' in charRange)
//    println("CCCCCC" in stringRange)
//    println("XYYZZZ" in stringRange) //Compares range strings with first letter of string
//    println(stepThree)
    //For
    stepThree.forEach { }

    for (number in 200 downTo 50 step 50) {
    }

    for (season in seasons) {
    }

    seasonLoop@ for (index in seasons.indices) {
        //println(seasons[index])
        break@seasonLoop;
    }
    seasons.forEach { println(it) }
    seasons.forEachIndexed { index, value -> println("$value is season number $index") }
}


