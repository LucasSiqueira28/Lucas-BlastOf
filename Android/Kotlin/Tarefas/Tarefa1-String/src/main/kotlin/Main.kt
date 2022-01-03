fun main(){
    println("Digite uma frase: ")
    val frase1 = readLine()
    println("Digite outra frase: ")
    val frase2 = readLine()

    if(frase1!!.toLowerCase() != null && frase2!!.toLowerCase() != null){
        if(frase1.length == frase2.length){
            println("String de tamanhos iguais")
        }
        else {
            println("String de tamanhos diferentes")
        }
        if(frase1.equals(frase2)){
            println("As strings tem o mesmo conteudo")
        }
        else {
            println("As strings tem conteudo diferente")
        }
    }
}