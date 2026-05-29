// Kotlin Data Types
// In Kotlin, the type of a variable is decided by its value to save memory.

/*

    val myNum = 5             // Int
    val myDoubleNum = 5.99    // Double
    val myLetter = 'D'        // Char
    val myBoolean = true      // Boolean
    val myText = "Hello"      // String


    Data types are divided into different groups:

    I. Numbers
    II. Booleans
    III. Characters
    IV. Strings
    V. Arrays

*/

fun main() {
/*
I. Numbers:
     Number types are divided into two groups:
         A. Integer types store whole numbers, positive or negative (such as 123 or -456), without decimals. Valid types are Byte, Short, Int and Long.
         B. Floating point types represent numbers with a fractional part, containing one or more decimals. There are two types: Float and Double.

        NOTE: If you don't specify the type for a numeric variable, it is most often returned as Int for whole numbers and Double for floating point numbers.

        -------------------------------------------
    A. Integer Types
        -------------------------------------------
        A1. Byte:
            The Byte data type can store whole numbers from -128 to 127.
            This can be used instead of Int or other integer types to save memory when you are certain that the value will be within -128 and 127:
*/
    val num_01: Byte = 100
    println("The value of num_01 with BYTE data type is: $num_01")

    /*
        -------------------------------------------
        A2. Short:
            The Short data type can store whole numbers from -32768 to 32767
*/
    val num_02: Short = 32767
    println("The value of num_02 with SHORT data type is: $num_02")

    /*
        -------------------------------------------
        A3. Int:
            The Int data type can store whole numbers from -2147483648 to 2147483647
            A whole number is an Int as long as it is up to 2147483647. If it goes beyond that, it is defined as Long
*/
    val num_03: Int = 2147483647
    println("The value of num_03 with INT data type is: $num_03")

    /*
        -------------------------------------------
        A4. Long:
            The Long data type can store whole numbers from -9223372036854775808 to 9223372036854775807.
            This is used when Int is not large enough to store the value. Optionally, you can end the value with an "L":
            A whole number is an Int as long as it is up to 2147483647. If it goes beyond that, it is defined as Long
*/

    val num_04: Long = 9223372036854775807L
    println("The value of num_04 with LONG data type is: $num_04")

/*
        -------------------------------------------
     B. Floating point types:
        -------------------------------------------
           Floating point types represent numbers with a decimal, such as 9.99 or 3.14515.
           The Float and Double data types can store fractional numbers.
                The precision of a floating point value indicates how many digits the value can have after the decimal point.
                The precision of Float is only six or seven decimal digits, while Double variables have a precision of about 15 digits.
                Therefore it is safer to use Double for most calculations.
                Also note that you should end the value of a Float type with an "F".
        -------------------------------------------
            B1. Float:
*/
    val num_05: Float = 5.75F
    println("The value of num_05 with FLOAT data type is: $num_05")

/*
        -------------------------------------------
            B2. Double:
*/
    val num_06: Double = 19.99
    println("The value of num_06 with DOUBLE data type is: $num_06")

/*
        -------------------------------------------
II. Booleans
    The Boolean data type can only take the values true or false
*/
    val isKotlineFun: Boolean = true
    val isPizzaHealthy: Boolean = false
    println("The value of isKotlineFun: $isKotlineFun")
    println("The value of isPizzaTasty: $isPizzaHealthy")

/*
        -------------------------------------------
III. Characters
    The Char data type is used to store a single character. A char value must be surrounded by single quotes, like 'A' or 'c'
*/
    val grade: Char = 'A'
    println("The value of grade with CHAR is: $grade")

/*
        -------------------------------------------
IV. Strings:
    The String data type is used to store a sequence of characters (text). String values must be surrounded by double quotes
*/
    val myText: String = "Hello World! This is my Text"
    println("The value of myText with STRING data type is: $myText")
}