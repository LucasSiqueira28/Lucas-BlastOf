fun main(){
    println("Digite um numero: ")
    val numero = readLine()

    if(numero != null){
        escada(numero.toInt())
    }
}

fun escada(numero: Int){
    for(j in 1..numero){
        println("")
        for(i in 1..j){
            print("${i} ")
        }
    }
}