abstract class Forma {
    abstract val area: Double
    abstract fun dibujar()
}

class Circulo(override val area: Double) : Forma() {
    override fun dibujar() {
        println("Se dibuja un círculo con área $area")
    }
}

class Cuadrado(override val area: Double) : Forma() {
    override fun dibujar() {
        println("Se dibuja un cuadrado con área $area")
    }
}
