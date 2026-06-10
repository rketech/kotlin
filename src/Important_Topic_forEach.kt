/*
    filter()
    map()
    forEach()

    These three are used everywhere in:
        Jetpack Compose
        API responses
        Room Database
        RecyclerView data
        ViewModels
        State management
*/

fun main(){
    val fruits = mutableListOf<String>("apple","orange","pears")

    // Long form of printing the elements from Immutable or Mutable List
    for (fruit in fruits){
        println(fruit)
    }

    // Kotlin provides a shorter form:
    fruits.forEach {
        println(it) // Think of: 'it' as: "the current item"
    }

    // Same Code With a Named Variable // Instead of it, you can write:
    fruits.forEach { fruit -> println(fruit) } // Many Android developers prefer this when the code becomes larger because it's easier to read.
}