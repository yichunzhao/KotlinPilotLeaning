package kotlinNulls

fun main() {
    //We need think of a variable that could be null or not nullable.
    //define null or not nullable
    var name: String? = null //nullable string

    //null-safe operator . if the name is not null, then call its method
    println("$name".toUpperCase())
    println(name?.toUpperCase())

    //Non-Null Asserted Operator, if this null, then throw null pointer exception
    //use with caution
    println(name!!.toUpperCase())

    //it is a var with a nothing type; if a var declaring no type
    var address = null  //address is a nothing instance
    //nothing is an instance,
    //however it cannot be re-assigned to another instance
}

