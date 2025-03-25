/*
Given two integers a and b, return the sum of the two integers without using the operators + and -.

Example 1:
Input: a = 1, b = 2
Output: 3

Example 2:
Input: a = 2, b = 3
Output: 5
*/

class solution {
    fun getSum(a: Int, b: Int): Int {
        var a = a
        var b = b
        while (b != 0) {
            val carry = a and b
            a = a xor b
            b = carry shl 1
        }
        return a
    }
}

fun main() {

    val solutionInstance = solution()

    val a1 = 1
    val b1 = 2

    val result1 = solutionInstance.getSum(a1, b1)
    println(result1)

    val a2 = 2
    val b2 = 3

    val result2 = solutionInstance.getSum(a2, b2)
    println(result2)
}
