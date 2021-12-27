fun main (){
    var tempMeses = arrayListOf<Double?>()
    var total = 0.0

    for (mes in Meses.values()) {
        print("Digite a temperatura de ${mes}: ")
        var temp = readLine()?.toDouble()

        if(temp!! > 40 || temp!! < -10){
            println("Temperatura inválida! Digite novamente a temperatura de ${mes}: ")
            var temp = readLine()?.toDouble()
        } else {
            tempMeses.add(temp)
            total += temp
        }
    }

    var varicaoTemp: Double = 0.0
    varicaoTemp = total / tempMeses.size

    println("\nMédia de temperatura anual: ${varicaoTemp}°C")
    println("\nMeses acima da média da temperatura anual: ")

    for ((index, temp) in tempMeses.withIndex()) {
        if (temp != null && temp > varicaoTemp) {
            println("${index + 1} - ${Meses.values()[index]} - ${temp}°C")
        }
    }
}

enum class Meses {
    JANEIRO, FEVEREIRO, MARCO, ABRIL, MAIO, JUNHO, JULHO, AGOSTO, SETEMBRO, OUTUBRO, NOVEMBRO, DEZEMBRO;
}