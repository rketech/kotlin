import UserManager.currentUser

/*
    ---------- object and Singleton Pattern -----------
    Kotlin topic that gives the biggest Android payoff is:

    object and Singleton Pattern

    Android uses this constantly for:

        Constants
        Utility classes
        Shared managers
        Repository instances
        Dependency Injection concepts later

        ----------------------

        Kotlin object (Singleton)

        Before code, understand the problem.

        Suppose you create a class:

            class DatabaseManager

        Then:

            val db1 = DatabaseManager()
            val db2 = DatabaseManager()
            val db3 = DatabaseManager()

        Now you have 3 separate objects.

        Sometimes that's okay.

        But in Android, some things should exist only once:

            App settings manager
            Database connection manager
            Network manager
            Constants holder
            Logger

        For these, Kotlin provides:

            object

        An object creates a single instance automatically.
*/

object MyObject // Creates a Singleton Object named MyObject . Meaning Only one instance exists.
{
    var name = "Rakesh"
}

object Calculator // Creates a Singleton Object named Calculator . Meaning Only one instance exists.
{
    fun add(a: Int, b: Int): Int {
        return a + b
    }
}

// const means: This value is known at compile time and will never change.
object Constants // creates a singleton object named Constants
{
    const val BASE_URL = "https://api.example.com"
    const val APP_NAME = "My App"
}

object Counter {
    var count = 0

    fun increment() {
        count++
    }
}

object UserManager
{
    /* private set is a Kotlin feature that allows:
            Everyone can READ the value
            But only the class/object itself can CHANGE the value */
    var currentUser = "Guest"
        private set // ➡ Read from anywhere ✅ ➡ Write only inside class/object ✅
    fun login(name: String) {
        currentUser = name
    }
}

fun main() {
    println(MyObject.name)

    println(Calculator.add(2, 3)) // We never created Calculator() , we directly used Calculator.add()

    println(Constants.APP_NAME) // directly accesses its (Constants) property.

    Counter.increment() // Directly accessing the function
    Counter.increment() // Directly accessing the function

    println(Counter.count) // Directly accessing the property

    UserManager.login("Rakesh")
    //currentUser = "Ravi" // Operation NOT Allowed as currentUser is private set
    println("Current User : ${UserManager.currentUser}")

}

/*
-----------------------------
    Think of it as

    With a class:

        class Student

    You create objects:

        val s1 = Student()
        val s2 = Student()

    Multiple objects possible.

    With an object:

        object StudentManager

    Kotlin creates it automatically.

    There is only one:

        StudentManager

    for the whole app.

    ----------------------------

        Mental Model :
        Class
            Blueprint

                class Student

            Create objects:

                val s1 = Student()
                val s2 = Student()

            Multiple instances.

        Object

            Singleton

                object StudentManager

        Use directly:

                StudentManager

        Only one instance exists.

        ---------------------------
        ----Important-------------
        Why Android Developers Use object

        Imagine you have app-wide settings:

            object AppSettings {
                var isDarkMode = false
            }

        From anywhere in the app:

            AppSettings.isDarkMode = true

        and later:

            println(AppSettings.isDarkMode)

        You get the same value because there is only one instance.

        ------------------------------

        Common Android uses
            object Constants
            object NetworkManager
            object DatabaseProvider
            object SessionManager
            object AppSettings

        You'll encounter these frequently when building Android apps.
*/

