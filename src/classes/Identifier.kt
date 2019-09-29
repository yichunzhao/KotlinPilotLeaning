package classes

interface Identifier {
    fun identify(a: Double, b: Double, c: Double): Boolean
}

class Equilateral() : Identifier {
    override fun identify(a: Double, b: Double, c: Double): Boolean {
        return setOf(a, b, c).size == 1
    }
}

class Isosceles() : Identifier {
    override fun identify(a: Double, b: Double, c: Double): Boolean {
        return setOf(a, b, c).size == 2
    }
}

class Scalene() : Identifier {
    override fun identify(a: Double, b: Double, c: Double): Boolean {
        return setOf(a, b, c).size == 3
    }
}

class TriangleIdentifierContext(private val identifier: Identifier) {
    fun typeOf(a: Double, b: Double, c: Double): Boolean {
        return identifier.identify(a, b, c)
    }
}

fun main() {
    val a = 3.2
    val b = 4.8
    val c = 5.6

    val scaleneContext: TriangleIdentifierContext = TriangleIdentifierContext(Scalene())
    println("the type is scalene ${scaleneContext.typeOf(a, b, c)}")

    val isoscelesContext: TriangleIdentifierContext = TriangleIdentifierContext(Isosceles())
    println("the type is Isosceles ${isoscelesContext.typeOf(a, b, c)}")

    val equilateralContext: TriangleIdentifierContext = TriangleIdentifierContext(Equilateral())
    println("the type is equilateral  ${equilateralContext.typeOf(a, b, c)}")

}




