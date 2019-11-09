package classes

import java.util.*

//Primary constructor: without access modifier are public and offering public getters and setters
//data class offers toString(), hashCode(), equalTo() etc as using Lombok @data
data class Customer(
    val id: UUID,
    val name: String,
    val address: String,
    val phoneNum: String,
    val age: Int
) {
    var approved: Boolean = false
        //how to overriding the getters and setters ???
        set(value) {
            if (age > 20) {
                field = true
            } else {
                println("is not old enough.")
            }
        }

    //Kotlin uses keyword to present a constructor, different from the Java using the name same as the class name.
    //for the primary constructor, keyword can be ignored
    //2rd constructor, it still depends on the primary constructor; this is different from java overloading
    constructor(id: UUID, name: String) : this(id, name, "", "", 0)

    //primary constructor init block
    init {
        println("do init. here")
        println("default id $id")
    }

    fun getCustomerUpperCaseName(): String {
        return name.toCapitalSentence()
    }

    //equal to public static method
    companion object {
        fun getInstance(): Customer {
            return Customer(UUID.randomUUID(), name = "XXX", address = "some where", phoneNum = "12345678", age = 34)
        }
    }
}

fun main() {
    val customer = Customer(UUID.randomUUID(), name = "Mia", address = "some where", phoneNum = "12345678", age = 21)
    val customer1 = Customer(UUID.randomUUID(), name = "Jen")

    println(customer.toString())
    println(customer1.toString())

    println(Customer.getInstance())
}