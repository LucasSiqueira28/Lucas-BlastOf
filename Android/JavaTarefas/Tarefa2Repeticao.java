/*
Faça um programa que peça para n pessoas a sua idade, 
ao final o programa deverá verificar se a média de idade da turma varia entre 0 e 25, 26, 60 e maior que 60, e então, 
dizer se a turma é jovem, adulta ou idosa, conforme a média calculada.
*/

import java.util.Scanner;

public class Tarefa2Repeticao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int i, quantidade, idade, idadeTotal = 0, mediaIdade;

        System.out.println("Quantas pessoas são: ");
        quantidade = entrada.nextInt();

        for (i = 1; i <= quantidade; i++) {
            System.out.println("Digite a idade: ");
            idade = entrada.nextInt();

            idadeTotal += idade;
        }
        mediaIdade = idadeTotal / quantidade;
        if (mediaIdade > 0 && mediaIdade < 25) {
            System.out.println(mediaIdade + " anos é Jovem");
        } else if (mediaIdade > 25 && mediaIdade < 60) {
            System.out.println(mediaIdade + " anos é Adulto");
        } else if (mediaIdade > 60 && mediaIdade < 100) {
            System.out.println(mediaIdade + " anos é Idoso");
        } else {
            System.out.println("Idade invalida!");
        }
    }
}
