class Student(val name: String, var age: String, var grade: String, val lastName: String) {
    val isAdult : Boolean
        get() = age.toInt() >= 18 //regla de acceso
        //set(value) = regla de escritura


    // update grade
    fun updateGrade(newGrade: String) {
        grade= newGrade
        println("$name's grade is $grade")
    }

    /*fun incrementAge() {
        age++
    }*/
}

// funcion mas limpia para validar y guardar datos del estudiante
// esto esta sinedo extendido en otra parte (en teoria) en el package testing
fun Student.validateStudent() {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save student: empty field $fieldName")
        }
    }
    validate(name, "name")
    validate(lastName, "lastName")
}

fun saveStudent(student: Student) {
    student.validateStudent()

    // logica para guardar en bd
}

fun main() {
    val student = Student(name = "Maria", age = "17", grade = "3ro B", lastName = "Perez")
    println("is ${student.name} adult: ${student.isAdult}")
    /*student.incrementAge()
    println("is ${student.name} adult: ${student.isAdult}")*/
}

//funcion prueba para guardadr y validar datos del estudiante
/*fun saveStudent(student: Student) {
*//*    if(student.name != "" && student.age >= 0 && student.grade != "" && student.lastName != ""){
        println("Guardando estudiante")
    } else {
        throw Exception("Estudiante inválido")
    }*//*

    fun validateStudent(
        value: String, fieldName: String
        ) {
            if(value.isEmpty()) {
                throw IllegalArgumentException("Can't save student: empty field $fieldName")
            }
    }
    validateStudent(student.grade, fieldName = "grade")
    validateStudent(student.name, fieldName = "name")
}*/