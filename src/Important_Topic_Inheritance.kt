// Parent Class using the open keyword
open class Vehicle() {
    var speed: Double = 0.0

    fun move() {
        println("Speed: $speed km/h")
    }
}

// Child Class inheriting the parent class Vehicle
class Gaadi : Vehicle() {
    fun playMusic() {
        println("Playing Music")
    }
}

fun main() {
    val myVehicle = Vehicle()
    myVehicle.speed = 120.0
    myVehicle.move()

    println("\n")

    val myGaadi = Gaadi()
    myGaadi.speed = 210.0
    myGaadi.move()
    myGaadi.playMusic()
}