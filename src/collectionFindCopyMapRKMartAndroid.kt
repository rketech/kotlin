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
}