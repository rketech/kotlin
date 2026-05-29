// Kotlin Variables
// Variables are containers for storing data values.
// To create a variable, use var or val, and assign a value to it with the equal sign (=)
// The difference between var and val is that variables declared with the var keyword can be changed/modified, while val variables cannot.
// Unlike many other programming languages, variables in Kotlin do not need to be declared with a specified type (like "String" for text or "Int" for numbers

/*
   Syntax
   var variableName = value
   val variableName = value
*/


fun main() {
    val name_01 = "John"       // String (Text) data type
    val birthyear_01 = "1990" // Int (Number) Data type

    // Kotlin is smart enough to understand that "John" is a String (text), and that 1990 is an Int (number) variable.

    println("Printing data without specifying data type:")
    println(name_01)            // Print the value from name variable
    println(birthyear_01)      // Print the value from the birthyear variable

    // However, it is possible to specify the type if you insist as below:
    val name_02: String = "Jane"
    val birthyear_02: Int = 1990

    println("Printing data by specifying data type:")
    println(name_02)
    println(birthyear_02)

    // You can also declare a variable without assigning the value, and assign the value later.
    // However, this is only possible when you specify the type:
    val name_03: String // Declaring a variable specifying the data type
    name_03 = "John"
    println("First Declaring a variable specifying the data type and then printing data:")
    println(name_03)
}