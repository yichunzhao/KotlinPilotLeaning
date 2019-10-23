package classes

import java.math.BigDecimal

fun sum(a: BigDecimal, b: BigDecimal): BigDecimal {
    return a.add(b)
}

fun sumDouble(a: Double, b: Double): Double = a + b

fun main() {
    println(sum(1.10.toBigDecimal(), 2.2.toBigDecimal()))
    println(sumDouble(1.10, 2.2))
}