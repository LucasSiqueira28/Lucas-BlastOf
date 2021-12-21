//~não é valido para funções

interface Expressao
class Numero(val valor: Int) : Expressao
class Soma (val esquerdo: Expressao, val direito: Expressao): Expressao

fun avaliacao(expressao: Expressao): Int =
    when(expressao) {
        is Numero -> expressao.valor //sempre valida o ultimo do bloco
        is Soma -> avaliacao(expressao.esquerdo) + avaliacao(expressao.direito)
        else -> throw IllegalArgumentException("Expressão desconhecida")
}

fun main(){
    val resultado = avaliacao(Soma(Soma(Numero(1), Numero(2)), Numero(4)))
    println(resultado)
}
