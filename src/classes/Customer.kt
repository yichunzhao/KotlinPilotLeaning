package classes

import java.util.*

data class Customer(val id: UUID, val name: String, var address: String, var phoneNum: String) {
    constructor(id: UUID, name: String) : this(id, name, "", "")
}

fun main() {
    val customer = Customer(id=UUID.randomUUID(),name="mia")
    val customer1 = Customer(UUID.randomUUID(),name = "Jen")
    customer.address = "oki address"
    customer.phoneNum = "12345678910"

    customer1.address = "no the street"
    customer1.phoneNum = "5678910"

    println(customer.toString())
    println(customer1.toString())

}