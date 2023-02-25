import java.awt.desktop.PrintFilesEvent

class Cat: Animals(), Pet {

    override fun comer() {
        println("O gato esta comendo peixe")

    }

    override fun som() {
        println("Miaaau")
    }

    override fun darCarinho() {
        println("dando carinho para o gato")
    }

    override fun brincar() {
        println(" ligando laiser")
    }

    override fun darComida() {
        println("Dando ração de gato")
    }
}