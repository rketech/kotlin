    /*
        -------- State Management ---------

        Let's start with the most basic question.

            What is State?

                State simply means:

                    Data that can change while the program is running.

                        Example:

                            var balance = 1000.0

                                Initially:

                                    1000

                                After deposit:

                                  1500

                                After withdrawal:

                                    1200

                                The value changes.

                            Therefore:

                                balance

                                    is state.

                        Another example:

                            var enteredPin = 1234

                                User enters:

                                    1111

                                then:

                                    2222

                                then:

                                    3333

                                The value changes.

                                    So enteredPin is also state.

    ------------------------------

    fun main() {

        var balance = 1000.0

        balance += 500

        println(balance)
    }

    Here balance is a state. State is: Data whose value can change while the program is running.

    ------------------------------

    ATM Example

    In your ATM project, these are all examples of state:

    var balance = 10000.0
    var pin = 1234
    var isLoggedIn = false
    var transactionCount = 0

    Because their values can change while the program runs.

    ------------------------------

    Next Concept: Who Owns the State?

    Suppose you write:

    fun main() {

        var balance = 1000.0

        deposit(balance)

        println(balance)
    }

    fun deposit(balance: Double) {
        balance + 500
    }

    main() Owns the state Why?
    Because: The variable is created here:

    The function:

    fun deposit(balance: Double)

    only receives a copy of the value. It does not own the original variable.

    Think of it like this:

    main()
     └── balance = 1000

    deposit() can look at the value that was passed to it, but the actual state belongs to main().

    This idea becomes very important in Class Design.

    A common beginner mistake is:

    var balance = 1000.0

    fun deposit() { ... }

    fun withdraw() { ... }

    fun checkBalance() { ... }

    Everything starts touching the same global state and the program becomes hard to manage.

    Instead, we want the Account class to own the balance.

    class Account(
        var balance: Double
    )

    Now:

    Account
     └── owns balance

    which is much cleaner.

    ------------------------------

    In this code:

    class Account(
        var balance: Double
    )

    fun main() {

        val account = Account(1000.0)
    }

    Account owns the state balance

    Why?

    The state is declared inside the class:

    class Account(
        var balance: Double
    )

    Therefore:

    Account
     └── balance

    The Account object owns the balance.

    What does main() own?
    fun main() {
        val account = Account(1000.0)
    }

    main() owns:

    account

    (the reference to the object)

    But the actual state:

    balance

    belongs to the Account object.

    Think of it like:

    main()
     └── account ------------┐
                              │
                        Account Object
                        └── balance = 1000
    This is the foundation of good Class Design

    --------------------

    For an ATM:

    ❌ Bad design:

    var balance = 1000.0
    var pin = 1234
    var transactionHistory = mutableListOf<String>()

    Everything lives in main().

    ✅ Better design:

    class Account(
        var balance: Double,
        var pin: Int
    )

    Now the account owns its own data.

    ---------------------------------

    Next State Management Concept

    Let's distinguish between:

    Local State

    State that exists only inside a function.

    fun deposit() {
        var amount = 500
    }

    amount is local to deposit().

    Object State

    State that belongs to an object.

    class Account(
        var balance: Double
    )

    balance belongs to the Account object.

    -------------------------------------

    Challenge

    Who owns amount?

    class Account(
        var balance: Double
    )

    fun deposit() {

        var amount = 500

        println(amount)
    }

    A) deposit()

    B) Account

    Just answer A or B.

    A

    ✅ Correct.

    Answer:

    A) deposit()

    Why?

    amount is created inside the function:

    fun deposit() {

        var amount = 500
    }

    So it belongs only to that function.

    Think of it like:

    deposit()
     └── amount = 500

    When deposit() finishes, amount disappears.

    Compare with Object State
    class Account(
        var balance: Double
    )

    Here:

    Account Object
     └── balance = 1000

    The balance stays alive as long as the Account object exists. This must survive for the entire life of the account.

    ATM Example

    Suppose the user enters:

    Deposit Amount = 500

    A good design is:

    fun deposit() {

        val amount = 500
    }

    because amount is needed only during the deposit operation.

    That's local state.

    But:

    class Account(
        var balance: Double
    )

    The balance must survive after the deposit finishes.

    That's object state.

    Rule of Thumb

    Ask yourself:

    "Does this data need to survive after the function ends?"

    If No → local variable.

    val amount = 500

    If Yes → it probably belongs in an object/class.

    var balance = 1000.0

    --------------------------------

    Quick ATM Design Exercise

    Imagine an ATM.

    Which one should be object state inside Account?

    A)

    balance

    B)

    amountEnteredForThisDeposit

    C)

    Both A and B

    Think about which data should still exist after the deposit function finishes.

    A

    ✅ Correct.

    Answer:

    A) balance

    Why?
    balance
    var balance = 1000.0

    This must survive for the entire life of the account.

    Example:

    Initial Balance = 1000
    Deposit = 500
    New Balance = 1500
    Withdraw = 200
    New Balance = 1300

    The ATM must remember the balance between operations.

    So balance should be object state:

    class Account(
        var balance: Double
    )
    amountEnteredForThisDeposit
    val amount = 500

    This is only needed while performing the deposit.

    After:

    balance += amount

    the amount itself is no longer needed.

    So it should be local state:

    fun deposit() {
        val amount = 500
    }
    This is the First Class Design Skill

    When you create a class, ask:

    Does this data represent the long-term state of the object?

    If yes → property.

    If no → local variable.

    ----------------------------------

    ATM Example

    Which should be properties of Account?

    balance
    pin
    accountNumber

    These describe the account itself.

    So:

    class Account(
        val accountNumber: String,
        var pin: Int,
        var balance: Double
    )

    makes sense.

    Which should NOT be properties?

    depositAmount
    withdrawAmount
    menuChoice

    These are temporary values used during one operation.

    They should usually be local variables inside functions.

    */