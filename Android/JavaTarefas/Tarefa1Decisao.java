/*
Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre, 
e calcule a sua média. A atribuição de conceitos obedece à tabela abaixo:
Média de Aproveitamento  Conceito
Entre 9.0 e 10.0        A
Entre 7.5 e 9.0         B
Entre 6.0 e 7.5         C
Entre 4.0 e 6.0         D
Entre 4.0 e zero        E
O algoritmo deve mostrar na tela as notas, a média, 
o conceito correspondente e a mensagem “APROVADO” se o conceito for A, B ou C ou “REPROVADO” se o conceito for D ou E.
*/

import java.util.Scanner;

public class Tarefa1Decisao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1 = 0, nota2 = 0, media = 0;
        char conceito = ' ';

        System.out.println("Digite a 1º nota do aluno: ");
        nota1 = entrada.nextDouble();

        System.out.println("Digite a 2º nota do aluno: ");
        nota2 = entrada.nextDouble();

        media = (nota1 + nota2) / 2;

        System.out.printf("\nNota 1: %1.2f | Nota 2: %1.2f\n", nota1, nota2);
        System.out.printf("Sua média foi de: %1.2f\n", media);

        if (media >= 9 && media <= 10) {
            conceito = 'A';
        } else if (media >= 7.5 && media < 9) {
            conceito = 'B';
        } else if (media >= 6.0 && media < 7.5) {
            conceito = 'C';
        } else if (media >= 4.0 && media < 6.0) {
            conceito = 'D';
        } else if (media >= 0 && media < 4.0) {
            conceito = 'E';
        }

        if (conceito == 'A' || conceito == 'B' || conceito == 'C') {
            System.out.printf("%c - Aprovado\n\n", conceito);
        } else if (conceito == 'D' || conceito == 'E') {
            System.out.printf("%c - Reprovado\n\n", conceito);
        }
    }
}
