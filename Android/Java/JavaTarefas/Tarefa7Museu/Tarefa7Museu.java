package Tarefa7Museu;

import java.text.SimpleDateFormat;

public class Tarefa7Museu {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        Visitante visitante = new Visitante("Zé", "12345678912", format.parse("01/12/1990"), 4);
        VisitantePremium visitantepremium = new VisitantePremium("Maria", "01922801831", format.parse("28/07/2005"),
                901,
                19023);

        visitante.exibir();

        System.out.println("Visitante premiumm, dados: ");
        visitantepremium.exibir();
        visitantepremium.pracaAlimentacao(50);
        visitantepremium.mostrarSaldo();

    }
}
