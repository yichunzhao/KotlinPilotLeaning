package kotlinFun

//single expression function, can have single only statement
//may setting a default value for a parameter; this may be achieved by overloading in java
fun addTwoNumber(num1: Double, num2: Double = 3.8): Double = num1 + num2

fun main() {
    printAString(addTwoNumber(12.2, 13.4).toString())

    //Double has a default toString method, just the same as the java.
    val sum = addTwoNumber(123.343, 33.223)
    println(sum)

    //using name parameter:
    //parameter equals can change the parameter order
    println(addTwoNumber(num2 = 23.0, num1 = 12.0))

    //using optional parameter:
    //providing num1 alone
    println(addTwoNumber(num1 = 23.0))
}
