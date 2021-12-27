fun main(){
    val dog = Dog()
    println(dog.exibirNome())
}

open class Animal {
    protected var nome = "Zé"

    fun dormir(){
        println("A mimir")
    }

}

class Dog: Animal(){
    fun exibirNome(){
        println("Nome é: ${nome}")
    }
}