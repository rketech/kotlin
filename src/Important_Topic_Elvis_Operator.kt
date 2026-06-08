/*
Elvis Operator (?:)

Problem With Safe Calls

    Suppose we are building an Android app.
    A user may or may not have entered their name.

            var name: String? = null
        Now:
            println(name?.length)
        Output:
            null

        That is safe.

        But what if we don't want null?
        What if we want:
            0
        instead?
        Or:
            Unknown User
        instead?
    This is where the Elvis Operator comes in.

    value ?: defaultValue

    Meaning:

        If value is not null, use it.
        Other-wise use defaultValue.
*/
fun main(){
    var name_01: String? = "Rakesh"
    println(name_01 ?: "Default Value for name_01")

    var name_02: String? = null
    println(name_02 ?: "Default Value for name_02") // Default value is printed as the name_02 is null
}