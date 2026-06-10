/*
        Data Classes :

            Android developers use data classes constantly.
            Almost every API response, database entity, UI state object, and form model in Android is represented using a data class.
*/

// A data class creates a blueprint:
data class Students(
    val name: String,
    val age: Int
)

data class User(
    val name: String,
    val age: Int
)

fun main() {
    // A data class creates the object as below in response to the blueprint as above data class:
    val student_01 = Students("Rakesh", 41) // Stores name = Rakesh , age = 41

    // Now with the help of class object we can access the class properties and print the properties value
    println("The name of the student is ${student_01.name}. His age is ${student_01.age}.") // Here we are accessing the properties
    println(student_01) // Here we are accessing the complete class object


    /*
    Why Data Classes Matter in Android

    Suppose an API returns:

    {
      "id": 101,
      "name": "Rakesh",
      "email": "rakesh@gmail.com"
    }

    In Kotlin we often represent it as:

    data class User(
        val id: Int,
        val name: String,
        val email: String
    )

    Now the whole user can be stored in a single object:

    val user = User(
        101,
        "Rakesh",
        "rakesh@gmail.com"
    )

    This is how most Android apps work internally.

    -----------------Important-------------------
    One reason Android developers love data classes.

    Compare:

    Normal Class :
        class Product(
            val name: String,
            val price: Int
        )

    Printing:

        println(product)

    might give something ugly like:

        Product@6d06d69c

    (memory address-like output)

    Data Class :
        data class Product(
            val name: String,
            val price: Int
        )

    Printing:

        println(product)

    gives:

        Product(name=Laptop, price=50000)

    which is much more useful for debugging.
    ---------------------------------------
*/
    // Kotlin compares the contents of the objects, not whether they are the same object in memory.
    var student_02 = Students("Rakesh", 42)
    var student_03 = Students("Rakesh", 42)
    println("After comparing contents of student_02 and student_03 the result is ${student_02 == student_03}")

    /*
    Why Android Developers Love This

    Suppose you load user data from an API:

        val oldUser = User(1, "Rakesh")
        val newUser = User(1, "Rakesh")

    You can simply write:

        if (oldUser == newUser) {
            // No changes
        }

    and Kotlin compares all properties automatically.
    -------------------------------------------------
    */
    // Another Superpower: copy()
    // Data classes automatically get a copy() function.
    var user_01 = User("Krishna", 41)

    // copy() creates a new object by copying all properties from an existing object, and optionally changes only the properties you specify.
    var user_02 = user_01.copy(age = 42)
    println("User_01 is ${user_01}")
    println("User_02 is ${user_02}")

    /*
    Kotlin internally thinks something like:

            val user2 = User(
                name = user1.name,
                age = 41
            )

    Notice:
        name was copied automatically.
        age was replaced with the new value.
     ------------------------------------------------

     ---------Important-----------------------------
     Why Android Developers Use This Constantly

    Imagine a screen state:

            data class UiState(
                val isLoading: Boolean,
                val username: String
            )

    Current state:

            val state = UiState(
                isLoading = true,
                username = "Rakesh"
            )

    Loading finishes:

            val newState = state.copy(
                isLoading = false
            )

    Now:

            UiState(isLoading=false, username=Rakesh)

    You changed only one property and kept everything else.

    This pattern is extremely common in:
        Jetpack Compose
        ViewModels
        StateFlow
        MVI/MVVM architecture

--------------------------------------------------------------

    You'll use them for:

        API responses
        Room database entities
        UI state
        Navigation arguments
        Form data
        Settings
        User profiles
        Product models

    In a real Android project, it's normal to have dozens or even hundreds of data classes.

*/
}