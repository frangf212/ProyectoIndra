//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var ubicacion1 = ubicación(1, "Avenida Reforma 123, CDMX", false, null)
    var ubicacion2 = ubicación(2, null, true, "https://zoom.us/evento123")

    // Crear categorías
    var categoriaTaller = categoría(1, "Taller")
    var categoriaConferencia = categoría(2, "Conferencia")

    // Crear organizador
    var organizador1 = organizador(1, "EcoEventos", "contacto@ecoeventos.com")

    // Crear eventos
    var evento1 = evento(1, "Reciclaje Inteligente", "2025-03-10", 2, ubicacion1, categoriaTaller, organizador1)
    var evento2 = evento(2, "Energías Renovables", "2025-04-05", 3, ubicacion2, categoriaConferencia, organizador1)

    // Registrar eventos creados
    organizador1.crearEvento(evento1)
    organizador1.crearEvento(evento2)

    // Crear usuarios
    var usuario1 = usuario(1, "Carlos Pérez", "carlos@email.com", "clave123")
    var usuario2 = usuario(2, "Ana López", "ana@email.com", "segura456")

    // Inscribir usuarios en eventos
    usuario1.inscribirse(evento1)
    usuario2.inscribirse(evento2)

    // Mostrar eventos a los que está inscrito Carlos
    println("Eventos de Carlos:")
    for (evento in usuario1.listarEventos() ) {
        println("- ${evento.nombre} en ${evento.ubi.obtenerUbicacion()}")
    }

    // Listar participantes de un evento
    println("Participantes en ${evento1.nombre}:")
    for (inscrito in evento1.listarInscritos()) {
        println("- ${inscrito.nombre}")
    }

    // Cancelar inscripción
    usuario1.cancelarInscripcion(evento1)

    // Verificar que se ha eliminado la inscripción
    println("Después de cancelar la inscripción, los eventos de Carlos:")
    for (evento in usuario1.listarEventos()) {
        println("- ${evento.nombre}")
    }
}