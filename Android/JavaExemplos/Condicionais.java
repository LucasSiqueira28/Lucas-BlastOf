public class Condicionais {
    public static void main(String[] args) {

        // executa só se for verdadeiro
        if (false) {
            System.out.println("Falso");
        } else {
            System.out.println("Verdadeiro");
        }

        String sexo = " ";

        if (sexo == "Masculino") {
            System.out.println("Sexo Masculino");
        } else if (sexo == "Feminino") {
            System.out.println("Feminino");
        } else {
            System.out.println("Selecione o seu sexo");
        }

        int idade = 18;
        if (idade <= 10) {
            System.out.println("Criança");
        } else if (idade <= 17) {
            System.out.println("Adolescente");
        } else {
            System.out.println("Adulto");
        }
    }
}
