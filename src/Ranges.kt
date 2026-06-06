/*
    Kotlin - Ranges :
        Kotlin range is defined by its two endpoint values which are both included in the range.
        Kotlin ranges are created with rangeTo() function, or simply using downTo or (. .) operators.
        The main operation on ranges is contains, which is usually used in the form of in and !in operators.
*/

fun main() {
    // Printing Characters using (. .) operators
    for (chars in 'A'..'Z') {
        println(chars)
    }

    // Printing numbers in range
    for (number in 5..20) {
        println(number)
    }

    // Check if a Value Exists
    // You can also use the in operator to check if a value exists in a range:
    println("Does 'E' exist within A-Z : ${'E' in 'F'..'Z'}")
    val cars = mutableListOf("Maruti", "Volvo", "BMW", "Tata")
    println("Does Tata exist in cars? : ${"Tata" in cars}")

    // Stop the loop when nums is equal to 10:
    for (num in 5..15) {
        if (num == 11) {
            break
        }
        println(num)
    }

    // Skip the value of 10 in the loop, and continue with the next iteration:
    for (num in 25..35) {
        if (num == 30) {
            continue
        }
        println(num)
    }

    // Creating Ranges using rangeTo()
    // To create a Kotlin range we call rangeTo() function on the range start value and provide the end value as an argument.
    println("rangeTo() :")
    for (num in 1.rangeTo(9)) {
        println(num)
    }

    // Creating Ranges using .. Operator
    // The rangeTo() is often called in its operator form ... So the above code can be re-written using .. operator as follows:
    println(".. operator :")
    for (num in 1..4) {
        println(num)
    }

    // Creating Ranges using downTo() Operator
    // If we want to define a backward range we can use the downTo operator:
    println("downTo() Operator :")
    for (num in 5 downTo 1) {
        println(num)
    }

    // Kotlin step() Function
    // We can use step() function to define the distance between the values of the range. Let's have a look at the following example:
    println("step() Function :")
    for (num in 11..20 step 3) {
        println(num)
    }

    // Kotlin reversed() Function
    // The function reversed() can be used to reverse the values of a range.
    println("reverse() Function :")
    for (num in (1..5).reversed()) {
        println(num)
    }

    // Kotlin until() Function
    // The function until() can be used to create a range but it will skip the last element given.
    println("until() Function :")
    for (num in 8 until 16) {
        println(num)
    }

    // Distinct Values in a Range
    // The distinct() function will return a list of distinct values from a range having repeated values:
    println("distinct() Function :")
    val range_01 = listOf(1,2,3,4,4,5,10,10)
    println(range_01.distinct())

    // Range Utility Functions
    // There are many other useful functions we can apply to our range, like min, max, sum, average, count:
    val a = 1..10
    println("Utility Function min() : ${a.min()}")
    println("Utility Function max() : ${a.max()}")
    println("Utility Function sum() : ${a.sum()}")
    println("Utility Function average() : ${a.average()}")
    println("Utility Function count() : ${a.count()}")
}
