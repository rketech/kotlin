/*
    Kotlin While Loop

    Loops
    Loops can execute a block of code as long as a specified condition is reached.
    Loops are handy because they save time, reduce errors, and they make code more readable.

    A. While Loop :
        The while loop loops through a block of code as long as a specified condition is true:
*/
fun main() {
    // In the example below, the code in the loop will run, over and over again, as long as the counter variable (i) is less than 5:
    println("While loop : ")
    var i = 0
    while (i <= 10) {
        println("$i ")
        i++ // Note: Do not forget to increase the variable used in the condition, otherwise the loop will never end.
    }

    /*
    ------------------------------------------------
    B. The Do..While Loop :
          The do..while loop is a variant of the while loop.
          This loop will execute the code block once, before checking if the condition is true, then it will repeat the loop as long as the condition is true.
    */
    println("do..while loop : ")
    var j = 0
    do {
        println("$j")
        j++ // Do not forget to increase the variable used in the condition, otherwise the loop will never end!
    } while (j <= 5)
}