package Collections

import kotlin.random.Random

class DemoList {

}

fun main() {
    val find = listOf<Int>(23, 43, 23).find { x -> x > 100 }
    println(find)

    println(listOf<Int>(12,455,4545).lastOrNull())



    var result: Any
    val randomNumber = Random(12)
    println(randomNumber)
}