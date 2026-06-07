/*
Kotlin Class Functions :
    You can also use functions inside a class, to perfom certain actions:

    Example
    Create a drive() function inside the Car class and call it:
    Tip: When a function is declared inside a class, it is known as a class function, or member function.

    Note: When an object of the class is created, it has access to all of the class functions.
*/
fun main() {
    var carObjectCar_01 = Car_02("GM", "G50", 1985, 250)
    println(
        "The car is from ${carObjectCar_01.brand}. " +
                "Its model number is ${carObjectCar_01.model}. " +
                "It was built in the year ${carObjectCar_01.year}. " +
                "It has a top regular speed of ${carObjectCar_01.speedFun_01()} and parameterized speed is ${
                    carObjectCar_01.speedFun_02(
                        350
                    )
                }"
    )
// Calling Parameterized Function without return statement
    carObjectCar_01.speedFun_03(450)
}

// Creating Class and Class Function
class Car_02(var brand: String, var model: String, var year: Int, var speed: Int) {

    // Creating Member/Class Regular Function
    fun speedFun_01(): String { // Return type should be specified i.e. Make the function return a String
        return "Speed_01 With Regular Function is : $speed/km!!" // Return keyword should be used instead of println so that the function returns a meaningful value
    }

    // Class Function Parameters
    // Just like with regular functions, you can pass parameters to a class function:
    fun speedFun_02(maxSpeed: Int): String {
        return "Speed_02 With Parameterized Function is : $maxSpeed km/h"
    }

    fun speedFun_03(maxSpeed: Int) {
        println("Speed_02 With Parameterized Function is : $maxSpeed km/h")
    }
}

