package chapter7

fun main() {
    val shortList: MutableList<Short> = mutableListOf(1, 2, 3)
}

fun convertToInt2(collection: MutableList<Number>) {
    for (num in collection) {
        num.toInt()
    }
}

open class Flower {

}
 
class Garden<out T : Flower> {
    val flowers: List<T> = listOf()

    fun pickFLower(i: Int): T = flowers[i]
    fun plantFlower(flower: @UnsafeVariance T) { //doesn't let use flower:T

    }
}