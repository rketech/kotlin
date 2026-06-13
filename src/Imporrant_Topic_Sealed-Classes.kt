/*
    --------------Sealed Classes--------------

    Sealed Keyword.
        Means:
            Restrict inheritance. Only classes/objects defined inside this sealed class file can inherit from it.

    Think of them as a more powerful version of Enums.

    Enums can only store fixed values: An Enum cannot store extra data.

        PENDING
        APPROVED
        REJECTED

    But Sealed Classes can store values and data:

        Loading
        Success(data)
        Error(message)

    This pattern is used heavily in:

        API responses
        ViewModel state
        Jetpack Compose UI state
        Repository results

    It's one of the most important modern Kotlin concepts for Android development.
    -------------------------------------------
    Suppose we use Enum
        enum class Result {
            SUCCESS,
            ERROR,
            LOADING
        }

     This tells us:

            SUCCESS
            or
            ERROR
            or
            LOADING

    But what if an API fails?

    We may want:

        ERROR: Internet connection failed
            or
        ERROR: Server not responding

    An Enum cannot store extra data.

    Sealed Class Solution

    A Sealed Class can represent different states and some states can carry data.

        Example:

        sealed class Result {

            object Loading : Result()

            object Success : Result()

            data class Error(
                val message: String
            ) : Result()
        }

    Don't worry about the syntax yet.

    Just understand the meaning.

    This creates 3 possible states:

        Loading
        Success
        Error(message)

    Notice:

        Error("Internet failed")

    can store a message.

    Enums cannot do that.

    Focus on one line
        object Loading : Result()

    You already know what object means.

    This creates a singleton object called:

        Loading

    And:

        data class Error(
            val message: String
        ) : Result()

    creates an Error state that can carry data.

    Example:

        Result.Error("Network Error")
*/
// Enums can store only a limited set of constant states, whereas Sealed Classes can store states along with dynamic data.
// Enums define a fixed set of constant states, while Sealed Classes define a fixed set of state types that can carry different data at runtime.
// Sealed Classes have a fixed set of state types, but the data associated with those states can change at runtime.
sealed class Result // Only classes/objects defined inside this sealed class file can inherit from it.
{
    object Loading :
        Result() // object  Keyword.  Creates a Singleton Object. Singleton means: Only ONE object exists | Result is Parent class constructor.
    {
        override fun toString(): String {
            return "Loading"
        }
    }

    object Success : Result() {
        override fun toString(): String {
            return "Success"
        }
    }

    /*
    Now the REAL Power of Sealed Classes

        Enums can do:

            SUCCESS
            ERROR
            LOADING

        But they cannot store extra information.

        Sealed classes can.
    */
    // Data classes can carry extra information such as error messages, user data, API responses, etc.
    data class Error(
        var message: String
    ) : Result() {
        override fun toString(): String {
            return message
        }
    }

} // Sealed Class Ends

fun main() {
    var result = Result.Error("Internet Connection Interrupted")
    println(result) // How do I convert Loading into text?     For objects, Kotlin automatically provides a string representation.     Result:    Loading

    // Now let's see why Sealed Classes are useful with when.
    when (result) {
        Result.Loading -> println("...Please wait!")
        Result.Success -> println("...Data Loaded Successfully!")
        is Result.Error -> println("...${result.message}") // Here is keyword is used because there can be many Error objects with different data.
    }
} // Main Function Ends

/*
    Why Android Developers Love Sealed Classes

    Suppose you're loading user data from a server.

    Possible states:

        Loading
        Success(userData)
        Error(message)

    A sealed class models this perfectly:

        sealed class UiState {
            object Loading : UiState()
            data class Success(val name: String) : UiState()
            data class Error(val message: String) : UiState()
        }

    This is one of the most common patterns in modern Android development.
*/
