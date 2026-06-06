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
    val isPresent_01 = "threee" in theList // is shorthand for: theList.contains("three")
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

    /*
    -----------------------------------
    The isEmpty() Method :
        The isEmpty() method returns true if the collection is empty (contains no elements), false otherwise.
    */
    if (theList.isEmpty()) {
        println(true)
    } else {
        println(false)
    }

    // In short we can write the above if code as  :
    val is_Empty_01 = theList.isEmpty()
    println("Is theList Empty? : $is_Empty_01")

    // In short we can write the above if code as  :
    println("Is theList Empty? : ${theList.isEmpty()}")

    /*
    -----------------------------------
    The indexOf() Method :
        The indexOf() method returns the index of the first occurrence of the specified element in the list,
        or -1 if the specified element is not contained in the list.
    */
    println("The index of 5 in theList is : ${theList.indexOf(5)}")

    /*
    -----------------------------------
    The get() Method :
        The get() method can be used to get the element at the specified index in the list. First element index will be zero.
    */
    println("The element at the 3rd index is : ${theList.get(3)}")

    /*
    -----------------------------------
    List Addition :
        We can use + operator to add two or more lists into a single list. This will add second list into first list, even duplicate elements will also be added.
    */
    val list_01 = listOf(1, 2, 3)
    val list_02 = listOf(4, 5, 6)
    var list_03 = list_01 + list_02
    println("New list_03 after list_01 + list_02 is : $list_03")

    /*
    -----------------------------------
    List Subtraction :
        We can use - operator to subtract a list from another list.
        This operation will remove the common elements from the first list and will return the result.
    */
    val list_04 = listOf(1, 2, 3)
    val list_05 = listOf(1, 5, 6)
    println("New List after list_04 - list_05 is : ${list_04 - list_05}") // Create a new list by removing from list_04 all elements that are present in list_05

    /*
    -----------------------------------
    Slicing a List :
        We can obtain a sublist from a given list using slice() method which makes use of range of the elements indices.
    */
    val list_06 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println("New List after slicing is : ${list_06.slice(4..8)}")

    /*
    -----------------------------------
    Removing null a List :
        We can use filterNotNull() method to remove null elements from a Kotlin list.
    */
    val list_07 = listOf(1, 2, 3, 4, 5, null, 7, 8, 9)
    // val result_07 = list_07.filterNotNull() // we can create a variable to get the new list and then print the new list
    println("New list after removing null value using filterNotNull() function : ${list_07.filterNotNull()}")

    /*
    ------------------------------------
    Filtering Elements :
        We can use filter() method to filter out the elements matching with the given predicate.
    */
    val list_08 = listOf(10, 12, 26, 45, 78, 25, 32, 1, 56, 92, 82, 19, null)
    val list_09 =
        list_08.filterNotNull() // null value should be removed first before filteration else there will be an error
    println("New list after filtering number greater & = 25 are : ${list_09.filter { it >= 25 }}")

    /*
    ------------------------------------
    Dropping First N Elements :
        We can use drop() method to drop first N elements from the list.
    */
    println("After dropping first 3 elements, result is : ${list_08.drop(3)}")
    println("After dropping last 3 elements, result is : ${list_08.dropLast(3)}")

    /*
    ------------------------------------
    Grouping List Elements  :
        We can use groupBy() method to group the elements matching with the given predicate.
    */
    println("After groupBy() the result is : ${list_09.groupBy { it % 3 }}") // Based on remainder value

    /*
    ------------------------------------
    Mapping List Elements   :
        We can use map() method to map all elements using the provided function:.
    */
    println(
        "After mapping the result is : ${list_09.map { it / 3 }}"
    )

    /*
    ------------------------------------
    Chunking List Elements  :
        We can use chunked() method to create chunks of the given size from a list.
        Last chunk may not have the elements equal to the number of chunk size based on the total number of elements in the list.
    */
    println("List after chunking is : ${list_09.chunked(3)}")

    /*
    ------------------------------------
    Windowing List Elements :
        We can use windowed() method to a list of element ranges by moving a sliding window of a given size over a collection of elements.
        In Android Development You'll most commonly use windowed() for:
            Data analytics
            Time-series data
            Sensor readings
            Graph/chart calculations
            Grouping items for UI layouts
            Financial calculations
            AI/ML preprocessing
        For basic CRUD apps (Notes App, To-Do App, Calculator), you may never use it.
        But in data-heavy apps, analytics apps, IoT apps, fitness apps, and finance apps, windowed() becomes very useful.
    */
    println("List after being windowed() one step at a time is : ${list_09.windowed(3)}")
    // By default, the sliding window moves one step further each time but we can change that by passing a custom step value:
    println("List after being windowed() 3 steps at a time is : ${list_09.windowed(3,3)}")
}