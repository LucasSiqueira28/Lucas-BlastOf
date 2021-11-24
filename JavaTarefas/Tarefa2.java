package JavaTarefas;
/*
João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. 
Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos),
deve pagar uma multa de R$ 4,00 por quilo excedente. 
João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso. 
Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar. 
Imprima os dados do programa com as mensagens adequadas.
*/

import java.util.Scanner;

public class Tarefa2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double pesoPeixe = 0, excesso = 0, multa = 0;

        System.out.println("Digite o peso do peixe: ");
        pesoPeixe = entrada.nextDouble();

        if (pesoPeixe > 50) {
            excesso = pesoPeixe - 50;
            multa = excesso * 4;
            System.out.printf("Excesso de: %1.2f KG\n", excesso);
            System.out.printf("Multa de: R$%1.2f\n", multa);
        } else {
            System.out.println("O peso do peixe está no permitido (menos que 50KG)");
        }
    }
}
