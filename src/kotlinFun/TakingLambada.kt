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