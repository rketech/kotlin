/*
    Type Conversion
    Type conversion is when you convert the value of one data type to another type.

    To convert a numeric data type to another type, you must use one of the following functions:
            toByte(), toShort(), toInt(), toLong(), toFloat(), toDouble() or toChar()
*/
fun main(){
    // Type Conversion from Int to Long
    val num_01: Int = 999
    println("Value of num_01 is $num_01 and the data type currently is: " + num_01::class.simpleName)

    val num_02: Long = num_01.toLong()
    println("Value of num_02 is $num_02 after passing the num_01 value to it and the data type after type conversion is: " + num_02::class.simpleName)
}
