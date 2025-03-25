fun main() {}

// Se usa T : Any para garantizar que el tipo siempre sea no nulo.

// Nodos: Representa un único nodo de la lista. Contiene un valo y una referencia al siguiente nodo (o null si es el último).
data class Node<T: Any>(var value: T, var next: Node<T>? = null) {
    override fun toString(): String { // Imprime el nodo, y de forma recursiva, toda la cadena de nodos que le siguen.
        return if (next != null) "$value -> ${next.toString()}" else "$value"
    }
}

// LinkedList: Administra la secuencia completa de nodos permitiendo distintos métodos en estos.
class LinkedList <T: Any> {
    private var head: Node<T>? = null //Primer nodo de la lista
    private var tail: Node<T>? = null //Último nodo de la lista
    var size = 0 //Cantidad de elemntos en la lista
        private set //Se puede acceder por fuera de la clase, pero solo se puede cambiar su valor por dentro de la clase.

    fun isEmpty(): Boolean = size == 0

    override fun toString(): String {
        return if (isEmpty()) "empty List" else head.toString()
    }

    // Push: Inserta un nuevo nodo al incio de la lista
    fun push(value: T): LinkedList<T> = apply { // apply (función de extension de kotlin) permite ejecutar un bloque de código en el contexto de un objeto, y al final, devuelve ese mismo objeto
        head = Node (value = value, next = head)
        if (tail == null) tail = head
        size++
    }

    // Append: Inserta un nuevo nodo al final de la lista
    fun append(value: T) {
        if (isEmpty()){
            push(value) //Si la lista está vacía, llama a push()
            return
        }
        val newNode = Node(value = value)
        tail!!.next = newNode
        tail = newNode
        size++
    }

    // Insert: inserta un nodo después de uno en específico
    fun insert(value: T, afterNode: Node <T>): Node<T> {
        if(tail == afterNode) {
            append(value)
            return tail!!
        }
        val newNode = Node(value = value, next = afterNode.next)
        afterNode.next = newNode
        size++
        return newNode
    }


}
