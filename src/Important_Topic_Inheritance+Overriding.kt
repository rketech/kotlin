// Parent Class using the open keyword
open class Vehicle2() {
    var speed: Double = 0.0

    // Using open keyword to allow the override functionality inside the child function
    open fun move() {
        println("Speed of Vehicle: $speed km/h")
    }
}

// Child Class inheriting the parent class Vehicle
class Gaadi2 : Vehicle2() {
    fun playMusic() {
        println("Playing Music")
    }

    override fun move() {
        println("Speed of myGaadi2 is : $speed km/h")
    }
}

class Bike : Vehicle2() {
    fun applyBrakes() {
        println("Applying Brake")
    }

    override fun move() {
        println("Speed of myBike is : $speed km/h")
    }
}

fun main() {
    val myVehicle2 = Vehicle2()
    myVehicle2.speed = 120.0
    myVehicle2.move()

    println("\n")

    val myGaadi2 = Gaadi2()
    myGaadi2.speed = 210.0
    myGaadi2.move()
    myGaadi2.playMusic()

    println("\n")

    val myBike = Bike()
    myBike.speed = 90.0
    myBike.move()
    myBike.applyBrakes()

}
