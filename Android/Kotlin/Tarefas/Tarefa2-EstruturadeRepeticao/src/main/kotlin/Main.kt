fun main(){
    var idade = 0
    var contador = 0;
    var media = 0
    var somaIdade = 0;

    println("Quantas idades você vai digitar? ")
    contador = readLine()!!.toInt()

    for(i in 1..contador){
        println("${i}º idade: ")
        idade = readLine()!!.toInt()
        if(idade <=  0){
            println("Idade invalida, digite novamente: ")
            idade = readLine()!!.toInt()
            if(idade > 100){
                println("Idade invalida, digite novamente: ")
                idade = readLine()!!.toInt()
            }
        }
        somaIdade +=idade;

    }
    media = somaIdade / contador

    if (media in 0..25) {
        println(" ${media} anos é Jovem");
    } else if (media in 26..60) {
        println(" ${media} anos é Adulto");
    } else if (media in 61..100) {
        println(" ${media} anos é Idoso");
    } else {
        System.out.println("Idade invalida!");
    }

}