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

    object MyObject{
        var name = "Rakesh"
    }

    fun main(){
        println(MyObject.name)
}

/*
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
*/

