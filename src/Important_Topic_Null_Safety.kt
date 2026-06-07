/* Null Safety ? */

fun main(){
    // 1. Non-Nullable Variable :
    var name_01: String = "Rakesh" // if we assign null value there will be a compile error and the app will crash. This variable MUST always contain a String.
    println(name_01)
    println(name_01.length)

    // 2. Nullable Variable :
        //  If you want a variable to hold null, use ?
    var name_02: String? = null // The question mark means: This variable may contain a String OR may contain null.
    println(name_02)
}

/*
First Rule to Remember
    1. Non-nullable :
            a. String
            b. Int
            c. Double
            d. Boolean
                Cannot store null.

    2. Nullable :
            a. String?
            b. Int?
            c. Double?
            d. Boolean?
*/