fun main() {
    println("Ingrese el nombre:")
    val nombre = readLine() ?: ""

    println("Ingrese la edad:")
    val edad = readLine()?.toIntOrNull() ?: 0

    println("Ingrese la ocupación:")
    val ocupacion = readLine() ?: ""

    val persona = Persona(nombre, edad, ocupacion)

    println("Descripción de la persona:")
    println(persona.obtenerDescripcion())


    println("////////////////////////////////////////////")

    val listaAnimales = listOf(
        Animal("Animal", 5),
        Perro("layla", 3),
        Gato("compadre", 2)
    )

    for (animal in listaAnimales) {
        println("${animal.nombre} (${animal.edad} años):")
        animal.hacerSonido()
        println() // Salto de línea para mejor legibilidad
    }
        val coche = Coche()
        val bicicleta = Bicicleta()
        val circulo = Circulo(25.0)
        val cuadrado = Cuadrado(16.0)
        coche.acelerar()
        bicicleta.acelerar()
        circulo.dibujar()
        cuadrado.dibujar()
}


