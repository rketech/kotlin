fun main() {
    /*
    What is a Collection?
        A collection is simply a way of keeping multiple values together.
    */

    // Creating a collection listOf() fruits to perform the find() operation on to it
    // What happens if find() doesn't find anything? result = null
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
    val numbers_1 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // I want to create a new list where every number is increased by 1.
    val newNumbers_1 = numbers_1.map { number -> number + 1 }

    /*
    Important distinction
        map() does not mean "find something."
    It means:
        Go through every item and produce a corresponding value for the new list.*/
    println("New numbers after map() is : $newNumbers_1")

    // map() can also leave something unchanged
    // I say: "Only increase 2. Leave everything else alone."

    val number_2 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val newNumbers_2 = number_2.map { number ->
        if (number == 2){
            number + 1
        }else{
            number
        }
    }
    println("New numbers after map() keeping every number in original except 2 is : $newNumbers_2")
}