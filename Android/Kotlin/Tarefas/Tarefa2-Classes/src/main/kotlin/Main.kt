class Fuel(var typeFuel: String, var valueLiter: Double, var qtdFuel: Double){
    fun supplyByValue(valor: Double){
        val liters = valor / valueLiter
        qtdFuel -= liters
        println("Litros abastecidos: ${liters}")
    }
    fun supplyByLiter(liter: Double){
        val valuepay = liter * valueLiter
        qtdFuel -= liter
        println("Litros abastecidos: ${valuepay}")
    }

    fun displayInformation(){
        println("\nTipo de combustivel: ${typeFuel}");
        println("Preço do combustível: R$${valueLiter}");
        println("Total de combustivel: ${qtdFuel}");
        println("\n");
    }
}

fun main(){
    val bombOne = Fuel("Alcool", 4.00, 40.00)
    bombOne.displayInformation()
    bombOne.supplyByLiter(12.0)
    bombOne.supplyByValue(70.00)

}