/*
    Collections of Objects - map() with Objects
*/
data class Students_03(
    var name: String,
    var age: Int
)

fun main() {
    var obj_student_03 = listOf(
        Students_03("Rakesh", 41),
        Students_03("Amit", 43),
        Students_03("Bhola", 25),
    )

    var result = obj_student_03.map { it.name }
    result.forEach { println(it) }
}

/*
    Excellent. You've now learned a very important Android pattern:
    list
        .filter { condition }
        .map { transformation }

    You'll see code like this everywhere:

    users
        .filter { it.isActive }
        .map { it.name }

    products
        .filter { it.inStock }
        .map { it.title }

    messages
        .filter { !it.isDeleted }
        .map { it.text }
*/