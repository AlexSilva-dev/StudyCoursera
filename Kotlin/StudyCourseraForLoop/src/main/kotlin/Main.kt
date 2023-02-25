fun main(args: Array<String>) {

    printStar(40)

    println(factorial(5))
    var alex = Employee("alex", 20, "desenvolverdor")
    println(alex.name+ alex.age+  alex.job)

}


fun factorial(num:Int): Int{
    if(num==1) {
        return 1
    }
    return (factorial(num-1)* num)
}

fun printStar(qtd: Int){

    println()
    var h = 1;
    for (i in 1..qtd) {
        for (j in i..qtd) {
            print(" ")
        }

        for (k in 1..h) {
            print("*")
        }
        h += 2
        println()
    }

    for (i in -1..30 step 2) {
        for (c in 1..i) {
            print("*")
        }
        println()
    }
    for (x in 31 downTo 0 step 2) {
        for (y in 1..x)
            print("*")
        println()
    }


    for (i in 1..10) {
        for (j in 10 downTo i) {
            print(" ")
        }
        for (k in 1..i) {
            print("*")
        }
        println()
    }


    for(i in 1..10){
        for(j in 10 downTo i){
            print(" ")
        }
        for(k in 1..i){
            print("*")
        }
        println()
    }

    for (i in 1..10){
        for (j in 1..i){
            print(" ")
        }
        for (k in i..10){
            print("*")
        }
        println()
    }

}