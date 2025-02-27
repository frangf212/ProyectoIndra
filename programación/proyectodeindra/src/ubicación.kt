class ubicación {
    var id: Int=0
    var direccion: String?=""
    var enLinea: Boolean=false
    var link: String?=""

    constructor(id: Int, direccion: String?,enLinea: Boolean,link: String?){
        this.id=id
        this.direccion=direccion
        this.enLinea=enLinea
        this.link=link

    }















    fun obtenerUbicacion(): String {
        return if (enLinea) "Evento en línea: $link" else "Ubicación física: $direccion"
    }
}