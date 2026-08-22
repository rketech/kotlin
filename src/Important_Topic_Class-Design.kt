/*
--------- Class Design -----------

    Now we move from State Management to Class Design.

    Step 1: Identify the Nouns

        A simple trick used by developers is:

        Read the project description and circle the nouns.

    For your ATM project:

        ATM
        Account
        Customer
        PIN
        Transaction
        Balance

    Not every noun becomes a class.

    We ask:     Does this thing have its own data and behavior?

    ATM     Has responsibilities like:

        Show Menu
        Accept User Input
        Handle Operations

    Possible class?     ✅ Yes

    class ATM :

        Account

            Has:

                Balance
                PIN
                Account Number
                Deposit
                Withdraw

    Possible class?     ✅ Definitely

    class Account :
        Transaction

            Has:

                Amount
                Type
                Date

    Possible class?    ✅ Yes

    data class Transaction
        Balance

            Should this be a class?

                Usually no.

            Balance is just data belonging to an Account.

    class Account(
        var balance: Double
    )

    PIN

        Should this be a class?

        Usually no.

    class Account(
        var pin: Int
    )

    PIN is data of an Account.

    ---------------------------

    First Design Exercise

        Suppose your ATM supports:

            Check Balance
            Deposit
            Withdraw
            PIN Verification
            Transaction History

        Which of these should definitely be a class?

        A)        Account

        B)        Balance

        C)        PIN

        D)        All of the above

        Just answer A, B, C, or D.

        A        ✅ Correct.

        Answer:         A) Account

        Why Account should be a class?

        An Account has both:

            Data (State)
                balance
                pin
                accountNumber
                transactionHistory

            Behavior (Functions)
                deposit()
                withdraw()
                checkBalance()
                verifyPin()

        Since it has both data and behavior, it is a perfect candidate for a class.

    ------------------------------------

    Why not Balance?
        var balance: Double

            Balance is just one piece of data belonging to an Account.

        Think:

            Account
             └── balance

        not:

            Account
             └── Balance Class

        Why not PIN?

            Similarly:

                var pin: Int

            PIN is data of an Account.

            It doesn't need its own class in a simple ATM application.

* */