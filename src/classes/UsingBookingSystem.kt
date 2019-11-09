package classes

import Seat

interface UsingBookingSystem {
    fun isSeatBooked(seat: Seat): Boolean
    fun bookThisSeat(seat: Seat): Boolean
}