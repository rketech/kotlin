/*
Kotlin Conditions and If..Else :
    Kotlin supports familiar comparison conditions from mathematics, such as:

    Less than: a < b
    Less than or equal to: a <= b
    Greater than: a > b
    Greater than or equal to: a >= b
    Equal to a == b
    Not Equal to: a != b
        You can use these conditions to perform different actions for different decisions.

    Kotlin has the following conditionals:

        Use if to specify a block of code to be executed, if a specified condition is true
        Use else to specify a block of code to be executed, if the same condition is false
        Use else if to specify a new condition to test, if the first condition is false
        Use when to specify many alternative blocks of code to be executed
    Note: Unlike Java, if..else can be used as a statement or as an expression (to assign a value to a variable) in Kotlin.
    See an example at the bottom of the page to better understand it.

    Kotlin if :
        Use if to specify a block of code to be executed if a condition is true
        Note that if is in lowercase letters. Uppercase letters (If or IF) will generate an error.
*/

fun main() {
    println("if condition :")
    if (20 > 18) {
        println("20 is greater than 18")
    }

    /*
    -------------------------------
    Kotlin else :
        Use else to specify a block of code to be executed if the condition is false.
    */
    println("if...else condition")
    val percent = 79
    if (percent > 80) {
        println("Excellent")
    } else {
        println("Need Improvement")
    }

    /*
    -------------------------------
    Kotlin else if :
        Use else if to specify a new condition if the first condition is false.
    */
    println("if...else if...else condition :")
    val day = 1
    if (day == 3) {
        println("The day is Sunday")
    } else if (day == 2) {
        println("The day is Monday")
    } else if (day == 3) {
        println("The day is Tuesday")
    } else if (day == 4) {
        println("The day is Wednesday")
    } else if (day == 5) {
        println("The day is Thursday")
    } else if (day == 6) {
        println("The day is Friday")
    } else if (day == 7) {
        println("The day is Saturday")
    } else {
        println("Please provide a valid input")
    }

    /*
    -------------------------------
    Kotlin If..Else Expressions :
    In Kotlin, you can also use if..else statements as expressions (assign a value to a variable and return it):
    */

    println("Kotlin If..Else Expressions : ")
    val time_01 = 20.00
    val greetings = if (time_01 >= 00.00 && time_01 <= 12.00) {
        "Good Morning"
    } else if (time_01 > 12.00 && time_01 <= 18.00) {
        "Good Afternoon"
    } else if (time_01 > 18.00 && time_01 <= 21.00) {
        "Good Evening"
    } else if (time_01 > 21.00 && time_01 <= 24.00) {
        "Good Night"
    } else {
        "Incorrect Input"
    }
    println("The Greeting value is : ${greetings}")
}