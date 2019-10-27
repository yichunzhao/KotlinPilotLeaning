package hash

class CD(val name: String, val singer: String)

data class Book(val name: String, val author: String)


fun main() {
    val myBook: Book = Book("first flight", "xyz")
    println(myBook.hashCode())

    val hisBOok = Book("first flight", "xyz")
    println(hisBOok.hashCode())

    val myCD: CD = CD("first Song", "yfz")
    val hisCD: CD = CD("first Song", "yfz")
    println(myCD.hashCode())
    println(hisCD.hashCode())



}