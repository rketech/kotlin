/*
    Kotlin Arrays :
        Arrays are used to store multiple values in a single variable, instead of creating separate variables for each value.
*/

fun main() {
    println("Creating an array : ")
    val cars = arrayOf(
        "Volvo",
        "BMW",
        "Ford",
        "Mazda"
    ) // To create an array, use the arrayOf() function, and place the values in a comma-separated list inside it:
    for (car in cars) {
        println(car)
    }

    /*
    -----------------------------------------------
    Access the Elements of an Array :
        You can access an array element by referring to the index number, inside square brackets.
        In this example, we access the value of the first element in cars:
    */
    println("Accessing the Elements of an Array : ")
    println(cars[3]) // Note: Just like with Strings, Array indexes start with 0: [0] is the first element. [1] is the second element, etc.

    /*
    ------------------------------------------------
    Change an Array Element :
        To change the value of a specific element, refer to the index number:
    */
    println("Changing an Array Element : ")
    cars[2] = "Mahindra"
    for (car in cars){
        println(car)
    }

    /*
    ------------------------------------------------
    Array Length / Size :
        To find out how many elements an array have, use the size property:
    */
    println("Array Length / Size :")
    println(cars.size)

    /*
    -----------------------------------------------
    Check if an Element Exists :
        You can use the in operator to check if an element exists in an array:
    */
    println("Check if an Element Exists : ")
    if ("BMW" in cars){
        println("BMW exists!")
    }else{
        println("Not exists!")
    }

    /*
    -----------------------------------------------
    Loop Through an Array :
        Often when you work with arrays, you need to loop through all of the elements.
        You can loop through the array elements with the for loop, which you will learn even more about in the next chapter.
        The following example outputs all elements in the cars array:
     */
    println("Loop Through an Array : ")
    for (car in cars){
        println(car)
    }
}