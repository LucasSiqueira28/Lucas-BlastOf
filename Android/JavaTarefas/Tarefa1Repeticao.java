/*Uma academia deseja fazer um senso entre seus clientes para descobrir o mais alto, o mais baixo, 
a mais gordo e o mais magro, para isto você deve fazer um programa que pergunte a cada um dos clientes da academia seu código, 
sua altura e seu peso. O final da digitação de dados deve ser dado quando o usuário digitar 0 (zero) no campo código. 
Ao encerrar o programa também deve ser informado os códigos e valores do cliente mais alto, do mais baixo, do mais gordo e do mais magro, 
além da média das alturas e dos pesos dos clientes */

import java.util.ArrayList;
import java.util.Scanner;

public class Tarefa1Repeticao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // pesoPeixe = entrada.nextDouble();

        int codigo, pessoa = 0, codigo_Alto = 0, codigo_Baixo = 0, codigo_maisgordo = 0,
                codigo_maismagro = 0;
        double peso = 0, altura = 0, mediaAltura = 0, mediaPeso = 0, somaAltura = 0, somaPeso = 0, pesoMaior = 0,
                pesoMenor = 1000, alturaMaior = 0, alturaMenor = 1000, alturagordo = 0, alturamagro = 0, pesoalto = 0,
                pesobaixo = 0;

        do {
            System.out.println("Digite o codigo: ");
            codigo = entrada.nextInt();

            if (codigo != 0) {
                System.out.println("Digite a altura: ");
                altura = entrada.nextDouble();
                System.out.println("Digite o peso: ");
                peso = entrada.nextDouble();

                pessoa = pessoa + 1;
                somaAltura = somaAltura + altura;
                somaPeso = somaPeso + peso;
            }
            if (peso > pesoMaior) {
                alturagordo = altura;
                pesoMaior = peso;
                codigo_maisgordo = codigo;
            }
            if (peso < pesoMenor) {
                alturamagro = altura;
                pesoMenor = peso;
                codigo_maismagro = codigo;
            }
            if (altura > alturaMaior) {
                pesoalto = peso;
                alturaMaior = altura;
                codigo_Alto = codigo;
            }
            if (altura < alturaMenor) {
                pesobaixo = peso;
                alturaMenor = altura;
                codigo_Baixo = codigo;
            }
        } while (codigo != 0);

        mediaAltura = somaAltura / pessoa;
        mediaPeso = somaPeso / pessoa;

        System.out.println("");
        System.out.println("Cliente mais alto:");
        System.out.println("Codigo: " + codigo_Alto);
        System.out.println("Peso: " + pesoalto);
        System.out.println("Altura: " + alturaMaior);
        System.out.println("Cliente mais baixo:");
        System.out.println("Codigo: " + codigo_Baixo);
        System.out.println("Peso: " + pesobaixo);
        System.out.println("Altura: " + alturaMenor);
        System.out.println("Cliente com maior peso:");
        System.out.println("Codigo: " + codigo_maisgordo);
        System.out.println("Peso: " + pesoMaior);
        System.out.println("Altura: " + alturagordo);
        System.out.println("Cliente com menor peso:");
        System.out.println("Codigo: " + codigo_maismagro);
        System.out.println("Peso: " + pesoMenor);
        System.out.println("Altura: " + alturamagro);
        System.out.println("Media das alturas dos clientes: " + mediaAltura);
        System.out.println("Media dos pesos dos clientes: " + mediaPeso);

    }
}