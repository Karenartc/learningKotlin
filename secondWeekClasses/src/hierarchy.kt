// se le agrega el open para definir explicitamente que la clase es abierta para poder heredar
// kotlin dice que todas las funciones son cerradas, no se pueden heredar
/*open class Figure(val name: String){

}

class Rectangle(name: String) : Figure(name) {

}*/

// INTERFACES
// Interface clikeable
interface Clickable { //las interfaces se pueden sobreescribir
    fun click()
    fun show() = println("I'm clickable")
}

//interface focusable
interface Focusable {
    fun setFocus(b: Boolean) = println("Yo ${if (b) "tengo" else "perdi el"} foco")
    fun show() = println("Soy enfocable")
}

//CLASES
class Button: Clickable {
    override fun click() {
        println("Button: CLick en boton")
    }
}

open class RichButton : Clickable, Focusable {

    // override click interface
    override fun click() {
        println("Rich button: I'm a ${this.javaClass.simpleName} button")
    }

    override fun show() {
        super<Clickable>.show()
        super<Focusable>.show()
        println("I'm a rich button")
    }

    // Disable button
    fun disable() {
        println("Rich button: Button disabled")
    }

    // Animate button
    // overridable
    open fun animate() {
        println("Rcih Button: Animado el boton eriquecido")
    }
}

class ThemedButton : RichButton() {
    override fun animate() {
        //super.animate() //invoca el metodo del padre
        println("Themed button: My custom animation after parent animation")
    }
}

fun main() {
    //Botones
    Button().click()
    Button().show()

    RichButton().animate()
    RichButton().show()
    RichButton().disable()

    ThemedButton().animate()

}
