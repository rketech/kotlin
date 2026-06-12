/*
----------Enum Classes-------------
    Why?

    Because Android apps constantly use fixed choices such as:

        SUCCESS
        ERROR
        LOADING

        or

        MALE
        FEMALE
        OTHER

        or

        PENDING
        APPROVED
        REJECTED
        ---------------------------
        Let's start with a real-world problem.

        Suppose you're creating an Advocate App.

        A case can have only these statuses:

            Pending
            Approved
            Rejected

        One approach is:

            var status = "Pending"

        But this is dangerous because someone could accidentally write:

            status = "Pendding"
            status = "Pendig"
            status = "abcxyz"

        All are valid Strings, but logically wrong.

            Solution: Enum

        Enum means:

        A fixed set of allowed values.

            enum class Status {
                PENDING,
                APPROVED,
                REJECTED
            }

        Now only these 3 values are allowed.

        Solution: Enum

        Enum means:

            A fixed set of allowed values.

                    enum class Status {
                        PENDING,
                        APPROVED,
                        REJECTED
                    }

        Now only these 3 values are allowed.
*/
enum class Status {
    PENDING,
    APPROVED,
    REJECTED
}

fun main() {
    // for Status enum class
    var status: Status = Status.PENDING
    println("Case Status: $status")

    if (status == Status.PENDING) {
        println("Waiting to be picked")
    } else if (status == Status.APPROVED) {
        println("Your case has been granted")
    } else if (status == Status.REJECTED) {
        println("Your case has been rejected")
    } else {
        println("Status unknown")
    }

    when (status) {
        Status.PENDING -> println("Waiting to be picked (When)")
        Status.APPROVED -> println("You case have been granted (When)")
        Status.REJECTED -> println("Your case has been rejected (When)")
    }

    // for UiState enum class | Very common in Android apps.
    var screenState = UiState.LOADING
    println("...$screenState")

    // for TrafficLight enum class
    val light = TrafficLight.GREEN
    when (light) {
        TrafficLight.RED -> println("Stop")
        TrafficLight.YELLOW -> println("Wait")
        TrafficLight.GREEN -> println("Go")
    }
}

/*
    Think of Enum as a Restricted Choice

    Instead of:

        val gender = "Male"

    You can do:

        enum class Gender {
            MALE,
            FEMALE,
            OTHER
        }

    Usage:

        val gender = Gender.MALE

    Now:

    ✅ Allowed

        Gender.MALE
        Gender.FEMALE
        Gender.OTHER

    ❌ Not allowed

        Gender.ABC
        Gender.Rakesh

    Compiler error.

    ----------------------

    Android Example

        Imagine a network request.
*/
enum class UiState {
    SUCCESS,
    LOADING,
    ERROR
    // implementation for this enum class is in the main function above
}

/*
    Why Android Developers Use Enums

    Imagine an Advocate App:

        enum class CaseStatus {
            PENDING,
            APPROVED,
            REJECTED
        }

    Then:

        when(caseStatus) {
            CaseStatus.PENDING -> showPendingUI()
            CaseStatus.APPROVED -> showApprovedUI()
            CaseStatus.REJECTED -> showRejectedUI()
        }

    This is safer than strings:

        "Pending"
        "pending"
        "PENDING"
        "Pendding"

    because the compiler prevents invalid values.
*/

enum class TrafficLight {
    RED,
    YELLOW,
    GREEN
    // implementation for this enum class is in the main function above
}

