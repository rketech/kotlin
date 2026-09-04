class Place(
    var city: String? = null
){
    var country: String? = null

    constructor(city: String, country: String) : this(city) {
        this.country = country
    }
}

fun main(){
    val place = Place(

    )
}