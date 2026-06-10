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
    // var filteredStudent_02 = obj_student_02.filter { student -> student.age > 40 }
    var filteredStudent_02 = obj_student_02.filter { it.age < 40 }.map { it.name }


    println("Filtered students whose age is greater than 40 are: $filteredStudent_02")

}