object DatabaseHelper {
    const val database: String = "AppDB"

    fun connect() {
        println("Connected to $database")
    }
}

fun main(){
    // We are not required to create any object as DatabaseHelper itself an Object
    DatabaseHelper.connect()
}