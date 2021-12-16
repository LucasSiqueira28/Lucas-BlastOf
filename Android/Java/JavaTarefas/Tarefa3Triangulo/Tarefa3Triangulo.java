package Tarefa3Triangulo;

import java.util.Scanner;

public class Tarefa3Triangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Triangulo tri = new Triangulo(); // instanciando a classe
        System.out.println("Digite o valor da base: ");
        tri.setBase(entrada.nextDouble());
        System.out.println("Digite o valor da altura: ");
        tri.setAltura(entrada.nextDouble());

        tri.exibirDados();
        tri.exibirArea();
    }
}
