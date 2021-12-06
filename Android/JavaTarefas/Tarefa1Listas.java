/*
Faça um programa que receba a temperatura média de cada mês do ano e armazene-as em uma lista. 
Após isto, calcule a média anual das temperaturas e mostre todas as temperaturas acima da média anual, 
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – janeiro, 2 – fevereiro...).
*/

import java.util.Scanner;

public class Tarefa1Listas {
    // Scanner entrada = new Scanner(System.in);
    // enum - constantes
    public enum Meses {
        JAN("Janeiro"),
        FEV("Fevereiro"),
        MAR("Março"),
        ABR("Abril"),
        MAI("Maio"),
        JUN("Junho"),
        JUL("Julho"),
        AGO("Agosto"),
        SET("Setembro"),
        OUT("Outubro"),
        NOV("Novembro"),
        DEZ("Dezembro");

        String mes;

        Meses(String mes) {
            this.mes = mes;
        }

        static Meses[] listaMeses = Meses.values();

        public static String getMonth(Integer pos) {
            return listaMeses[pos].mes;
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Temperatura média: ");

        Double[] mesesTemp;
        mesesTemp = new Double[12];
        Double tempVariacao = 0.0;

        System.out.println("Digite as temperaturas dos meses: ");
        for (int i = 0; i < 12; i++) {
            System.out.print(Meses.getMonth(i) + ": ");
            mesesTemp[i] = Double.valueOf(entrada.nextLine());
            while (mesesTemp[i] > 40 || mesesTemp[i] < -10) {
                System.out.print(Meses.getMonth(i) + ": ");
                mesesTemp[i] = Double.valueOf(entrada.nextLine());
            }
        }
        for (Double temp : mesesTemp) {
            tempVariacao += temp;
        }

        // dividindo a variacao de temp pelo tamanho do array dos meses.
        tempVariacao = tempVariacao / mesesTemp.length;

        System.out.println("\nMeses com temperatura acima da média anual: ");
        for (int i = 0; i < 12; i++) {
            if (mesesTemp[i] >= tempVariacao) {
                System.out.println(Meses.getMonth(i) + " - " + mesesTemp[i] + "°C");
            }
        }
    }
}
