package collections

data class User(val name: String)

fun main() {
    val find = listOf<Int>(23, 43, 23).find { x -> x > 100 }
    println(find)

    println(listOf<Int>(12, 455, 4545).lastOrNull())

    val muList = mutableListOf<User>(User("Yang"), User("Liu"), User("An"))
    muList.add(User("Wang"))

    println(muList)
    println("sorted: ${muList.sortedBy { u -> u.name }}")
}