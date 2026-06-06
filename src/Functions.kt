/*
    Kotlin is a statically typed language, hence, functions play a great role in it.
    A function is a block of code which only runs when it is called.
    At a broad level, a function takes some input which is called parameters, perform certain actions on these inputs and finally returns a value.
    Functions are used to perform certain actions, and they are also known as methods.
    Functions are supported by all the modern programming languages and they are also known as methods or subroutines.
*/

// Kotlin Built-in Functions
// Kotlin provides a number of built-in functions, we have used a number of buil-in functions in our examples.
// For example print() and println() are the most commonly used built-in function which we use to print an output to the screen.

fun main() {
    println("Hello, World!")
    printHi()
    val a: Int = 10
    val b: Int = 20
    printSum(a, b) // Arguments are the actual values passed when calling the function.
    val result2 = printSum3(a, b) // calling Shorter Syntax for Return Values
    println("Shorter Syntax for Return Values : $result2")
    val result = printSum2(a, b)
    println("Result after return is : $result")
    lambda()
    nameFunction("Rakesh ")
    multiParameter("Rakesh","Sharma",41)
}

// User-Defined Functions
// Kotlin allows us to create our own function using the keyword fun.
// A user defined function takes one or more parameters, perform an action and return the result of that action as a value.
fun printHi() {
    println("Hi! I am an User defined function")
}

// Function Parameters
// A user-defined function can take zero or more parameters. Parameters are options and can be used based on requirement.
fun printSum(
    a: Int,
    b: Int
) { // Parameters are the variables written in the function definition. Think of them as empty boxes waiting for values.
    println("Sun of two numbers is ${a + b}")
}

// Return Values
//A kotlin function return a value based on requirement. Again it is very much optional to return a value.
//To return a value, use the return keyword, and specify the return type after the function's parantheses
fun printSum2(a: Int, b: Int): Int {
    val sum: Int = a + b
    return sum
}

// Shorter Syntax for Return Values
// There is also a shorter syntax for returning values. You can use the = operator instead of return without specifying the return type.
// Kotlin is smart enough to automatically find out what it is:
fun printSum3(a: Int, b: Int) = a + b

// Higher-Order Functions
//A higher-order function is a function that takes another function as parameter and/or returns a function.
/*  YET TO UNDERSTAND THE CONCEPT */


// Kotlin Lambda Function
// Kotlin lambda is a function which has no name and defined with a curly braces {} which takes zero or more parameters and body of function.
// The body of function is written after variable (if any) followed by -> operator.
fun lambda() {
    val upperCase = { str: String -> str.uppercase() }
    println(upperCase("Hello! World using lambda expression"))
}

// Kotlin Inline Function
// An inline function is declared with inline keyword.
// The use of inline function enhances the performance of higher order function.
// The inline function tells the compiler to copy parameters and functions to the call site.
/*  YET TO UNDERSTAND THE CONCEPT */


// Function Parameters
// Information can be passed to functions as parameter.
// Parameters are specified after the function name, inside the parentheses.
// You can add as many parameters as you want, just separate them with a comma.
// Just note that you must specify the type of each parameter (Int, String, etc).
// The following example has a function that takes a String called fname as parameter.
// When the function is called, we pass along a first name, which is used inside the function to print the full name:

fun nameFunction(fname: String) {
    println(fname + "Sharma")
}

// Multiple Parameters
// You can have as many parameters as you like:
fun multiParameter(fname: String, lname: String, age: Int){
    println("Hello $fname $lname. You entered your age as $age")
}
