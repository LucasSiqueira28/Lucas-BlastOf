import java.io.IOException;
import java.util.Scanner;

/*
    Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, 
    utilizando as seguintes fórmulas:
        Para homens: (72.7*h) - 58
        Para mulheres: (62.1*h) - 44.7
*/
public class Tarefa1 {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        double h, pesoIdeal = 0;
        char sexo;

        System.out.println("Digite uma altura: ");
        h = entrada.nextDouble();

        System.out.println("É homem (H) ou mulher (M)? ");
        sexo = (char) System.in.read();

        if (sexo == 'm') {
            pesoIdeal = (62.1 * h) - 44.7;
            System.out.printf("Seu peso ideial é de: %1.2f\n", pesoIdeal);
        } else if (sexo == 'h') {
            pesoIdeal = (72.7 * h) - 58;
            System.out.printf("Seu peso ideial é de: %1.2f\n", pesoIdeal);
        } else {
            System.out.println("Digite um sexo válido.");
        }
    }
}
