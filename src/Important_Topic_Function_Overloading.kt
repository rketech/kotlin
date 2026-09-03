fun orderSummary(item01: String) {
    println("---Order Summary---Item 01")
    println("1. $item01")
}

fun orderSummary(item01: String, item02: String) {
    println("---Order Summary---Item 02")
    println("1. $item01")
    println("2. $item02")
}

fun orderSummary(item01: String, item02: String, discount: Int) {
    println("---Order Summary---Item 02")
    println("1. $item01")
    println("2. $item02")
    println("--------------------------")
    println("Discount: $discount%")
}

fun main(){

    orderSummary("Bread")
    println("")
    orderSummary("Butter","Sugar")
    println("")
    orderSummary("Rice","Dal",5)
}