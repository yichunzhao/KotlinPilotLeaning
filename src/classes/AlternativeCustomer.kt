package classes


class AlternativeCustomer(val name: String, val id: String) {
    //val means a final variable, so it must be initialized as it is declared
    private val address: String
    get() = this.address

}