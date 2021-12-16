/*
Faça um programa que simule um lançamento de dados. Lance o dado 100 vezes e armazene os resultados em um vetor. 
Depois, mostre quantas vezes cada valor foi conseguido. Dica: use um vetor de contadores (1-6) e uma função para gerar números aleatórios,
simulando os lançamentos dos dados.
*/

import java.util.Random;

public class Tarefa2Listas {

    public static int[] numAleatorios() {
        Random rand = new Random();
        int[] randNumeros;
        randNumeros = new int[101];

        for (int i = 0; i <= 100; i++) {
            randNumeros[i] = rand.nextInt(6) + 1;
        }

        return randNumeros;
    }

    public static void main(String[] args) {

        int[] vezesRepetidas;
        vezesRepetidas = new int[6];

        for (int cont : numAleatorios()) {
            vezesRepetidas[cont - 1]++;
        }

        for (int i = 0; i < 6; i++) {
            System.out.println("O número " + (i + 1) + " aparece " + vezesRepetidas[i] + " vezes");
        }
    }
}
