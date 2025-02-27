class categoría {
    var id: Int=0
    var nombre: String=""

    constructor(id: Int, nombre: String) {
        this.id = id
        this.nombre = nombre
    }


    fun listarEventosPorCategoria(eventos: List<evento>): List<evento> {
        val eventosFiltrados = mutableListOf<evento>()
        for (evento in eventos) {
            if (evento.cate.id == this.id) {
                eventosFiltrados.add(evento)
            }
        }
        return eventosFiltrados
    }
}