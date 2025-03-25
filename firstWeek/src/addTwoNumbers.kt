/*
You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
 */

// Definición de la clase ListNode para una lista enlazada simple.
class ListNode(var `val`: Int) {
    var next: ListNode? = null

    override fun toString(): String {
        return if (next != null) "$`val` -> ${next.toString()}" else "$`val`"
    }
}

// Función auxiliar para construir una lista enlazada a partir de un arreglo de enteros.
fun buildList(arr: IntArray): ListNode? {
    if (arr.isEmpty()) return null
    val head = ListNode(arr[0])
    var current = head
    for (i in 1 until arr.size) {
        current.next = ListNode(arr[i])
        current = current.next!!
    }
    return head
}

// Función auxiliar para imprimir una lista enlazada.
fun printList(node: ListNode?) {
    println(node?.toString() ?: "null")
}

// Clase Solution donde debes implementar el metodo addTwoNumbers
class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var currentl1 = l1
        var currentl2 = l2
        var carry = 0

        var resultlist = ListNode(0)
        var current = resultlist

        while (currentl1 != null || currentl2 != null || carry != 0) {
            val valuel1 = if(currentl1 != null) currentl1.`val` else 0
            val valuel2 = if(currentl2 != null) currentl2.`val` else 0

            val sum = valuel1 + valuel2 + carry
            carry = sum / 10
            val number = sum % 10

            current.next = ListNode(number)
            current = current.next!!

            if (currentl1 != null) currentl1 = currentl1.next
            if (currentl2 != null) currentl2 = currentl2.next
        }

        return resultlist.next

    }
}

// Función main para probar tu solución.
fun main() {
    val solution = Solution()

    // Ejemplo 1:
    // l1 = [2, 4, 3] representa el número 342 (en orden inverso)
    // l2 = [5, 6, 4] representa el número 465 (en orden inverso)
    // La suma debe ser 807, es decir, la lista resultante [7, 0, 8].
    val l1 = buildList(intArrayOf(2, 4, 3))
    val l2 = buildList(intArrayOf(5, 6, 4))
    println("Ejemplo 1:")
    printList(l1)
    printList(l2)
    val result1 = solution.addTwoNumbers(l1, l2)
    printList(result1)
    println()

    // Ejemplo 2:
    // l1 = [0], l2 = [0]
    // Salida: [0]
    val l3 = buildList(intArrayOf(0))
    val l4 = buildList(intArrayOf(0))
    println("Ejemplo 2:")
    printList(l3)
    printList(l4)
    val result2 = solution.addTwoNumbers(l3, l4)
    printList(result2)
    println()

    // Ejemplo 3:
    // l1 = [9,9,9,9,9,9,9] representa el número 9,999,999 (en orden inverso)
    // l2 = [9,9,9,9] representa el número 9,999 (en orden inverso)
    // Salida esperada: [8,9,9,9,0,0,0,1]
    val l5 = buildList(intArrayOf(9, 9, 9, 9, 9, 9, 9))
    val l6 = buildList(intArrayOf(9, 9, 9, 9))
    println("Ejemplo 3:")
    printList(l5)
    printList(l6)
    val result3 = solution.addTwoNumbers(l5, l6)
    printList(result3)
}
