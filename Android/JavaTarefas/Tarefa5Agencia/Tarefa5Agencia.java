package Tarefa5Agencia;

public class Tarefa5Agencia {
    public static void main(String[] args) throws Exception {
        Corrente contaCorrente = new Corrente("21039", "0001", 10.25, 1.0);
        Poupanca contaPoupanca = new Poupanca("12091", "0023", 900.10, 10.0);
        Double rend;

        System.out.println("\nConta Corrente: ");
        System.out.println(contaCorrente.exibirDados());
        System.out.println("\nDesconto na conta corrente: ");
        contaCorrente.descontaMensalidade();
        System.out.println(contaCorrente.exibirDados());

        System.out.println("\nConta Poupança: ");
        System.out.println(contaPoupanca.exibirDados());
        System.out.println("Rendimento na conta poupança: ");
        rend = contaPoupanca.calculaRendimento(10);
        System.out.println(rend);
    }
}
