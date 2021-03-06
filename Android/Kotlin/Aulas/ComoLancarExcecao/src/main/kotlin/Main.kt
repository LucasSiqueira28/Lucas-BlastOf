import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.lang.Error
import java.lang.NumberFormatException

fun main(){
    val porcentagem = porcentagem(50)
    println(porcentagem)
}

fun porcentagem(numero: Int): String {
    return if(numero in 1..100){
        "$numero%"
    }
    else {
        throw IllegalArgumentException(Error())
    }
}

fun lerIdade(): Int? {
    val reader = FileReader(File("src/idades.txt"))
    val buffer = BufferedReader(reader)

    try{
        val numero = buffer.readLine()
        return Integer.parseInt(numero)
    } catch (e: NumberFormatException){
        return null
    }
}