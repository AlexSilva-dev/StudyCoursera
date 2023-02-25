import java.util.Scanner

var students:List<Student> = listOf(Student(223, "John", 140.0),
    Student(548, "Mark", 120.0),
    Student(342, "Natali", 150.0),
    Student(781, "Sara", 130.0)
    )
fun main(args: Array<String>) {
    val keyboardInp = Scanner(System.`in`)
    println("Please, Enter the student's ID")
    val id = keyboardInp.nextInt()
    println(getStudentById(id).toString())
    keyboardInp.nextLine()
    println("Please, Enter the student's name")
    val name:String = readLine().toString()
    val result:Student? = seachInStudents(name)
    println(result.toString())

}

fun getStudentById(id:Int):Student{
    val theStudent:Student? = students.find { it.id==id }

    return theStudent!!;
}

fun seachInStudents(name:String):Student?{
    val theStudent:Student? = students.find { it.name.lowercase()==name.lowercase() }
    if (theStudent==null) {
        println("The student is not found")
    }
    return theStudent
}