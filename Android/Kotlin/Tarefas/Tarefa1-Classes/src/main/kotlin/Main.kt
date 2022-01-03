class Rectangle(var sideA: Double, var sideB: Double){
    fun calculateArea(): Double{
        return sideA * sideB
    }
    fun calculatePerimeter(): Double{
        return 2 *(sideA + sideB)
    }
}

fun main(){
    println("Digite a altura: ");
    val height = readLine()
    if(height == null || height!!.toDouble() < 0){
        println("Valor invalido")
    }
    println("Digite a base: ")
    val base = readLine()
    if(height == null || height!!.toDouble() < 0){
        println("Valor invalido")
    }



    val rectangle = Rectangle(base!!.toDouble(), height!!.toDouble())
    println("Quantidade de pisos: ${rectangle.calculateArea()}")
    println("Quantidade de rodapé: ${rectangle.calculatePerimeter()}")
}
