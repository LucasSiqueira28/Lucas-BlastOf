import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListArrayForEach {
    public static void main(String[] args) {
        // ordenar arraylist por foreach
        List<String> nomes = new ArrayList<String>();
        nomes.add("Lucas");
        nomes.add("Eduardo");
        nomes.add("Barbosa");
        nomes.add("de");
        nomes.add("Siqueira");

        // é estatico, da classe, não precisa de "new"
        Collections.sort(nomes); // ordenação de forma crescente

        // foreach, para cada elementos da lista
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
