class organizador {
    var id: Int=0
    var  nombre: String=""
    var contacto: String=""




    var eventosCreados = mutableListOf<evento>()

    constructor(id: Int, nombre: String, contacto: String) {
        this.id = id
        this.nombre = nombre
        this.contacto = contacto
    }

    fun crearEvento(evt: evento): Boolean {
        if (!eventosCreados.contains(evt)) {
            eventosCreados.add(evt)
            return true
        }
        return false
    }

    fun modificarEvento(ev: evento, nuevosDatos: evento): Boolean {
        for (i in eventosCreados.indices) {
            if (eventosCreados[i].id == ev.id) {
                eventosCreados[i] = nuevosDatos
                return true
            }
        }
        return false
    }

    fun eliminarEvento(e: evento): Boolean {
        return eventosCreados.remove(e)
    }
}