fun main(){
    var numero = 10

    while(numero != -1){
        println(numero)
        numero--
    }

    for(numero in 1..10){
        println(numero)

    }

    var postagens = arrayOf("Descoberto novo método...", "Novo curso de Android....", "Bolsa de valores opera.....")

    for(postagem in postagens){
        println(postagem)
    }
    for((indice, postagem) in postagens.withIndex()){
        println("${indice} ${postagem}")
    }

}