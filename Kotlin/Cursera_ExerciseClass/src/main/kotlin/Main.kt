import java.time.Period
protected val a =10
fun main(args: Array<String>) {

    val cat1 =  Cat()
    val dog1 = Dog()
    val leao1 = Leao()

    emitirSom(cat1)
    emitirSom(dog1)
    emitirSom(leao1)

    println("")
    darCarinho(cat1)
    darCarinho(dog1)
    //darCarinho(leao1)

    var tst: Pet = Dog()


}

fun emitirSom(animal: Animals){
    animal.som()
}

fun darCarinho(pet: Pet){
    pet.darComida()
}