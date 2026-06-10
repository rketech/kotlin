/* Collections of Objects */
data class Students_01(
    var name: String,
    var age: Int
)

fun main() {
    var obj_Student = listOf(
        Students_01("Rakesh", 41),
        Students_01("Anil", 25),
        Students_01("Prakash", 58)
    )

    println(obj_Student)
    println(obj_Student[1])
    println(obj_Student[1].name)

    // forEach() visits each Student object one by one:
    obj_Student.forEach { println(it.name) }
}

/*
        Why this matters in Android ?

        Suppose you get a list of users from an API:

            val users = listOf(
                User("Rakesh"),
                User("Aman"),
                User("Rahul")
            )

        You might display their names in a screen:

            users.forEach {
                println(it.name)
            }

        Or in Jetpack Compose:

            users.forEach {
                Text(it.name)
            }

        Same concept.
*/