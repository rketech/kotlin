/*
    Kotlin - Lists

    Kotlin list is an ordered collection of items.
    A Kotlin list can be either mutable (mutableListOf) or read-only (listOf).
    The elements of list can be accessed using indices.
    Kotlin mutable or immutable lists can have duplicate elements.

    Creating Kotlin Lists :
        For list creation, use the standard library functions listOf() for read-only lists and mutableListOf() for mutable lists.
        NOTE: To prevent unwanted modifications, obtain read-only views of mutable lists by casting them to List.
*/

fun main() {
    val theList =
        listOf(1, 2, "three", "four", 5) // For for read-only lists, use the standard library functions listOf()
    println("listOf : ${theList}")

    // NOTE: To prevent unwanted modifications, obtain read-only views of mutable lists by casting them to List.
    val theMutableList = mutableListOf(7, 8, "nine", "ten", 11) // For mutable lists, use the mutableListOf() function
    println("mutableListOf : ${theMutableList}")

    /*
    -----------------------------------
    Loop through Kotlin Lists :
        There are various ways to loop through a Kotlin list. Lets study them one by one:
    */

    //     A.   Using toString() function :
    println("Looping Using toString() function : ${theList.toString()}")

    //--------- B.  Using Iterator : ---------------------
    val itr = theList.listIterator()
    while (itr.hasNext()) {
        println("Looping Using listIterator() function : ${itr.next()}")
    }

    //--------- C. Using for loop : ---------------------
    for (item in theList) // This is the preferred approach when you only need the values.
    {
        println("Looping Using for loop : ${item}")
    }

    for (i in theList.indices) // When you need the position as well as the value.
    {
        println("Looping Using for loop with indices $i: ${theList[i]}")
    }

    for ((index, value) in theList.withIndex()) // Kotlin provides a cleaner way when you need both Index and Value
    {
        println("Looping Using for loop withIndex() function : Index : $index , Value : $value")
    }

    /*--------- D. Using forEach : ---------------------
    Why Kotlin developers like forEach?
    It's concise and emphasizes what you want to do ("for each element, print it") rather than the mechanics of looping.
    However, for more complex logic, a regular for loop is often easier to read.
    */
    theList.forEach { println("Looping Using forEach() function : $it") } // When a lambda has exactly one parameter, Kotlin provides the implicit name it. Note - here it works like this operator in Java.

    // Using forEach with a named parameter which is item in place of it
    theList.forEach { item -> println("forEach() function with named parameter : $item") }

    // forEach internally does something conceptually like below for loop:
    for (item in theList) {
        println(item)
    }

    /*
    -----------------------------------
    Size of Kotlin List :
    */
    // We can use size property to get the total number of elements in a list:
    println("The size of the theList is ${theList.size}")
    println("The size of the theMutableList is ${theMutableList.size}")

    /*
    -----------------------------------
    The "in" Operator :
    */
    // The in operator can be used to check the existence of an element in a list.
    if ("three" in theList) println("Is three present in theList? : " + true) else println("Is three present in theList? : " + false)

    // In short we can present the above in operator code as :
    var isPresent_01 = "threee" in theList // is shorthand for: theList.contains("three")
    println("Is threee present in theList? : $isPresent_01")

    /*
    -----------------------------------
    The contain() Method :
        The contains() method can be used to check whether an element exists in a list.
        NOTE: Kotlin provides the in operator, which internally calls contains()
    */
    if (theMutableList.contains("nine")) {
        println(true)
    } else {
        println(false)
    }

    // In short we can present the above contains() function : This is cleaner and more idiomatic Kotlin.
    val isPresent_02 = theMutableList.contains("nine") // Storing the boolean value in a variable
    println("Is nine present in theMutableList : $isPresent_02") // Printing the result without any condition

    // You don't even need the intermediate variable if you're only printing:
    println("Is nine present in theMutableList :: ${theMutableList.contains("nine")}")

}