interface Camera {
    fun takePicture()
}

interface MusicPlayer {
    fun playMusic()
}

// A child class can implement multiple Interfaces | But a child class cannot inherit multiple parent class
class Smartphone : Camera, MusicPlayer {
    override fun takePicture() {
        println("taking picture using smartphone")
    }

    override fun playMusic() {
        println("playing music within smartphone")
    }
}

fun main() {
    val smartphone = Smartphone()
    smartphone.takePicture()
    smartphone.playMusic()
}