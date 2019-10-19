package kotlinFun


//single expression function, can have single only statement
fun addTwoNumber(num1: Double, num2: Double): Double = num1 + num2

fun main() {
    printAString(addTwoNumber(12.2, 13.4).toString())

    //Double has a default toString method, just the same as the java.
    val sum = addTwoNumber(123.343, 33.223)
    println(sum)
}
