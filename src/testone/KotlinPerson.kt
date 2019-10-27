package testone

import java.time.LocalDate
import java.time.Month

data class KotlinPerson(
    val id: Long,
    val title: String,
    val firstName: String,
    val surname: String,
    val dateOfBirth: LocalDate?
) {

    override fun toString(): String {
        return "$title $firstName $surname"
    }

    // property like in the C sharp.
    val age: Int //read only, public read-only
        get() = getAge(dateOfBirth) //return instance age value.

    companion object {
        fun getAge(dateOfBirth: LocalDate?): Int {
            //kotlin ternary ref. to Java
            return if (dateOfBirth != null) LocalDate.now().year - dateOfBirth.year else -1
        }
    }

}

fun main() {

    val person1 = KotlinPerson(
        id = 1L,
        title = "student",
        firstName = "mike",
        surname = "s1",
        dateOfBirth = LocalDate.of(1971, Month.JANUARY, 1)
    )

    println(person1.toString())
    println(person1.hashCode())
    println(person1.age)

    val person2 = KotlinPerson(
        id = 2L,
        surname = "s1",
        firstName = "mia",
        title = "teaching",
        dateOfBirth = null
    )


}