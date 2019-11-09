package classes

//extension functions
fun String.toCapitalSentence(): String {
    return this[0].toUpperCase() + this.substring(1)
}

fun main() {
    //using extension functions
    val greeting = "greeting somebody"
    println(greeting.toCapitalSentence())
}