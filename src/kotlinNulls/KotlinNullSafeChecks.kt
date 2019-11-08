package kotlinNulls

fun takeAString(): String? {
    return null
}

fun takeAsInt():Int?{
    return null
}

fun main() {
//?.  null safe operator, it means if it is not null.
//let function: let{it}  let implements a lambada expression. it refers to the pre object.
// ?. null check if not null let do something .
    val str = takeAString()

    //safe call .?
    val r = takeAString()?.length
    println(r)

    val p = takeAsInt()?.toDouble()
    println(p)

    takeAString()?.let { println(it) }  //not null let do something, otherwise do nothing

}