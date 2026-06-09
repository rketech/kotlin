/*
Not-Null Assertion (!!)
    This operator basically tells Kotlin:
        "Trust me. This value is not null."
*/
fun main(){
    var name_01: String? = "Rakesh Sharma"
    println("Not-Null Assertion (!!) value is : ${name_01!!.length}")
}

/*
This null-safety section is one of the most valuable Kotlin topics for Android because you'll use it constantly with:

    API responses
    Database values
    User input
    Jetpack Compose state
    Navigation arguments
    Room database entities
*/
