//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Hello World!")

/*    val doubleNumber: Double = 0.5
    val floatNumber: Float = 5f

    val unsignedInt: UInt = 500u*/

/*    val number1: Int  = 10
    val number2: Int  = 7

    val result1 = addTwoNumbers(number1, number2)
     result2 = addTwoNumbers2(number1, number2)

    println(result1)
    println(result2)

    val number1: Float  = 10F
    val number2: Float  = 7F

    println(number1/number2)

    val castedNumber1 = number1.toDouble()
    val castedNumber2 = number2.toDouble()

    println(castedNumber1 / castedNumber2)*/

    /*greeting("Maria")*/

//    val joseAge = 4
//    println(isAbleToBuy(joseAge))
    /*println(checkDrivingLicense(joseAge))

    printDataWhileSomething()*/

    //iterators()
}

/* Using binary + sign */

fun addTwoNumbers(number1: Int, number2: Int) : Int {
    return number1 + number2
}

/* Using .plus operator */
fun addTwoNumbers2(number1: Int, number2: Int) : Int {
    return number1.plus(number2)
}

// Greeting function

fun greeting(name:String) {
    println("Hola ${name.uppercase()}")
}

// Comprar alcohol. If/Else
fun isAbleToBuy(age: Int) : String {
    return if(age >= 18) "Puede comprar" else "No puede comprar"
}

//Licencia conducir. When
fun checkDrivingLicense(age: Int) : String {
    /*Pasando variable en when*/
    /*return when(age) {
        in 0..< 17 -> "No puede conducir"
        17 -> "Puede conducir acompañadp de un adulto"
        else -> "Puede conducir solo"
    }*/

    /*Pasando variable en cada condicion*/
    return when {
        age < 17 -> "No puede conducir"
        age == 17 -> "Puede conducir acompañadp de un adulto"
        else -> "Puede conducir solo"
    }
}

fun printDataWhileSomething() {
    var counter: Int = 0
    var condition: Boolean = true

    while (true) {
        println("Hola")

        counter++

        condition = counter != 100
    }
}

fun iterators() {
    val listOfPets: List<String> = listOf("Blue", "Lucky", "Poly")
    val listOfAny = listOf("Mike", 50f, 'C')

    for ((index, pet) in listOfPets.withIndex()) {
        println("Pet $pet is in position $index")
    }

    for (pet in listOfPets){
        println(pet)
    }

    for (elements in listOfAny){
        println(elements)
    }

    for (num in 10..50){
        println("for1: Current number $num")
    }

    for (num in 10..50 step 10){
        println("for2: Current number $num")
    }

    for (num in 50 downTo 25 step 5){
        println("Down to $num")
    }
}
