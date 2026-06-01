/*
    Kotlin Break and Continue


*/

fun main() {
    /*
    A. Kotlin Break :
            The break statement is used to jump out of a loop.
            This example jumps out of the loop when i is equal to 4:
    */
    println("Break :")
    var i = 0
    while (i <= 10) {
        println("$i")
        i++
        if (i == 6) {
            break // This example jumps out of the loop when i is equal to 6
        }
    }

    /*
    B. Kotlin Continue :
             The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.
    */
    println("Continue :")
    var j = 0
    while (j <= 10) {
        if (j == 6) {
            j++
            continue // This example skips the value of 6
        }
        println("$j")
        j++
    }
}