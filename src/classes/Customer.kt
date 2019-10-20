package classes

import java.util.*

//Primary constructor
//By default all attributes are public and offering public getters and setters
//Private attributes must be explicit.
data class Customer(var id: UUID, val name: String = "Yang", var address: String, var phoneNum: String) {

    //Kotlin uses keyword to present a constructor, different from the Java using the name same as the class name.
    //2rd constructor, it still depends on the primary constructor; this is different from java overloading
    constructor(id: UUID, name: String) : this(id, name, "", "")

    //primary constructor init block
    init {
        //do init. here
        id = UUID.randomUUID()
        println(id)
    }
}

fun main() {
    val customer = Customer(id = UUID.randomUUID(), name = "mia")
    val customer1 = Customer(UUID.randomUUID(), name = "Jen")

    customer.address = "oki address"
    customer.phoneNum = "12345678910"

    customer1.address = "no the street"
    customer1.phoneNum = "5678910"

    println(customer.toString())
    println(customer1.toString())
}