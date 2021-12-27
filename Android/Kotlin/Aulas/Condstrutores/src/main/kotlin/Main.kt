class Casa(cor: String, vagasGaragem: Int) {
    var cor: String = ""
    var vagasGaragem: Int = 0

    init {
        this.cor = cor
        this.vagasGaragem = vagasGaragem
    }

    //constructor{
    //}


    fun detailsHouse(){
        println("${cor} ${vagasGaragem}")
    }
    fun abrirJanela(qtdJanelas: Int){
        println("Abrir jnaela total: ${qtdJanelas}");
    }

    fun abrirPorta(){
        println("Abrir porta");
    }

    fun abrirCasa(){
        this.abrirPorta()
    }
}

fun main(){
    val casa =  Casa("azul", 2)
    //casa.cor = "Amarela"
    //casa.vagasGaragem = 4
    //casa.detailsHouse()

    println(casa.detailsHouse())
}