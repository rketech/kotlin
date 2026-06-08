/*
Combining Safe Call + Elvis
    This is extremely common.
*/

fun main(){
    val name_01: String? = "Rakesh Sharma"
    println("name_01 value: ${name_01?.length ?: 0}")

    val name_02: String? = null
    println("name_02 value: ${name_02?.length ?: 0}")

    var city: String? = null
    val city_result = city ?: "Not Provided"
    println("city_result value: ${city_result}")

    /*-----------Why Android Developers Love Elvis Operator---------*/
    // Imagine:
        val userName: String? = null
    // Instead of showing:
    //          null
    // on the screen, you can show:
        val displayName = userName ?: "Guest User"
    // Now the UI always has something meaningful to display.
}