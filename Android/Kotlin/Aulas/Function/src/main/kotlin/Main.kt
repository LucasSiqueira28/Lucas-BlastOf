fun main(){
    exibirMensagem("lucas")
    somar(2, 2)
}

fun exibirMensagem(nome: String){
     println("${nome} seu nome é esse")
}
fun somar(numero1: Int, numero2: Int) {
    var soma: Int
    soma = numero1 + numero2

    return println("Soma: ${soma}")
}
