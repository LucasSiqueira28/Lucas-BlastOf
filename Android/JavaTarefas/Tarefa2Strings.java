/*
Verificação de CPF.

Desenvolva um programa que solicite a digitação de um número de CPF no formato xxx.xxx.xxx-xx e 
indique se é um número válido ou inválido através da validação dos dígitos verificadores e dos caracteres de formatação.
*/

import java.util.Scanner;

public class Tarefa2Strings {
    public static boolean confirmaCPF(String CPF) {
        // considera-se erro CPF's formados por uma sequencia de numeros iguais
        if (CPF.equals("00000000000") ||
                CPF.equals("11111111111") ||
                CPF.equals("22222222222") || CPF.equals("33333333333") ||
                CPF.equals("44444444444") || CPF.equals("55555555555") ||
                CPF.equals("66666666666") || CPF.equals("77777777777") ||
                CPF.equals("88888888888") || CPF.equals("99999999999") ||
                (CPF.length() != 11)) {
            // System.out.println("CPF inválido!");
            return false;
        }

        char digito10, digito11;
        int soma, resultado, numeroCPF, peso;

        // 1º Digito verificador
        soma = 0;
        peso = 10;
        for (int i = 0; i < 9; i++) {
            // converter ultimo numero do cpf em um inteiro, com base na tabela ascii
            numeroCPF = (int) (CPF.charAt(i) - 48);
            soma = soma + (numeroCPF * peso);
            peso = peso - 1;
        }

        resultado = 11 - (soma % 11);
        if ((resultado == 10) || (resultado == 11)) {
            digito10 = '0';
        } else
            digito10 = (char) (resultado + 48); // converte no caractere numerico

        // 2º Digito verificador
        soma = 0;
        peso = 11;
        for (int i = 0; i < 10; i++) {
            numeroCPF = (int) (CPF.charAt(i) - 48);
            soma = soma + (numeroCPF * peso);
            peso = peso - 1;
        }

        resultado = 11 - (soma % 11);
        if ((resultado == 10) || (resultado == 11)) {
            digito11 = '0';
        } else
            digito11 = (char) (resultado + 48);

        if ((digito10 == CPF.charAt(9)) && (digito11 == CPF.charAt(10))) {
            return (true);
            // System.out.println("Correto");
        } else {
            return (false);
            // System.out.println("deu erro :(");
        }
    }

    public static String imprimeCPF(String CPF) {
        return (CPF.substring(0, 3) + "." + CPF.substring(3, 6) + "." +
                CPF.substring(6, 9) + "-" + CPF.substring(9, 11));
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String CPF;

        System.out.printf("Digite seu CPF: ");
        CPF = entrada.next();

        if (Tarefa2Strings.confirmaCPF(CPF) == true)
            System.out.printf("nCPF válido: %s\n", Tarefa2Strings.imprimeCPF(CPF));
        else
            System.out.printf("CPF inválido");
    }
}
