package kotlinNulls

fun getString():String?{
    return null
}

fun main() {
    //safe null operation.
    //if it is not null, else printing nothing
    println("1:")
    getString()?.let { println(it) }

    //
    println("2:")
    val x:Int?  = getString()?.length //return optional
    println(x)

}