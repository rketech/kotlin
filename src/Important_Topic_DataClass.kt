data class FoodItem(
    var name: String,
    var price: Double,
    var category: String
)

enum class Category {
    FAST_FOOD,
    SWEETS
}

fun main() {
    val item01 = FoodItem("Cheeze Burger", 90.0, Category.FAST_FOOD.toString())
    val item02 = FoodItem("Ras Malae", 120.0, Category.SWEETS.toString())

    println("I ate ${item01.name} and ${item02.name} priced at ${item01.price} and ${item02.price} respectively totaling to ${item01.price + item02.price} INR")
}