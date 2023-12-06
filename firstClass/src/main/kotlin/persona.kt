
class Persona(private val nombre: String, private val edad: Int, private val ocupacion: String) {

    fun obtenerDescripcion(): String {
        return "$nombre, $edad años, $ocupacion"
    }
}

