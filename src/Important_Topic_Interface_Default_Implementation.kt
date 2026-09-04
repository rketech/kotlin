interface Camera2 {
    fun takePicture2() {
        // Default Implementation of Interface
        println("taking picture using Camera2")
    }
}

interface MusicPlayer2 {
    fun playMusic2()
}

// A child class can implement multiple Interfaces | But a child class cannot inherit multiple parent class
class Smartphone2 : Camera2, MusicPlayer2 {

    override fun playMusic2() {
        println("playing music within smartphone")
    }
}

fun main() {
    val smartphone2 = Smartphone2()
    smartphone2.takePicture2()
    smartphone2.playMusic2()
}