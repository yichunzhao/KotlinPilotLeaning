package kotlinFun

//void --> Unit in Kotlin, can be ignored.
fun main(args: Array<String>) {
    //by default, in kotlin variable is un-nullable
    //val name = "my name"
    //nullable variable must be defined explicitly.
    var name: String? = null
    printAString(name)  //name is null; and print out null

    //null safety operator
    printAString(name?.toUpperCase())//null safe operation, print it as null

    //nothing class; what is a nothing type, because there is not specific type being declared.
    //nothing has no instance
    val what = null  //this is not allowed in java
    printAString(what)

    //nonnull assertion, it throws KotlinNullPointerException
    printAString(name!!.toUpperCase())
}

//kotlin may ignore void(unit)
fun printAString(value: String?) {
    println(value)
}
