fun main(){
    println("Digite a primeira nota: ")
    val n1 = readLine()
    if(n1!!.toDouble() <= 0 ){
        println("Nota invalida")
    }

    println("Digite a segunda nota: ")
    val n2 = readLine()
    if(n2!!.toDouble() <= 0 ){
        println("Nota invalida")
    }

    val media = (n1!!.toDouble() + n2!!.toDouble()) / 2
    var conceito = " "

    when(media){
        in 9.0 .. 10.0 -> conceito = "A"
        in 7.5 .. 9.0 -> conceito = "B"
        in 6.0 .. 7.5 -> conceito = "C"
        in 4.0 .. 6.0 -> conceito = "D"
        in 0.0 .. 4.0 -> conceito = "F"
    }

    if(conceito =="A" || conceito=="B" ||conceito=="C"){
        println("Conceito: ${conceito} - aprovado")
    }
    else{
        println("Conceito: ${conceito} - reprovado")
    }

}