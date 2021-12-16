/*
Faça um programa para imprimir:
1
1   2
1   2   3
.....
1   2   3   ...  n
Para um n informado pelo usuário. Use uma função que receba um valor n inteiro imprima até a n-ésima linha.
*/

import java.util.Scanner;

public class Tarefa2Funcao {
    public static void escada(int numero) {
        for (int i = 1; i <= numero; i++) {
            // i += 1;
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Digite um numero: ");
        numero = entrada.nextInt();

        for (int i = 1; i <= numero; i++) {
            escada(i);
        }
    }
}