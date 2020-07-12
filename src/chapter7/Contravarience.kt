package chapter7

fun main() {
    val roseTender = object : FlowerCare<Rose> {
        override fun prune(flower: Rose) {
            println("")
        }
    }
    val roseGarden = Garden2<Rose>(listOf(Rose(), Rose()), roseTender)

}

class Garden2<T : Flower2>(val flowers: List<T>, val flowerCare: FlowerCare<T>) {
    fun pickFlower(i: Int) = flowers[i]
}

open class Flower2()

class Rose : Flower2()

interface FlowerCare<in T> { //Contravarience here
    fun prune(flower: T)
}