class usuario {
    var id: Int=0
    var nombre: String=""
    var email: String=""
    var password: String=""




    var eventosInscritos = mutableListOf<evento>()

    constructor(id: Int, nombre: String, email: String, password: String) {
        this.id = id
        this.nombre = nombre
        this.email = email
        this.password = password

    }

    fun inscribirse(events: evento): Boolean {
        if (!eventosInscritos.contains(events)) {
            eventosInscritos.add(events)
            events.inscribirUsuario(this)
            return true
        }
        return false
    }

    fun cancelarInscripcion(even: evento): Boolean {
        if (eventosInscritos.contains(even)) {
            eventosInscritos.remove(even)
            even.eliminarInscripcion(this)
            return true
        }
        return false
    }

    fun listarEventos(): List<evento> {
        return eventosInscritos
    }
}