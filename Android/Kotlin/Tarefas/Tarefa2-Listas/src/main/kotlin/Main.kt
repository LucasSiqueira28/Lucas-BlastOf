import kotlin.random.Random

fun main(){
    val randNumeros = List(100){
        Random.nextInt(0,6) + 1
    }

    val vezesRepetidas = List(6) {
        0
    }.toMutableList()

    for (numero in randNumeros){ vezesRepetidas[numero-1]++}
    for((index, repeticao) in vezesRepetidas.withIndex()){println("Número: ${index+1} Vezes repetidas: ${repeticao}")}
}