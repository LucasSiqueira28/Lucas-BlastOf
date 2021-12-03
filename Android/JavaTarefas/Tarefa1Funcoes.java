/*Data com mês por extenso. Construa uma função que receba uma data no formato DD/MM/AAAA e 
devolva uma string no formato D de mesPorExtenso de AAAA. Opcionalmente, valide a data e retorne NULL caso a data seja inválida.*/

import java.util.Scanner;

public class Tarefa1Funcoes {
    public static void converterData(int dia, int mes, int ano) {
        if (mes == 1) {
            System.out.println(dia + " de Janeiro de " + ano);
        }
        if (mes == 2) {
            System.out.println(dia + " de Fevereiro de " + ano);
        }
        if (mes == 3) {
            System.out.println(dia + " de Março de " + ano);
        }
        if (mes == 4) {
            System.out.println(dia + " de Abril de " + ano);
        }
        if (mes == 5) {
            System.out.println(dia + " de Maio de " + ano);
        }
        if (mes == 6) {
            System.out.println(dia + " de Junho de " + ano);
        }
        if (mes == 7) {
            System.out.println(dia + " de Julho de " + ano);
        }
        if (mes == 8) {
            System.out.println(dia + " de Agosto de " + ano);
        }
        if (mes == 9) {
            System.out.println(dia + " de Setembro de " + ano);
        }
        if (mes == 10) {
            System.out.println(dia + " de Outubro de " + ano);
        }
        if (mes == 11) {
            System.out.println(dia + " de Novembro de " + ano);
        }
        if (mes == 12) {
            System.out.println(dia + " de Dezembro de " + ano);
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int mes, ano, dia;

        System.out.println("Digite um dia: ");
        dia = entrada.nextInt();
        System.out.println("Digite um mes: ");
        mes = entrada.nextInt();
        System.out.println("Digite um ano: ");
        ano = entrada.nextInt();
        // System.out.println(data);
        converterData(dia, mes, ano);
    }
}