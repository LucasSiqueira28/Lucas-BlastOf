public class SwitchCase {
    public static void main(String[] args) {
        int opcao = 2;
        switch (opcao) {
        case 1:
            System.out.println("Abra a sua conta");
            break;
        case 2:
            System.out.println("Fatura de cartão");
            break;
        case 3:
            System.out.println("Credito imobiliario");
            break;
        default:
            System.out.println("Escolha alguma opção válida!");
        }
    }
}
