/*
    Kotlin when :
    Instead of writing many if..else expressions, you can use the when expression, which is much easier to read.

    It is used to select one of many code blocks to be executed.
    The when expression is similar to the switch statement in Java.
*/

fun main(){
    val day = 1
    val result = when (day) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Invalid input"
    }
    println("The day related to $day is $result")
}

/*
    Easy Rule to Remember

    Use when(value) when comparing against specific values
        when(menuChoice) {
            1 -> checkBalance()
            2 -> deposit()
            3 -> withdraw()
            4 -> exit()
        }

    Think:
        menuChoice equals what?

    Use when { } when evaluating conditions
        when {
            amount == null -> ...
            amount <= 0 -> ...
            amount > balance -> ...
        }

    Think:
        Which condition is true?
*/