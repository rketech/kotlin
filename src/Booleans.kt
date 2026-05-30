/*
    Kotlin Booleans
        Very often, in programming, you will need a data type that can only have one of two values, like:
            YES / NO
            ON / OFF
            TRUE / FALSE
        For this, Kotlin has a Boolean data type, which can take the values true or false.

        Boolean Values :
*/

fun main(){
    // A boolean type can be declared with the Boolean keyword and can only take the values true or false :
    println("Boolean value by specifying the data type :")
    val isKotlineFun_01: Boolean = true
    val isPizzaHealthy_01: Boolean = false
    println("isKotlineFun: $isKotlineFun_01")
    println("isPizzaHealthy: $isPizzaHealthy_01")

    // The example above can also be written without specifying the type, as Kotlin is smart enough to understand that the variables are Booleans :
    println("Boolean value without specifying the data type :")
    val isKotlineFun_02 = true
    val isPizzaHealthy_02 = false
    println("isKotlineFun: $isKotlineFun_02")
    println("isPizzaHealthy: $isPizzaHealthy_02")
}