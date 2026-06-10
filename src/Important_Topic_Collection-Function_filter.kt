/* Collection Function :
    a. filter()
    b. map()
    c. forEach()

    These three are used everywhere in:
        Jetpack Compose
        API responses
        Room Database
        RecyclerView data
        ViewModels
        State management
*/
// filter() creates a new list containing only the items that match a condition.

fun main() {
    // Creating numbered list and filtering and storing elements in a variable based on specific condition
    val numberList = listOf<Int>(10, 20, 30, 40, 50)
    val resultList = numberList.filter { it >= 30 }
    println(resultList)

    // Android Example
    //Suppose an API returns users:
    val users = listOf("Rakesh", "Aman", "Rahul", "Ankit")
    // Show only names starting with "A":
    val filteredUsers = users.filter { it.startsWith('A', true) }
    println(filteredUsers)
}

/*
**********************
Important
    filter() does not modify the original list.

* Why Android Developers Use filter() So Much

    Suppose an API returns 100 products:

        val products = apiResponse.products

    Show only products that are in stock:

        val availableProducts = products.filter {
                it.inStock
        }

    Or show only students who passed:

        val passedStudents = students.filter {
                it.marks >= 40
        }

    Or search users:

        val result = users.filter {
                it.name.contains("rak", ignoreCase = true)
        }

     These are everyday Android tasks.
    */
