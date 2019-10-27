package kotlinNulls

fun takeAString(): String? {
    return "str"
}

fun main() {
//?.  null safe operator, it means if it is not null.
//let function: let{it}  let implements a lambada expression. it refers to the pre object.
// ?. null check if not null let do something .


    val str = takeAString()

}