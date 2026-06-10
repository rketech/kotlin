/*
    Collections of Objects - filter() with Objects
*/
data class Students_02(
    var name: String,
    var age: Int
)

fun main() {
    var obj_student_02 = listOf(
        Students_02("Rakesh", 41),
        Students_02("Amit", 43),
        Students_02("Bhola", 25),
    )
    var filteredStudent_01 = obj_student_02.filter { student -> student.age > 40 }
    println("Filtered students whose age is greater than 40 are : $filteredStudent_01")

    var filteredStudent_02 = obj_student_02
        .filter { it.age > 40 }
        .map { it.name }
    println("Filtered students [(Name Only)] whose age is greater than 40 are: $filteredStudent_02") // This prints the name with [name]

    for (name in filteredStudent_02) {
        println("Filtered students Name Only whose age is greater than 40 are: $name") // This prints just the name
    }

    // Shorter version of the above for code
    filteredStudent_02.forEach { println(it) } // This prints just the name

    var filteredStudent_03 = obj_student_02
        .filter { it.age > 26 }
        .map { it.name }
        .forEach { println(it) }
}

/*
    This is extremely common in Android

    For example:

        val availableProducts = products.filter {
            it.inStock
        }

    or

        val adultUsers = users.filter {
            it.age >= 18
        }

    or

        val completedTasks = tasks.filter {
            it.isCompleted
        }

    You are now starting to work with data the same way real Android apps do.
*/