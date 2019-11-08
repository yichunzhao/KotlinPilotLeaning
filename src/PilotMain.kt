fun checkString(str: String): String {
    return if (str != null) "yes" else "no"//like java ternary.
}

fun main() {
    val name = "ynz"  //final(immutable) variable
    //string parameter template
    println("my initials $name") //
    println("my initials length ${name.length}")

    println(checkString(name))
}
