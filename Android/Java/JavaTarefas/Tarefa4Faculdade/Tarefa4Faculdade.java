package Tarefa4Faculdade;

import java.util.Scanner;
import java.util.Random;

public class Tarefa4Faculdade {

    public static void main(String[] args) {
        float[] vetor;
        vetor = new float[5];
        alimentarVetor(vetor);
        System.out.println("Valor do vetor: ");
        mostrarVetor(vetor);
        System.out.println("Parte inteira do vetor: ");
        mostrarInteiroVetor(vetor);
        System.out.println("Multiplicando por 5 o vetor: ");
        System.out.println(multiplicacaoVetor(vetor, 5));

        int[][] matriz;
        matriz = new int[3][4];
        alimentarMatriz(matriz);
        System.out.println("Soma da matriz: " + somarMatriz(matriz));
        System.out.println("Média da matriz: : " + mediaMatriz(matriz));

        Pessoa p = new Pessoa();
        p.setNome("Lucas");
        p.setIdade(22);
        p.setEndereco("Rua dos sonhos N 92130");
        p.setAltura(1.77);
        ;
        p.setTelefone("40028922");

        p.exibirDados();
    }

    public static void alimentarVetor(float[] vetor) {
        Random aleatorio = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = aleatorio.nextFloat() * 50;
        }
    }

    public static void mostrarVetor(float[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }

    public static void mostrarInteiroVetor(float[] vetor) {
        for (float i : vetor) {
            System.out.println((int) i); // mostrar parte inteira
        }
    }

    public static float multiplicacaoVetor(float[] vetor, int vet) {
        float vetorMultiplicado = 0;
        for (int i = 0; i < vetor.length; i++) {
            vetorMultiplicado = vetor[i] * vet;
        }
        return vetorMultiplicado;
    }

    public static void alimentarMatriz(int[][] matriz) {
        Random aleatorio = new Random();
        for (int[] i : matriz) {
            for (int j = 0; j < i.length; j++) {
                i[j] = aleatorio.nextInt(50);
            }
        }
    }

    public static int somarMatriz(int[][] matriz) {
        int somaMatriz = 0;
        for (int[] i : matriz) {
            for (int j = 0; j < i.length; j++) {
                somaMatriz = somaMatriz + i[j];
                // System.out.println(somaMatriz);
            }
        }

        return somaMatriz;
    }

    public static int mediaMatriz(int[][] matriz) {
        int soma, media;
        soma = somarMatriz(matriz);
        media = soma / (matriz.length * matriz[0].length);
        return media;
    }
}
