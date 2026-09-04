class User2 {

    companion object {

        fun fullName() {
            println("Rakesh Sharma")
        }

        fun age() {
            println(41)
        }
    }
}

fun main() {

    // Here we do not have to create any object since we are using companion object keyword
    User2.fullName()
    User2.age()
}