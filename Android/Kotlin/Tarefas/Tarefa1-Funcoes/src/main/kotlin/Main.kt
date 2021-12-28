import kotlin.random.Random.Default.nextInt
fun converterData(dia: Int, mes: Int, ano: Int){
    if(dia > 31 || dia <= 0 || mes > 12 || mes <=0 || ano <= 0){
        println("Dados invalidos!")
    }
    else if (mes == 1) {
        println("${dia} de Janeiro de ${ano}");
    }
    else if (mes == 2) {
        println("${dia} de Fevereiro de ${ano}");
    }
    else if (mes == 3) {
        println("${dia} de Março de ${ano}");
    }
    else if (mes == 4) {
        println("${dia} de Abril de ${ano}");
    }
    else if (mes == 5) {
        println("${dia} de Maio de ${ano}");
    }
    else if (mes == 6) {
        println("${dia} de Junho de ${ano}");
    }
    else if (mes == 7) {
        println("${dia} de Julho de ${ano}");
    }
    else if (mes == 8) {
        println("${dia} de Agosto de ${ano}");
    }
    else if (mes == 9) {
        println("${dia} de Setembro de ${ano}");
    }
    else if (mes == 10) {
        println("${dia} de Outubro de ${ano}");
    }
    else if (mes == 11) {
        println("${dia} de Novembro de ${ano}");
    }
    else if (mes == 12) {
        println("${dia} de Dezembro de ${ano}");
    }

}
fun main(){
    converterData(27,9,1999)
    converterData(10,1,2005)
    converterData(-10,9,1999)
    converterData(30,15,1980)
    converterData(13,12,-1)
}



