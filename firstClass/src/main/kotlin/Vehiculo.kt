
interface Vehiculo {
    fun acelerar()
}

// Clase Coche que implementa la interfaz Vehiculo
class Coche : Vehiculo {
    override fun acelerar() {
        println("El coche está acelerando")
    }
}

// Clase Bicicleta que implementa la interfaz Vehiculo
class Bicicleta : Vehiculo {
    override fun acelerar() {
        println("La bicicleta está acelerando")
    }
}
