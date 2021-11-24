import java.util.ArrayList;

public class ListArray {
    public static void main(String[] args) {
        ArrayList<String> clientes = new ArrayList();

        clientes.add("Lucas");
        clientes.add("Eduardo");
        clientes.add("Barbosa");

        clientes.remove(2);
        // clientes.clear(); remove o array inteiro

        System.out.println(clientes.toString()); // todos os itens do array list
        System.out.println(clientes.get(1));
        System.out.println(clientes.isEmpty());// ve se o array está vazio
        System.out.println(clientes.size()); // tamanho do array
        System.out.println(clientes.contains("Lucas")); // ve se tal nome está dentro do arrays
        System.out.println(clientes.indexOf("Eduardo"));// indice
    }
}
