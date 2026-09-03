
fun greet(name: String = "Guest User") {
    println("Hello!, $name")
}

fun main(){
    greet("John")
    greet()
}