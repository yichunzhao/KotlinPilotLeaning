package optional

fun addTwoNumbers(num1: Double, num2: Double) = num1 + num2

fun methodTakeLambada(str: String, action: (String) -> Int) {
    println(action(str))
}

fun covertString2Int(str: String): Int = str.length

data class User(private val id: Long, private val name: String)

//using ? to declare an optional
fun findUserBy(id: Long): User? {
    val user: User?;  //immutable and nullable;
    if (id == 12L)
        user = User(12L, "mike") else {
        user = null
    }
    return user
}

fun main() {

    var name: String? = null    //it is a nullable variable
    println("my name is ${name?.toUpperCase()}") //string template

    //fun invocation {}
    println("sum = ${addTwoNumbers(1.2, 3.4)}")

    //fun take lambada as an argument parameter    functional interface
    //println("String to int : + ${methodTakeLambada("xx", covertString2Int) }")

    val found: User = findUserBy(12L) ?: throw NoSuchElementException("User is not found");
    println("The found user: ${found.toString()}")

}