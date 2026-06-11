/*
    --- Extension Functions ---

    They let you add new functions to existing classes like:

        "rakesh".capitalizeFirstLetter()

    even though String never originally had that function.

    ----------

    The Problem

        Suppose you want to print a greeting for a String.

        Without extension functions:

            fun greet(name: String) {
                println("Hello $name")
            }

            fun main() {
                greet("Rakesh")
            }

        Works fine.

        But imagine you want to use it like:

            "Rakesh".greet()

        A String class doesn't have a greet() function.

        Normally you cannot do this.

            Solution: Extension Function

            Kotlin allows you to "extend" an existing class.
*/

// Kotlin allows you to "extend" an existing class.

fun String.greet() // means: Add a new function called greet() to String.
{
    println("Hello $this") // Inside an extension function: this refers to the String object that called the function.
}

fun String.shout() // means: Add a new function called shout() to String.
{
    println(this.uppercase()) // Inside an extension function: this refers to the String object that called the function.
}

fun isValidName_01(name: String) {
    if (name.isNotEmpty()) {
        println(true)
    } else {
        println(false)
    }
}

// We can convert the above isValidName_01 using Extension Function
fun String.isValidName_02(): Boolean // Demanding return type
{
    return this.length >= 3 // Demanding return type hence using return keyword
}

// Finding the last character within a given string
fun String.lastChar() {
    println("The last character in the word Indian is ${this[this.length - 1]}")
}

fun main() {
    "Rakesh Sharma".greet() // Here "Rakesh Sharma" is the String Object that is calling the extended function
    "attention please!".shout() // Here "attention please!" is the String Object that is calling the extended function
    isValidName_01("")
    println("Rakesh Sharma".isValidName_02()) // Since the extension function is returning value so we are printing the result
    "Indian".lastChar()
}

/*
    The key thing to understand is:

        fun String.someFunction() { ... }

    means:

        "I am adding a new function to String."
*/