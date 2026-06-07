/*
Kotlin Classes/Objects
    Everything in Kotlin is associated with classes and objects, along with its properties and functions.
    For example: in real life, a car is an object. The car has properties, such as brand, weight and color, and functions, such as drive and brake.
    A Class is like an object constructor, or a "blueprint" for creating objects.
*/

// Create a Class
//  To create a class, use the class keyword, and specify the name of the class:
//  Good to Know: It is considered good practice to start the name of a class with an upper case letter, for better organization.
//  Example
//      Create a Car class along with some properties (brand, model and year)
class Car {
    var brand = "" // A property is basically a variable that belongs to the class.
    var model = ""
    var year = 0
}

fun main() {
    // Create an Object :
    // Now we can use the class named Car to create objects.
    // In the example below, we create an object of Car called c1, and then we access the properties of c1 by using the dot syntax (.), just like we did to access array and string properties:
    // Creating an object c1 of the Car Class
    val c1 = Car()
    // Creating multiple Class object
    val c2 = Car()

    // Accessing the Class properties and adding value to it
    c1.brand = "Maruti"
    c1.model = "800"
    c1.year = 1980

    c2.brand = "BMW"
    c2.model = "CV720"
    c2.year = 1990

    println("Brand: ${c1.brand}")
    println("Model: ${c1.model}")
    println("Year: ${c1.year}")

    println("Brand: ${c2.brand}")
    println("Model: ${c2.model}")
    println("Year: ${c2.year}")
}
