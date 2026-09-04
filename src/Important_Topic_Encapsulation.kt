// Encapsulation is the process of keeping its data and function inside a boundary

class BankAccount() {
    private var balance: Double = 0.0

    fun deposit(depositAmount: Double) {
        balance += depositAmount
    }

    fun checkBalance(): Double {
        return balance
    }
}

fun main() {
    val bankAccount = BankAccount()
    bankAccount.deposit(5000.0)
    println(bankAccount.checkBalance())
}