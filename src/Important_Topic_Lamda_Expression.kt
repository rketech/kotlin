fun operate(
    a: Int,
    b: Int,
    operation: (Int, Int) -> Int
): Int {
    return operation(a, b)
}

fun main() {

    val number = { n: Int -> n * n }
    println("Square of 4 is ${number(4)}")
    println("")

    println("Operation:")
    val result = operate(
        3, 8, { a, b -> a + b }
    )
    println("Result: $result")

}