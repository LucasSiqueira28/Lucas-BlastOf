fun main(){
    val cao = Cao()
    println(cao.dormir())

    val bird = Passaro()
    println(bird.dormir())
}

open class Animal {
    open fun dormir(){
        println("A mimir")
    }
}


class Cao: Animal() {
    override fun dormir(){
        super.dormir()
        println("Como um cão")
    }

    fun latir(){
        println("Latir")
    }
}

class Passaro: Animal() {

}