package kotlinFun

//void --> Unit in Kotlin, can be ignored.
fun main(args: Array<String>) {
    //by default, in kotlin variable is un-nullable
    //val name = "my name"
    //nullable variable must be defined explicitly.
    val name: String? = null
    printAString(name)

    //this is a non-nullable variable, it won't accept null value.
    val anotherName: String  = ""
}

//kotlin may ignore void(unit)
fun printAString(value: String?) {
    println(value)
}
