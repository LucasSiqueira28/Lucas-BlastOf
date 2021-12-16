package Tarefa2Classes;

//import java.util.Scanner;

public class Tarefa2Classes {
    public static void main(String[] args) {
        Combustivel cb1 = new Combustivel("gasolina", 7.20, 5); // instanciando a classe
        Combustivel cb2 = new Combustivel("alcool", 5.10, 20); // instanciando a classe

        // cb1.imprimeCombustivel();
        cb1.abastecerPorValor(12);
        cb1.imprimeCombustivel();

        cb2.abastecerPorValor(15);
        cb2.imprimeCombustivel();
    }

}
