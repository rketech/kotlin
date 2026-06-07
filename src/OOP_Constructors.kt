/*
Kotlin Constructor :
    In Kotlin, there's a faster way of doing this, by using a constructor.

    A constructor is like a special function, and it is defined by using two parantheses () after the class name.
    You can specify the properties inside of the parantheses (like passing parameters into a regular function).

    The constructor will initialize the properties when you create an object of a class.
    Just remember to specify the type of the property/variable:
*/
fun main() {
    var carObject = Car_01("Volvo", "DX120", 1999)
    println("Brand: ${carObject.brand}")
    println("Model: ${carObject.model}")
    println("Year: ${carObject.year}")

}

// Creating a Constructor
class Car_01(var brand: String, var model: String, var year: Int)