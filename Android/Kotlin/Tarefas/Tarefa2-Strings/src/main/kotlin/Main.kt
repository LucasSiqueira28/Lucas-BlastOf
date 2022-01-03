fun validaCpf(document: String): Boolean {

    val numbers = document.filter { it.isDigit() }.map { it.toString().toInt() }

    if (numbers.size != 11) return false

    if (numbers.all { it == numbers[0] }) return false

    //verify digit 1
    val dv1 = ((0..8).sumOf { (it + 1) * numbers[it] }).rem(11).let {
        if (it >= 10) 0 else it
    }

    //verify digit 2
    val dv2 = ((0..8).sumOf { it * numbers[it] }.let { (it + (dv1 * 9)).rem(11) }).let {
        if (it >= 10) 0 else it
    }

    return numbers[9] == dv1 && numbers[10] == dv2
}

fun main(){
    val cpf = validaCpf("71718745087")
    if(cpf == true){
        println("CPF válido")
    }
    else {
        println("CPF inválido")
    }
}