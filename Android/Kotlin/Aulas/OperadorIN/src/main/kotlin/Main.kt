fun main(){
    //iterar sobre intervalos

    println(isLetter('a'))
    println(isLetter('9'))

    println(isNotDigit('x'))
}

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

fun isNotDigit(c: Char) = c !in '0'..'9'