fun main(){
    /* ESTRUCTURAS DE CONTROL */
//    positiveNegativeOrCero()
//    dayOfWeek()

    /* BUCLES */
//    numbersOneToTen()
//    numbersFromOneToHundred()
//    password()

    /* ARRAYS */
//    printElementArray()
//    sumOfElementsInArray()
//    averageOfElementsInArray()

    /* LISTS */
//    val fruits = listOf("manzana", "pera", "mango", "fresa")
//    printList(fruits)
//    playingListOfNumbers()

    /* MAPS */
//    mapOfStudents()
}



/* ESTRUCTURAS DE CONTROL */

//Crea un programa que reciba un número y determine si es positivo, negativo o cero utilizando estructuras condicionales (if/else if/else).
fun positiveNegativeOrCero() {
    println("Introduzca un número")
    val number = readlnOrNull()?.toIntOrNull() // Convierte la entrada a Int de forma segura.

    if (number != null) {
        if(number > 0){
            println("$number es Positivo")
        } else if (number < 0) {
            println("$number es Negativo")
        } else {
            println("$number es Cero")
        }
    }

}

//Crea otro programa que, dado un número del 1 al 7, imprima el día de la semana correspondiente usando la estructura when.
fun dayOfWeek(){
    println("Introduzca un número")
    val number = readlnOrNull()?.toIntOrNull() // Convierte la entrada a Int de forma segura.

    when(number) {
        1 -> println("Lunes")
        2 -> println("Martes")
        3 -> println("Miércoles")
        4 -> println("Jueves")
        5 -> println("Viernes")
        6 -> println("Sábado")
        7 -> println("Domingo")
        else -> println("Número de día inválido")
    }
}



/* BUCLES */

//Imprime los números del 1 al 10 usando un bucle for.
fun numbersOneToTen(){
    for(i in 1..10){
        println(i)
    }
}

//Suma los números del 1 al 100 utilizando un bucle while.
fun numbersFromOneToHundred() {
    var number: Int = 1
    while (number <= 100){
        print("$number ")
        number++
    }
}

//Crea un programa que solicite una contraseña y repita la solicitud hasta que la contraseña ingresada sea la correcta usando un bucle do-while.
fun password() {
    val password: String = "Password123*"
    do {
        print("Introduzca la contraseña: ")
        var tryPassword: String = readln()
    }while(tryPassword != password)
    println("Contraseña correcta")
}


/* ARRAYS */

//Imprimir cada elemento del array.
fun printElementArray(){
    val arraysOfElements = arrayOf("Element 1", 2, true, 54f, "Elements")
    for ((index, element) in arraysOfElements.withIndex()){
        println("El elemento $element está en la posición $index")
    }
}

//Calcular la suma de sus elementos.
fun sumOfElementsInArray() {
    val arrayOfIntegers = intArrayOf(1, 4, 7, 9)
    var sum: Int = 0
    for (number in arrayOfIntegers){
        sum += number
//        Con una funcion es: number.sum()
    }
    println("La suma de los elementos ${arrayOfIntegers.joinToString(", ")} es: $sum")
}

//Calcular el promedio de los elementos.
fun averageOfElementsInArray() {
    val arrayOfIntegers = intArrayOf(1, 4, 7, 9)
    var sum: Int = 0
    var amount: Int = arrayOfIntegers.size
    var average: Int = 0

    for (number in arrayOfIntegers){
        sum += number
    }
    average = sum / amount
    println("El promedio de los elementos ${arrayOfIntegers.joinToString(", ")} es: $average")
}


/* LISTS */

//Crea una función que reciba una lista inmutable de cadenas (por ejemplo, nombres de frutas) y la imprima.
fun printList(list: List<String>) {
    for (element in list){
        println(element)
    }
}

//Crea otra función que con una lista mutable de números, permitiendo agregar y eliminar elementos, e imprima el estado de la lista tras cada operación
fun playingListOfNumbers(){
    val listOfNumbers = mutableListOf(1, 2, 3, 4, 5)
    println("Lista inicial: $listOfNumbers")

    // Agregar
    listOfNumbers.add(6)
    println("Lista luego de agregar: $listOfNumbers")

    //Eliminar
    listOfNumbers.remove(2)
    println("lista luego de eliminar: $listOfNumbers")
}


/* MAPS */

//Imprimir cada entrada del mapa.
fun printMap(map: Map<String, Int>): String {
    return map.entries.joinToString(", ") { (key, value) -> "$key tiene $value años" }
}

//Imprimir cada entrada del mapa. Agregar, Actualizar y Eliminar un estudiante del mapa
fun mapOfStudents(){
    val students = mutableMapOf("Jose" to 20, "Maria" to 19, "Miguel" to 21, "Lucia" to 22)
    println("Mapa Inicial: ${printMap(students)}")

    //Actualizar
    students["Miguel"] = 30
    println("Mapa Actualizado: ${printMap(students)}")

    //Agregar
    students["Kamila"] = 19
    println("Mapa Agregado: ${printMap(students)}")

    //Eliminar
    students.remove("Jose")
    println("Mapa Eliminado: ${printMap(students)}")
}


