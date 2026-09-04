interface Remote{
    fun powerOn()
    fun powerOff()
}

class TV: Remote{
    override fun powerOn() {
        println("Power on")
    }
    override fun powerOff() {
        println("Power off")
    }
}

fun main(){
    val tvRemote = TV()
    tvRemote.powerOn()
    tvRemote.powerOff()
}