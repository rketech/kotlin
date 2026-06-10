/* Collection Function :
    a. filter() - Keeps or removes items.
    b. map() - Transforms items.
    c. forEach() - Do something with every item

    These three are used everywhere in:
        Jetpack Compose
        API responses
        Room Database
        RecyclerView data
        ViewModels
        State management
*/

// map()
//
// This is one of the most important Kotlin functions.
//
// filter() decides WHAT TO KEEP.
//
// map() decides WHAT TO CHANGE INTO.

fun main() {
    val numbers = listOf<Int>(1, 2, 3, 4, 5)
    val numberResult = numbers.map { it * 10 } // map() decides WHAT TO CHANGE INTO.
    println(numberResult)

    // Android Example
        // API gives: ["rakesh", "aman", "rahul"]
        // UI wants: //["RAKESH", "AMAN", "RAHUL"]
    val users = listOf<String>("rakesh", "aman", "rahul")
    val usersResult = users.map { it.uppercase() } // map() decides WHAT TO CHANGE INTO. // Instead of a loop, Android developers often use map()
    println(usersResult)
}

/*
---------------------------------------
    Real Android Example

        Suppose you receive student marks:

            val marks = listOf(
                45,
                60,
                30,
                90,
                55
            )

        First keep only passed students:

            val passed = marks.filter {
                it >= 40
            }

        Result:

            [45, 60, 90, 55]

        Now add 5 grace marks:

            val updated = passed.map {
                it + 5
            }

        Result:

            [50, 65, 95, 60]

        This pattern:

        filter()
        map()

        appears everywhere in Android apps.

        Three most commonly used collection operations in Android:

        ✅ forEach() → Do something with every item

        ✅ filter() → Keep only matching items

        ✅ map() → Transform items into new values

        These are used extensively in:
                Jetpack Compose UI
                ViewModels
                Room Database queries
                API response processing
                StateFlow and LiveData transformations
*/