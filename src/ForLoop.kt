/*
    Kotlin For Loop
        Often when you work with arrays, you need to loop through all of the elements.
        To loop through array elements, use the for loop together with the in operator:
*/

fun main() {
    val cars = listOf("Maruti", "Volvo", "BMW", "Audi", "Mercedes")
    for (car in cars) {
        println(car)


    }

    /*
        You can loop through all kinds of arrays. In the example above, we used an array of strings.
        In the example below, we loop through an array of integers:
    */

    val points = mutableListOf(1, 2, 3, 4, 5)
    for (x in points) {
        println(x)
    }
}