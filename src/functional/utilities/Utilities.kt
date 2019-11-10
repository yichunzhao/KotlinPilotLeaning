package functional.utilities

fun toSentenceCase(input: String): String {
    return input[0].toUpperCase() + input.substring(1)
}

fun main() {
    val input = "this is an input."
    println(toSentenceCase(input))
}