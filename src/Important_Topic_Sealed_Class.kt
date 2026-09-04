sealed class MusicState(){

    data class Play(
        val name: String,
        val position: Int
    ): MusicState()

    data class Pause(
        val name: String,
    ): MusicState()

    // Since we are not passing any data,
    // instead of creating data class we are creating an object
    object Stop: MusicState()
}

fun handleState(state: MusicState){
    when(state){
        is MusicState.Play -> println("Playing ${state.name} at position ${state.position} seconds")
        is MusicState.Pause -> println("${state.name} paused")
        is MusicState.Stop -> println("Music stopped")
    }
}

fun main(){
    val song01 = MusicState.Play("Kal Ho Na Ho", 12)
    val song02 = MusicState.Pause("Dil Le Liya")
    val song03 = MusicState.Stop

    handleState(song03 )
}