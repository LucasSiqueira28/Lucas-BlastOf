import java.io.IOException;
import java.util.Scanner;

/*
    Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação ele deseja realizar. 
    O resultado da operação deve ser acompanhado de uma frase que diga se o número é:
par ou ímpar;
positivo ou negativo;
inteiro ou decimal.
*/
public class Tarefa2Decisao {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        double numero1, numero2, resultado = 0;
        char operacao = ' ';

        System.out.println("Digite o 1º número: ");
        numero1 = entrada.nextDouble();

        System.out.println("Digite o 2º número: ");
        numero2 = entrada.nextDouble();

        System.out.println("Qual operação deseja realizar ('+' '-' '*' '/')?: ");
        operacao = (char) System.in.read();

        if (operacao == '+') {
            resultado = numero1 + numero2;
        }
        if (operacao == '-') {
            resultado = numero1 - numero2;
        }
        if (operacao == '*') {
            resultado = numero1 * numero2;
        }
        if (operacao == '/') {
            resultado = numero1 / numero2;
        }

        if (resultado % 2 == 0) {
            System.out.printf("\n %1.2f É um numero par", resultado);
        } else {
            System.out.printf("\n %1.2f É um numero impar", resultado);
        }

        if (resultado > 0) {
            System.out.print(", positivo");
        } else {
            System.out.print(", negativo");
        }

        if (resultado % 1 == 0) {
            System.out.print(" e inteiro");
        } else {
            System.out.print(" e decimal");
        }
    }
}
