fun main(args: Array<String>) {
    soma(1.90F, 'F');
    soma(1.60F, 'M');
    soma(2000.0F, 'P');
}

fun soma(h: Float, sexo: Char){
    var pesoIdeal:Float = 0.0F;

    if(sexo == 'M'){
        pesoIdeal = (((72.7 * h) - 58).toFloat())
        println("Sexo: ${sexo} - Altura ${h} - Peso ideal de ${pesoIdeal}")
    }
    else if (sexo == 'F'){
        pesoIdeal = ((62.1 * h) - 55.7).toFloat();
        println("Sexo: ${sexo} - Altura ${h} - Peso ideal de ${pesoIdeal}")
    }
    else println("Sexo ou peso invalido");

}