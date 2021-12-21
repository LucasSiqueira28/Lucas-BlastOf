fun main(){
    var codigo: Int = 0
    var pessoa: Int = 0
    var codigo_Alto: Int = 0
    var codigo_Baixo = 0
    var codigo_maisgordo = 0
    var codigo_maismagro = 0

    var peso = 0.0
    var altura = 0.0
    var mediaAltura = 0.0
    var mediaPeso = 0.0
    var somaAltura = 0.0
    var somaPeso = 0.0
    var pesoMaior = 0.0
    var pesoMenor = 1000.0
    var alturaMaior = 0.0
    var alturaMenor = 1000.0
    var alturagordo = 0.0
    var alturamagro = 0.0
    var pesoalto = 0.0
    var pesobaixo = 0.0

    do {
        println("Digite o codigo: ");
        codigo = readLine()!!.toInt()

        if (codigo != 0) {
            println("Digite a altura: ");
            altura = readLine()!!.toDouble()
            println("Digite o peso: ");
            peso = readLine()!!.toDouble()

            pessoa = pessoa + 1;
            somaAltura = somaAltura + altura;
            somaPeso = somaPeso + peso;
        }
        if (peso > pesoMaior) {
            alturagordo = altura;
            pesoMaior = peso;
            codigo_maisgordo = codigo;
        }
        if (peso < pesoMenor) {
            alturamagro = altura;
            pesoMenor = peso;
            codigo_maismagro = codigo;
        }
        if (altura > alturaMaior) {
            pesoalto = peso;
            alturaMaior = altura;
            codigo_Alto = codigo;
        }
        if (altura < alturaMenor) {
            pesobaixo = peso;
            alturaMenor = altura;
            codigo_Baixo = codigo;
        }
    } while (codigo != 0);

    mediaAltura = somaAltura / pessoa;
    mediaPeso = somaPeso / pessoa;


    println("\nCliente mais alto:");
    println("Codigo: ${codigo_Alto}");
    println("Peso: ${pesoalto}");
    println("Altura: ${alturaMaior}");

    println("\n\nCliente mais baixo:");
    println("Codigo: ${codigo_Baixo}");
    println("Peso: ${pesobaixo}");
    println("Altura: ${alturaMenor}");

    println("\n\nCliente com maior peso:");
    println("Codigo: ${codigo_maisgordo}");
    println("Peso: ${pesoMaior}");
    println("Altura: ${alturagordo}");

    println("\n\nCliente com menor peso:");
    println("Codigo: ${codigo_maismagro}");
    println("Peso: ${pesoMenor}");
    println("Altura: ${alturamagro}");

    println("\n\nMedia das alturas dos clientes: ${mediaAltura}");
    println("Media dos pesos dos clientes: ${mediaPeso}");
}