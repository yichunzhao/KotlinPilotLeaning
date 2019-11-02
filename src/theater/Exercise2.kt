import java.math.BigDecimal

data class Seat(val row: Int, val num: Int, val price: BigDecimal, val description: String) {
    //YOU MAY NOT EDIT THIS CLASS!
    override fun toString(): String = "Seat $row-$num $$price ($description)"
}

class Theater {

    // SEAT PRICES:
    // Seats in rows 14 and 15 cost 14.50
    // Seats in rows 1 to 13 and numbered 1 to 3 or 34 to 36 cost 16.50
    // All other seats in row 1 cost 21.00
    // All other seats cost 18.00

    // SEAT DESCRIPTIONS:
    // Seats in row 15: "Back row"
    // Seats in row 14: "Cheaper seat"
    // All other rows, seats 1 to 3 and 34 to 36: "Restricted View"
    // All other seats in rows 1 and 2 "Best view"
    // All other seats: "Standard seat"

    private val hiddenSeats = mutableListOf<Seat>()

    init {
        for (r in 1..16) {
            for (n in 1..36) {
                hiddenSeats.add(Seat(row = r, num = n, description = getDescription(r, n), price = getPrice(r, n)))
            }
        }
    }

    val seats = hiddenSeats.toList()

    private fun getPrice(row: Int, numb: Int): BigDecimal {
        if (row > 16 || numb > 36 || row <= 0 || numb <= 0) throw IllegalAccessException("row or numb is not right")

        //all seats at back 2 rows, the price is the same
        if (row in 15..16) return BigDecimal(14.5)

        //from row  1 to 14, num = {
        if (row in 1..14) {
            if (numb in listOf<Int>(1, 2, 3, 36, 35, 34)) {
                return BigDecimal(16.5)
            }

            if (row in 1..2) {
                return BigDecimal(21.0)
            }

            return BigDecimal(18.0)
        }

        return BigDecimal(10.0)
    }

    private fun getDescription(row: Int, numb: Int): String {
        //when in kotlin can replace the if-elseif-else
        return when {
            row == 15 -> "Back row"
            row == 14 -> "Cheaper seat"
            row in 1..13 && numb <= 3 && numb >= 34 -> "Restricted View"
            row in 1..2 && numb in 3..34 -> "Best view"
            else -> "Standard seat"
        }

    }

}

fun main(args: Array<String>) {
    val cheapSeats = Theater().seats.filter { it.price == BigDecimal(14.50) }
    for (seat in cheapSeats) println(seat)

    val expensiveSeats = Theater().seats.filter { it.price == BigDecimal(21.0) }
    for (seat in expensiveSeats) println(seat)

    val normalSeat = Theater().seats.find { it.row == 10 && it.num == 10 }
    println(normalSeat)

    val sideSeats = Theater().seats.filter { it.row in 1..14 && it.num in listOf<Int>(1, 2, 3, 34, 35, 36) }
    for (sideSeat in sideSeats) println(sideSeat)

}



