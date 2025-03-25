fun main() {
    val result = operacionGenerica(3, 2, { x, y -> x+y }) //lo que esta entre corchetes representa una operacion donde se suma x+y
    println(result)

    val resultadoMult = operacionGenerica(3, 2) { x, y ->
        x*y
    } //Funcion como argumento mas idiomatico en kotlin
    println(resultadoMult)

    val funcionSuma= operationBasedOnString("plus")
    val suma = funcionSuma(3,8)
    println(suma)

    val gatos = listOf("Benito", "Don Gato", "Garfield")

    val gatosUppercase = gatos.map { it.uppercase() }
    println(gatosUppercase)

    val result5 = withFunction(
        4,
        even = { println("Es par"); "es par"},
        odd = { println("Es impar"); "es impar"}
    )

    println("Resultado5: $result5")
}

fun operacionGenerica(
    a: Int,
    b: Int,
    operacion: (Int, Int) -> Int //(Lambda)Parametro como funcion, se le debe pasar dos enteros y trae un entero
): Int {
    return operacion (a, b)
}

fun operationBasedOnString(operation: String): (Int, Int) -> Int {
    return when(operation) {
        "plus" -> { x: Int, y: Int ->
            x + y } //la ultima linea se estima que es el return
        "minus" -> { x: Int, y: Int ->
            x - y }
        else -> { _: Int, _: Int -> 0 } //cuando las variables no se ocupan van con "_"
    }
}

fun <F> withFunction(num: Int, even: () -> F, odd: () -> F): F {
    return when(num % 2) {
        0 -> even()
        else -> odd()
    }
}