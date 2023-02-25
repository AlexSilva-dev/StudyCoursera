import java.util.Scanner

fun main(args: Array<String>) {



    val read = Scanner(System.`in`)
    println("Type the weekday:")
    val weekday = read.nextLine()
    println("Type the hour:")
    val hour = read.nextInt()
    val open = when(weekday){
        "monday" -> hour>=8 && hour<=12
        "tuesday" -> hour>=8 && hour<=18
        "wednesday" -> hour>=8 && hour<=18
        "thursday" -> hour>=8 && hour<=18
        "friday" -> hour>=8 && hour<=21
        "saturday" -> hour>=9 && hour<=16
        "sunday" -> hour>=8 && hour<=16
        else-> {
            println("Algo de errado")
        }
    }
    println("Will coffee shop be open at that time? $open")
}