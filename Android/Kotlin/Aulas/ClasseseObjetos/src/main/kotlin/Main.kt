class Casa(cor: String){
    var cor: String = ""

    init{
        this.cor = cor
    }

    fun abrirJanela(){
        println("Janela abriu")
    }

    fun abrirCasa(){
        println("Abrir casa")
    }

    fun abrir(){
        this.abrirCasa()
        this.abrirJanela()
    }

}


fun main(){
    val casa = Casa("amarelo")
    val casa2 = Casa("verde")
    println(casa.cor)
    println(casa2.cor)
    println(casa.abrirJanela())
    println(casa.abrir())
}