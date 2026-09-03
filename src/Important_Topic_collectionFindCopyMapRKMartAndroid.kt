fun main() {
    /*
    What is a Collection?
        A collection is simply a way of keeping multiple values together.
    */

    // Creating a collection listOf() fruits to perform the find() operation on to it
    // What happens if find() doesn't find anything? result = null
    val fruits = listOf(
        "Apple",
        "Banana",
        "Pear",
        "Grapes",
        "Pineapple"
    )

    val result = fruits.find { fruit ->
        fruit == "Pear1"
    }

    //Comment: 'it' is the short form replacing fruit -> fruit
    //val result = fruits.find { it == "Pear" }

    println("Result after find() is : $result")

    // Creating a collection listOf() numbers to perform the map() operation on to it
    val numbers_1 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // I want to create a new list where every number is increased by 1.
    val newNumbers_1 = numbers_1.map { number -> number + 1 }

    /*
    Important distinction
        map() does not mean "find something."
    It means:
        Go through every item and produce a corresponding value for the new list.*/
    println("New numbers after map() is : $newNumbers_1")

    // map() can also leave something unchanged
    // I say: "Only increase 2. Leave everything else alone."

    val number_2 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val newNumbers_2 = number_2.map { number ->
        if (number == 2) {
            number + 1
        } else {
            number
        }
    }
    println("New numbers after map() keeping every number in original except 2 is : $newNumbers_2")

    /*
    copy()
        Now we need to understand copy().
        copy() is particularly useful with a Kotlin data class.
     */

    data class Student(
        val name: String,
        val age: Int
    )

    val student_1 = Student(
        "John",
        18
    )

    println("Old Age : ${student_1.name}'s age is ${student_1.age}")

    // Now using copy() which works on data class we will be increasing the age by 1
    // New virtual list is created and changes are applied on that new list
    val student_2 = student_1.copy(age = 19)

    println("New Age : ${student_2.name}'s age is ${student_2.age}")
    println("            But")
    // Old List is unchanged.
    println("Old Age is still: ${student_1.name}'s age is ${student_1.age}")

    // Now combine map() + copy()
    // This is the important bridge to RKMart.

    /*
    map() creates a new list by processing every element of the original employees list. The original list remains unchanged.

    map() iterates through each Employee object one by one. employee represents the current Employee object being processed.
    The -> separates the lambda parameter (employee) from the action that will be performed on that object.

    For every employee, we check whether employee.name is equal to "Rahul". If the condition is true, copy() creates
    a new Employee object with the same values as the original object, except that the salary is increased by 30000.

    If the name is not "Rahul", we return the original employee object. Finally, map() collects the returned result from every
    iteration into a new list called updateSalary.
    */

    data class Employee(
        val name: String,
        val salary: Int
    )

    val employees = listOf(
        Employee("John", 90000),
        Employee("Rahul", 59000),
        Employee("Frank", 88000),
        Employee("Neha", 120000),
        Employee("Alex", 150000),
    )

    val updateSalary = employees.map { employee ->
        if (employee.name == "Rahul") {
            employee.copy(salary = employee.salary + 30000)
        } else {
            employee
        }
    }

    println("Updated Salary: $updateSalary")
    
    println("New Employee : ${updateSalary[0].name}'s salary is ${updateSalary[0].salary}")
    println("New Employee : ${updateSalary[1].name}'s salary is ${updateSalary[1].salary}")
    println("New Employee : ${updateSalary[2].name}'s salary is ${updateSalary[2].salary}")
    println("New Employee : ${updateSalary[3].name}'s salary is ${updateSalary[3].salary}")
    println("New Employee : ${updateSalary[4].name}'s salary is ${updateSalary[4].salary}")



}

