/*
    Kotlin Strings
    Strings are used for storing text.

    A string contains a collection of characters surrounded by double quotes
    Unlike Java, you do not have to specify that the variable should be a String.
    Kotlin is smart enough to understand that the greeting variable in the example above is a String because of the double quotes.

    However, just like with other data types, you can specify the type if you insist
*/

fun main(){

    var name_01 = "Rakesh"
    println("Value stored in name_01 variable is ${name_01}")

    // Note: If you want to create a String without assigning the value (and assign the value later), you must specify the type while declaring the variable
    var name_02: String
    name_02 = "Rakesh"
    println("Value assigned later in name_02 variable is ${name_02}")

    /*
    -----------------------------------
    Access a String :
    To access the characters (elements) of a string, you must refer to the index number inside square brackets.
    String indexes start with 0. In the example below, we access the first and third element in txt
    [0] is the first element. [1] is the second element, [2] is the third element, etc.
    */
    var name_03 = "Rakesh"
    println("The Character value at [0]th index is ${name_03[0]}")
    println("The Character value at [2]nd index is ${name_03[2]}")

    /*
    -----------------------------------
    String Length :
    A String in Kotlin is an object, which contain properties and functions that can perform certain operations on strings,
    by writing a dot character (.) after the specific string variable.
    For example, the length of a string can be found with the length property:
    */
    var name_04 = "Rakesh Ji"
    println("The length of value in name_04 variable that stores ${name_04} is ${name_04.length} characters")

    /*
    -----------------------------------
    String Functions :
    There are many string functions available, for example uppercase() and lowercase():
    */
    println("Printing values to lower case : ${name_04.lowercase()}")
    println("Printing values to upper case : ${name_04.uppercase()}")

    /*
    -----------------------------------
    Comparing Strings :
    The compareTo(string) function compares two strings and returns 0 if both are equal:
    */
    var car_01 = "Maruti"
    var car_02 = "maruti"
    println("Compairing value of car_01 with car_02 ${car_01.compareTo(car_02, ignoreCase = true)}")

    /*
    -----------------------------------
    Finding a String in a String :
    The indexOf() function returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):
    */
    var txt = "Please locate where 'locate' occurs!"
    println("Index position of the word locate is ${txt.indexOf("Locate", ignoreCase = true)}")

    /*
    -----------------------------------
    Quotes Inside a String :
    To use quotes inside a string, use single quotes (')
    */
    txt = "That's Great!"
    println("Text with single quotation mark is ${txt}")

    /*
    -----------------------------------
    String Concatenation :
        A. The + operator can be used between strings to add them together to make a new string. This is called concatenation:
    */
    var firstName = "Rakesh"
    var lastName = "Sharma"
    println("Concatinating firstName and lastName using + operator the result is : ${firstName + " " + lastName}") // Note that we have added an empty text (" ") to create a space between firstName and lastName on print.

        // B. You can also use the plus() function to concatenate two strings:
    firstName = "John "
    lastName = "Doe"
    println("Concatinating firstName and lastName using plus() function the result is : ${firstName.plus(lastName)}")

    /*
    -----------------------------------
    String Templates/Interpolation :
        Instead of concatenation, you can also use "string templates", which is an easy way to add variables and expressions inside a string.
        Just refer to the variable with the $ symbol:
    */
    println("Value after using String Templates/Interpolation is $firstName $lastName")
}