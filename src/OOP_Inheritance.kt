/*
Kotlin Inheritance (Subclass and Superclass)
    In Kotlin, it is possible to inherit class properties and functions from one class to another. We group the "inheritance concept" into two categories:

    subclass (child) - the class that inherits from another class
    superclass (parent) - the class being inherited from

    Why And When To Use "Inheritance"?
        - It is useful for code reusability: reuse properties and functions of an existing class when you create a new class.
*/

// In the example below, MyChildClass (subclass) inherits the properties from the MyParentClass class (superclass):

// Creating SuperClass | Use the open keyword in front of the superclass/parent, to make this the class other classes should inherit properties and functions from.
open class MyParentClass {
    val x = 5
}

// Creating Subclass
class MyChildClass :
    MyParentClass() // To inherit from a class, specify the name of the subclass, followed by a colon :, and then the name of the superclass.
{
    fun myFunction() {
        println(x)
    }
}

// Creating Main Function
fun main() {
    val obj_MyChildClass = MyChildClass()
    obj_MyChildClass.myFunction()
}

