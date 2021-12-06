
/*
Classe Retangulo: Crie uma classe que modele um retangulo:
Atributos: LadoA, LadoB (ou Comprimento e Largura, ou Base e Altura, a escolher);
Métodos: Mudar valor dos lados, Retornar valor dos lados, calcular Área e calcular Perímetro;
Crie um programa que utilize esta classe. Ele deve pedir ao usuário que informe as medidas de um local. 
Depois, deve criar um objeto com as medidas e calcular a quantidade de pisos e de rodapés necessárias para o local.
*/
package Tarefa1Classes;

import java.util.Scanner;

public class Tarefa1Classes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Retangulo ret = new Retangulo(); // instanciando a classe

        System.out.print("Digite o comprimento: ");
        ret.setComprimento(entrada.nextInt());

        System.out.print("Digite a largura: ");
        ret.setLargura(entrada.nextInt());

        System.out.println("Voce precisa de " + ret.getPisos() + " metros de piso");
        System.out.println("Voce precisa de " + ret.getRodape() + " metros de rodape");
    }
}
