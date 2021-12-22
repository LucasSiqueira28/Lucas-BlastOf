fun main(){
    val jamilton = Jamilton()
    jamilton.direitosDeveres()
    jamilton.ganharEleicao()

    val obama = Obama()
    obama.direitosDeveres()
    obama.ganharEleicao()
    obama.temFilho()
}

interface Presidente{
    fun ganharEleicao()
}

interface Pai{
    fun temFilho()
}

open class Cidadao{
    fun direitosDeveres(){
        println("Todo cidadão tem direitos e deveres")
    }
}

class Obama: Cidadao(), Presidente, Pai {
    override fun ganharEleicao() {
        println("Ganhar eleição nos EUA")
    }

    override fun temFilho() {
        println("Obama tem 4 filhos")
    }
}

class Jamilton: Cidadao(), Presidente{
    override fun ganharEleicao() {
        println("Ganhar eleição em SP")
    }
}