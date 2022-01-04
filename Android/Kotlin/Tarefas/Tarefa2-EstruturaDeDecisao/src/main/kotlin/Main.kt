fun main() {
    val operations = listOf('+', '-', '*', '/')
    print("Digite o primeiro numero: ")
    val number1 = readLine()!!.toDouble()

    print("Digite o segundo número: ")
    val number2 = readLine()!!.toDouble()

    print("'+' '-' '*' '/': ")
    val operation = readLine()

    if (operations.contains(operation!!.toCharArray()[0])) {
        val result = when (operation) {
            "+" -> number1 + number2
            "-" -> number1 - number2
            "*" -> number1 * number2
            "/" -> number1 / number2
            else -> 0.0
        }

        println("${number1} ${operation} ${number2} = ${result}")

        if (result % 2 == 0.0) {
            println("Par")
        } else {
            println("Ímpar")
        }

        if (result > 0) {
            println("Positivo")
        } else {
            println("Negativo")
        }

        if (result % 1 == 0.0) {
            println("Inteiro")
        } else {
            println("Decimal")
        }
    }
}