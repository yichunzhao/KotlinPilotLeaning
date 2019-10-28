package arraysAndForLoop

//Kotlin numbers
//for integer types: Byte(1-byte), Short(2-byte), Int(4-byte),Long(8-byte)
//for floating types: Float(4-byte); Double(8-byte)

//Array in kotlin is always mutable

fun main() {
    //Kotlin array is a class, different from the java
    val aryInteger: Array<Int> = arrayOf(1, 2, 32)
    //kotlin array is a class, having methods.
    println(aryInteger.contentDeepToString())
    println(aryInteger.all { it > 2 })
    println(aryInteger.filter { it>2 }) //return a list

    //primitive arrays, in kotlin can presented in a specific way
    byteArrayOf(1, 2, 3)
    intArrayOf(1, 2, 3)
    longArrayOf(12L, 13L)

    floatArrayOf(12f, 13f)
    doubleArrayOf(1.0, 2.0, 3.0)


}