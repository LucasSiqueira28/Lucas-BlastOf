import java.util.*

fun main(){
    val representacaoBinaria = TreeMap<Char, String>()

    for(i in 'A'..'F'){
        val binary = Integer.toBinaryString(i.toInt())
        representacaoBinaria[i] = binary
    }

    for((letter, binary) in representacaoBinaria){
        println("${letter} - ${binary}")
    }
}