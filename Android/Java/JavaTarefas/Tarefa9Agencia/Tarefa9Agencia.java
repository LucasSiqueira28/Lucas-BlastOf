package Tarefa9Agencia;

public class Tarefa9Agencia {
    public static void main(String[] args) {
        PessoaFisica pessoafisica = new PessoaFisica(123, "José", (float) 1300.50, 12, "92844927391", 34);
        PessoaJuridica pessoajuridica = new PessoaJuridica(456, "Maria", (float) 500.50, 4, "0129320/1000",
                "12903810312");

        System.out.println("Pessoa Fisica: ");
        pessoafisica.exibir();
        pessoafisica.exibirInfo();

        System.out.println("\nPessoa Juridica: ");
        pessoajuridica.exibir();
        pessoajuridica.exibirInfo();
    }
}
