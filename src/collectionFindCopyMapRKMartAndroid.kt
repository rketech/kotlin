fun main() {
    // Creating a collection listOf() fruits to perform the find() operation on to it
    val fruits = listOf(
        "Apple",
        "Banana",
        "Pear",
        "Grapes",
        "Pineapple"
    )

    val result = fruits.find { fruit ->
        fruit == "Pear1"
    }

    //Comment: 'it' is the short form replacing fruit -> fruit
    //val result = fruits.find { it == "Pear" }

    println("Result after find() is : $result")

    // Creating a collection listOf() numbers to perform the map() operation on to it
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // I want to create a new list where every number is increased by 1.
    val newNumbers = numbers.map { number -> number + 1 }

    /*
    Important distinction
        map() does not mean "find something."
    It means:
        Go through every item and produce a corresponding value for the new list.*/
    println("New numbers after map() is : $newNumbers")
}