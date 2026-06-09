/*
contains(), size, and isEmpty()

These are used constantly in Android apps.

Imagine:
        Checking whether a product is already in a cart.
        Checking whether a user is already selected.
        Checking whether a list returned from an API is empty.
        Showing "No Data Available" on the screen.
*/

fun userFunction(users_userFunction: MutableList<String>) {
    println("Updated list of users :")
    for (user in users_userFunction) {
        print(user)
    }
}

fun main() {
    /* -----------------------------------------------------------
    1. contains()
            Checks whether an item exists in the collection. */
    var fruits_01 = mutableListOf<String>("Apple", "Banana", "Pear")
    println("Is Pear in the mutable list ? ${fruits_01.contains("Pear")}")

    /* -----------------------------------------------------------
    2. size
            Returns the number of elements. */
    println("Size of the mutableList is ${fruits_01.size}")

    /* -----------------------------------------------------------
    3. isEmpty()
            Checks whether the collection contains zero elements. */
    var users_main = mutableListOf<String>() // Created an empty mutablelist
    if (users_main.isEmpty()) //  Checking is mutablelist is empty
    {
        println("No User Found in the database.") // If empty print the statement
    }

    print("Enter a new user: ")
    var newUser: String? = readLine() // Demanding user input
    if (!newUser.isNullOrBlank()) // Checking if the user have entered some input
    {
        users_main.add(newUser) // Adding user input within the mutablelist
        userFunction(users_main) // Calling the user defined function
        if (users_main.isEmpty()) {
            println("No User Found in the database.")
        } else {
            println("  .....User Database Updated.")
        }
    }else{
        println(" .....Blank Input") // If the user do not type anything and simply press enter button
    }
}

