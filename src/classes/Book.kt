package classes

class Book {

    var title: String
        get() {
            return title
        }
        set(value) {
            this.title = value
        }
}

fun main() {
    val myBook = Book()
    myBook.title = "blab"
    println(myBook.title)

}