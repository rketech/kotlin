fun main(){

    println("Inclusive Range : (Start to End)")
    for(i in 1..5)
        println(i)

    println("Exclusive Find Value :")
    for (i in 1 until 10)
        println(i)

    println("Reverse Range :")
    for (i in 10 downTo 1)
        println(i)

    println("Step :")
    for (i in 10 downTo 1 step 2)
        println(i)
}