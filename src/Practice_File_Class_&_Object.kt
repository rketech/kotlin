class student {
    var name: String? = null
    var grade: Int? = null
    fun details() {
        println("$name is in grade $grade")
    }
}

fun main() {
    val student1 = student()
    student1.name = "Rakesh"
    student1.grade = 12
    student1.details()

    println("\n")

    val student2 = student()
    student2.name = "Fiza"
    student2.grade = 11
    student2.details()
}