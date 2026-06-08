/*
    Safe Call Operator (?.)
    The ?. means:

    If state is not null, get its length. Otherwise return null."
*/
fun main(){
    var state_01: String? = "Uttar Pradesh"
    println(state_01?.length)

    var state_02: String? = null // Here state_02 is null
    println(state_02?.length) // Kotlin does not try to access length.
}

/*
Notice what happened:

No crash
No error
Kotlin safely checked for null

That's why it's called the Safe Call Operator.
*/