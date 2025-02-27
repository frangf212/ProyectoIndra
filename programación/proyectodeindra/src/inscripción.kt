class inscripción {
    var id: Int=0
    var fecha: Int=0
    var user: usuario
    var event: evento

    constructor(id: Int, fecha: Int, user: usuario, event: evento) {
        this.id = id
        this.fecha = fecha
        this.user = user
        this.event = event
    }


    fun confirmarInscripcion(): Boolean {
        return user.inscribirse(event)
    }

    fun cancelarInscripcion(): Boolean {
        return user.cancelarInscripcion(event)
    }

    fun obtenerDetalles(): String {
        return "Inscripción ID: $id\nUsuario: ${user.nombre}\nEvento: ${event.nombre}\nFecha: $fecha"
    }

}