import java.util.Scanner;

public class Tarefa1String {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String frase1, frase2;

        System.out.println("Digite uma frase: ");
        frase1 = entrada.nextLine();
        System.out.println("Digite outra frase: ");
        frase2 = entrada.nextLine();

        System.out.println("Tamanho de '" + frase1 + "': " + frase1.length() + " caracteres");
        System.out.println("Tamanho de '" + frase2 + "': " + frase2.length() + " caracteres");

        if (frase1.toLowerCase() == frase2.toLowerCase() && frase1.length() == frase2.length()) {
            System.out.println("As duas strings são de tamanhos iguais");
            System.out.println("As duas strings possuem o mesmo conteudo");
        } else if (frase1.toLowerCase() == frase2.toLowerCase() && frase1.length() != frase2.length()) {
            System.out.println("As duas strings são de tamanhos diferente");
            System.out.println("As duas strings possuem o mesmo conteudo");
        } else if (frase1.toLowerCase() != frase2.toLowerCase() && frase1.length() == frase2.length()) {
            System.out.println("As duas strings são de tamanhos iguais");
            System.out.println("As duas strings possuem conteudo diferente");
        } else if (frase1.toLowerCase() != frase2.toLowerCase() && frase1.length() != frase2.length()) {
            System.out.println("As duas strings são de tamanhos diferente");
            System.out.println("As duas strings possuem conteudo diferente");
        }
    }
}
