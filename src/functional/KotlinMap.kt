package functional

fun main() {

    val myMap = mapOf<String, Int>("one" to 1, "two" to 2, "three" to 3)
    //destructing map so brace (key,value)
    myMap.filter { (key, value) -> key == "one" }.forEach { (key, value) -> println("$key $value") }

    val myList = listOf<Int>(1, 4, 6, 9, 10)

    //reduce a collection into a single value, according to lambada function.
    //no destruction; having no braces
    println(myList.reduce { result, value -> result + value })
}