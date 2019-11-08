package classes

class Plot {

    private val id = MockPlotRepo.evaluationId

    fun printId() {
        println(id)
    }

}

fun main() {
    val p = Plot()
    p.printId()


}

class MockPlotRepo {

    companion object {
        const val evaluationId = 123
    }

}