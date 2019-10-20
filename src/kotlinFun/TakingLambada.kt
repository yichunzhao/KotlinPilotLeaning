package kotlinFun


fun main() {

}

//how to take a lambada expression in a fun
//in Java way
fun funTakingLambada(input: String, action: java.util.function.Function<String, Int>) {
    println(action.apply(input))
}

//in Kotlin way
fun kotlinTakingLambada(input: String, action: (String) -> Int): Int {
    return action(input)
}

//kotlin provides quite a much better lambada expression than java
fun kotlinTakingLambadaReturnString(input: String, action: (String) -> String): String {
    return action(input)
}