/*
    Kotlin Operators
    Operators are used to perform operations on variables and values.

    The value is called an operand, while the operation (to be performed between the two operands) is defined by an operator

    Kotlin divides the operators into the following groups:

    1. Arithmetic operators
    2. Assignment operators
    3. Comparison operators
    4. Logical operators

    ---------------------------------------
    1. Arithmetic operators :
            Arithmetic operators are used to perform common mathematical operations
    ---------------------------------------
*/

fun main(){
    println("1. Arithmetic operators : ")
/*
    Operator	Name	    Description	                Example
       +	    Addition	Adds together two values	x + y
*/

    val num_01 = 5
    val num_02 = 10
    println("Sum of num_01 & num_02 is ${num_01 + num_02}")

/*
    ---------------------------------------
    Operator	Name	            Description	                        Example
        -	    Subtraction	        Subtracts one value from another	x - y
*/
    val num_03 = 5
    val num_04 = 10
    println("Difference between num_03 & num_04 is ${num_04 - num_03}")

/*
    ---------------------------------------
    Operator	Name	            Description	                        Example
        *	    Multiplication	    Multiplies two values	            x * y
*/
    val num_05 = 5
    val num_06 = 10
    println("Product of num_05 & num_06 is ${num_05 * num_06}")

/*
    ---------------------------------------
    Operator	Name	            Description	                        Example
        /	    Division	        Divides one value from another	    x / y
*/
    val num_07 = 5
    val num_08 = 10
    println("Quotient after dividing num_08 by num_07 is ${num_08 / num_07}")

/*
    ---------------------------------------
    Operator	Name	            Description	                        Example
        %	    Modulus	            Returns the division remainder	    x % y
*/
    val num_09 = 5
    val num_10 = 10
    println("Remainder after dividing num_10 by num_09 is ${num_10 % num_09}")

/*
    ---------------------------------------
    Operator	Name	            Description	                        Example
        ++	    Increment	        Increases the value by 1	         ++x
*/
    var num_11 = 5
    num_11++
    println("Value of num_11 after increment is ${num_11}")

/*
    ---------------------------------------
    Operator	Name	            Description	                        Example
        --	    Decrement	        Decreases the value by 1	         --x
*/
    var num_12 = 5
    num_12--
    println("Value of num_12 after decrement is ${num_12}")

    println("2. Assignment operators : ")
/*
    ---------------------------------------
    2. Assignment operators :
            Assignment operators are used to assign values to variables
    ---------------------------------------

        Operator	Example	        Same As
            =	     x = 5	        x = 5
*/
    val num_13 = 5
    println("Value of num_13 after assigning is ${num_13}")
/*
    ---------------------------------------
        Operator	Example	        Same As
            +=	     x += 3	        x = x + 3
*/
    var num_14 = 5
    num_14 += num_14
    println("Value of num_14 after increasing is ${num_14}")

/*
    ---------------------------------------
        Operator	Example	        Same As
            -=	     x -= 3	        x = x - 3
*/
    var num_15 = 5
    num_15 -= num_15
    println("Value of num_15 after increasing is ${num_15}")

/*
    ---------------------------------------
        Operator	Example	        Same As
            *=	     x *= 3	        x = x * 3
*/
    var num_16 = 5
    num_16 *= num_16
    println("Value of num_16 after multiplication is ${num_16}")

/*
    ---------------------------------------
        Operator	Example	        Same As
            /=	     x /= 3	        x = x / 3
*/
    var num_17 = 5
    num_17 /= num_17
    println("Value(Quotient) of num_17 after division is ${num_17}")

    /*
        ---------------------------------------
            Operator	Example	        Same As
                %=	     x %= 3	        x = x % 3
    */
    var num_18 = 5
    num_18 %= num_18
    println("Value(Remainder) of num_18 after division is ${num_18}")

    println("3. Comparison operators : ")
/*
    ---------------------------------------
    3. Comparison operators :
            Comparison operators are used to compare two values, and returns a Boolean value: either true or false
    ---------------------------------------

        Operator	Name	                    Example
            ==	    Equal to	                x == y
*/
    val num_19 = 5
    val num_20 = 10
    println("Is num_19 Equal To num_20 ${num_19 == num_20}") // returns false because 5 is not equal to 10

/*
    ---------------------------------------
        Operator	Name	                    Example
            !=	    Not equal	                x != y
*/
    val num_21 = 5
    val num_22 = 10
    println("Is num_22 Not Equal To num_22 ${num_21 != num_22}") // returns true because 5 is not equal to 10

/*
    ---------------------------------------
        Operator	Name	                    Example
            >	    Greater than	            x > y
*/
    val num_23 = 5
    val num_24 = 10
    println("Is num_23 Greater than num_24 ${num_23 > num_24}") // returns false because 5 is not Greater than 10

/*
    ---------------------------------------
        Operator	Name	                    Example
            <	    Less than	                x < y
*/
    val num_25 = 5
    val num_26 = 10
    println("Is num_25 Less than num_26 ${num_25 < num_26}") // returns true because 5 is Less than 10

/*
    ---------------------------------------
        Operator	Name	                    Example
            >=	    Greater than or equal to	x >= y
*/
    val num_27 = 5
    val num_28 = 10
    println("Is num_27 Greater than or equal to num_28 ${num_27 >= num_28}") // returns false because 5 is not Greater than or equal to 10

/*
    ---------------------------------------
            Operator	Name	                    Example
                <=	    Less than or equal to	    x <= y
*/
    val num_29 = 5
    val num_30 = 10
    println("Is num_29 Less than or equal to num_30 ${num_29 <= num_30}") // returns true because 5 is Less than 10

/*
    ---------------------------------------
    4. Logical operators
            Logical operators are used to determine the logic between variables or values
    ---------------------------------------

    Operator	Name	        Description	                                    Example
       && 	    Logical and	    Returns true if both statements are true    	x < 5 &&  x < 10
*/
    val num_31 = 5
    println("Is num_31 greater than 3 and (&&) less than 10 : ${num_31 > 3 && num_31 < 10}") // returns true because 5 is greater than 3 AND 5 is less than 10

/*
    ---------------------------------------
    Operator	Name	        Description	                                    Example
       || 	    Logical or	    Returns true if one of the statements is true	x < 5 || x < 4
*/
    val num_32 = 5
    println("Is num_32 greater than 5 or (||) less than 10 : ${num_32 > 5 || num_32 < 10}") // returns true because one of the conditions are true (5 is not greater than 5, but 5 is less than 10)

/*
    ---------------------------------------
    Operator	Name	        Description	                                    Example
       !	    Logical not	    Reverse the result, returns false if the result is true
*/
    val num_33 = true
    println("After reversing (!) the boolean value of num_33 it is ${!num_33}") // returns false because the ! (not) operator reverses the result
}



