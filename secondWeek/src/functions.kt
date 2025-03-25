fun printEspecial() : Unit {
    println("No se le asigna que retorna")
}

fun printEspecial2() {
    println("No se le asigna que retorna pt.2")
}

fun printNombre(name: String) {
    println("Hola $name")
}

fun askName(): String {
    println("Nombre: ")
    val askedName = readln()

    return askedName ?: ""
}

/*fun main() {

    val nombre = askName()
    printNombre(name = nombre)
}*/

val gato1 = "Garfield"

/*fun main() {

    val gato2 = "Sombra"

    fun printGatos () {
        val gato3 = "Don Gato"

        println("Print printGatos: $gato1, $gato2, $gato3")
    }

    println("Print Main: $gato1, $gato2")
    printGatos()
    printAll(gato1, gato2, gato3)
}*/

fun formatName(
    firstName: String,
    middleName: String = "",
    firstSurname: String,
    secondSurname: String = ""
    ): String {
        return "$firstName $middleName, $firstSurname $secondSurname"
}

/*fun main() {
    val nombre = formatName(
        firstName = "Alejandro",
        firstSurname = "Soto"
        )
    println(nombre)
}*/

fun printAll(vararg names: String) {
    for (name in names) {
        println(name)
    }
}
fun main() {
    val names = arrayOf("Benito, DonGato, Garfield")

    printAll(*names)
}
