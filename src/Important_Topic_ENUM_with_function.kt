enum class PaymentMethod(val fee: Double) {
    CASH(0.0),
    CARD(2.0),
    UPI(0.5),
    PAYPAL(3.5);

    fun finalAmount(amount: Double): Double {
        return amount + ((amount * fee) / 100)
    }
}

fun main() {
    val bill = PaymentMethod.CASH
    println("Final Amount: ${bill.finalAmount(100.0)}")
}