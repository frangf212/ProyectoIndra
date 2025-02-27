class evento {

    var id: Int=0
    var nombre: String=""
    var fecha: String=""
    var duracion: Int=0
    var ubi: ubicación
    var cate: categoría
    var organ: organizador





    var inscritos = mutableListOf<usuario>()

    constructor(
        id: Int,
        nombre: String,
        fecha: String,
        duracion: Int,
        ubi: ubicación,
        cate: categoría,
        organ: organizador
    ) {
        this.id = id
        this.nombre = nombre
        this.fecha = fecha
        this.duracion = duracion
        this.ubi = ubi
        this.cate = cate
        this.organ = organ
    }

    fun inscribirUsuario(usu: usuario): Boolean {
        if (!inscritos.contains(usu)) {
            inscritos.add(usu)
            return true
        }
        return false
    }

    fun eliminarInscripcion(user: usuario): Boolean {
        return inscritos.remove(user)
    }

    fun cancelarEvento(): Boolean {
        if (inscritos.isNotEmpty()) {
            inscritos.clear()
        }
        return true
    }

    fun listarInscritos(): List<usuario> {
        return inscritos}
}