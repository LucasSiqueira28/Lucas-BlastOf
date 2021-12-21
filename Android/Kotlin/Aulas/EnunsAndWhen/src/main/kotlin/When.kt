fun obterMnemonica(cor: Cor) = when(cor) {
    Cor.VERMELHO -> "Azul"
    Cor.AMARELO -> "askdioadjkas"
    Cor.AZUL -> "aisdojad"
    Cor.LARANJA -> "adjsnaiodjnaodim"
    Cor.VERDE -> "haaha"
}

fun main(){
    val mnemonica = obterMnemonica(Cor.VERMELHO)
    println(mnemonica)
}