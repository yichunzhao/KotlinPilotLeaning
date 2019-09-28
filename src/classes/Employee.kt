package classes

import java.time.LocalDateTime
import java.util.UUID

data class Employee(val id: UUID, val employeeId: String, val firstName: String, val lastName: String) //primary constructor

data class Vocation(val id:UUID,val employeeId: String, val startDate:LocalDateTime, val endingDate:LocalDateTime)

fun main() {

    val mike: Employee = Employee(UUID.randomUUID(), "123@yahoo.com", "mike", "Yang")

    println("mike ${mike.toString()}")

}