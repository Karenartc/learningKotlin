fun main() {
//    lists()
//    arrays()
/*    println(nullables())
    println(nullables(null))
    println(nullables("Percy Jackson"))*/

    val bookWithoutAuthor: Book = Book(
        "Harry Potter",
        870
    )

    println("""
        El libro ${bookWithoutAuthor.title} tiene ${bookWithoutAuthor.numberOfPages} páginas
        Fue escrito por ${bookWithoutAuthor.author?.name ?: "NN"}
        """.trimIndent()
    )

    //Forzando null pointer exception
    /*println("""
        El libro ${bookWithoutAuthor.title} tiene ${bookWithoutAuthor.numberOfPages} páginas
        Fue escrito por ${bookWithoutAuthor.author!!.name ?: "NN"}
        """.trimIndent()
    )*/

}

fun lists() {
    val immutableList = listOf("Pets", 5, true)
    val mutableList = mutableListOf("Pets", 5, true)

    mutableList.addLast("Mascota")

    println("Mutable List $mutableList")
    println("Immutable List $immutableList")
}

fun arrays() {
    val arrayOfPets = arrayOf("Perro", "Gato", "Loro")
    val arrayOfNumbers = intArrayOf(1, 2, 3, 4)

    println(arrayOfPets)
    //println(java.util.Arrays.toString(arrayOfPets))
    println(arrayOfPets.contentToString())
}

fun nullables(bookName: String? = null): String {
    val bookTitle: String = bookName ?: "Sin título"

    return bookTitle
}

class Book (
    val title: String,
    val numberOfPages: Int,
    val publicationYear: Int? = null,
    val author: Author? = null
)

class Author (
    val name: String? = null,
    val lastName: String? = null
)

