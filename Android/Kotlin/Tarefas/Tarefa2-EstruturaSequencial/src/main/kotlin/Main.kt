fun main(args: Array<String>) {
    calcExcesso(70.4)
    calcExcesso(40.2)
    calcExcesso(-20.1)

}

fun calcExcesso(pesoPeixe: Double){
    var excesso: Double = 0.0
    var multa: Double = 0.0

    if(pesoPeixe < 0){
        println("Peso invalido!")
    }
    else if(pesoPeixe > 50){
        excesso = (pesoPeixe - 50)
        multa = (excesso * 4);
        println("Excesso de ${excesso}")
        println("Multa de ${multa}")
    }
    else{
        println("O peso do peixe está no permitido (menos que 50KG)")
    }
}