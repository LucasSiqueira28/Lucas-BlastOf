public class Tarefa10Funcionarios {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Zé", "029339273811", 5000.00, 123, 300);
        Engenheiro engenheiro = new Engenheiro("Maria", "92033019313", 3000.50, "923-0", "Mecanico", "Boia");

        System.out.println("Gerente: ");
        gerente.exibir();
        gerente.bonificacao(gerente);

        System.out.println("\nEngenheiro: ");
        engenheiro.exibir();
        engenheiro.bonificacao(engenheiro);
    }
}
