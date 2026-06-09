/*
Kotlin has two types of collections:
    1. Immutable (Read-Only)
    2. Mutable Collection
*/

fun fruit_Immutable_list() {
    var fruits = listOf("Apple", "Banana", "Pear")
    println("List of fruits: ")
    for (fruit in fruits) {
        println(fruit)
    }
}

fun state_Mutable_list(states: MutableList<String>) { // creating a parameterized function
    println("List of states: ")
    for (state in states) {
        println(state)
    }
}

fun main() {
    fruit_Immutable_list()

    var states = mutableListOf<String>("UP", "Bihar", "Chennai") // Creating mutableList
    state_Mutable_list(states) // passing the MutableList as an argument to the function parameter for printing each value from the list

    print("Enter new state name: ")
    var newState = readLine() // Demanding User Input
    if (!newState.isNullOrBlank()) // Checking if the variable hold null or "" i.e. blank value
        {
        states.add(newState) // Adding new element to the mutableList
            println("New list of states: ")
            state_Mutable_list(states) // Calling parameterized function and printing each item from the list
    }else{
        println("Blank Input... No new list to show")
    }
}