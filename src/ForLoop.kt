/*
    Kotlin For Loop
        Often when you work with arrays, you need to loop through all of the elements.
        To loop through array elements, use the for loop together with the in operator:
*/

fun main(){
    val cars = listOf("Maruti","Volvo","BMW","Audi","Mercedes")
    for(car in cars){
        println(car)
    }
}