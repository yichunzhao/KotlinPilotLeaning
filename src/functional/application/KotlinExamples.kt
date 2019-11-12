package functional.application

fun applyFunctionToString(input: String, myFunction: (String) -> String): String {
    return myFunction(input)
}

fun convertStringCapital(input: String):String{
    return input.toUpperCase()
}

fun main() {
    val input = "hello world"
    val applied = applyFunctionToString(input) { x -> x[0].toUpperCase() + x.substring(1) }
    println(applied)

    //function reflection
    println(applyFunctionToString(input,::convertStringCapital))
}