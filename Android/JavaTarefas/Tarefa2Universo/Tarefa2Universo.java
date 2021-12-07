package Tarefa2Universo;

import java.util.Scanner;

public class Tarefa2Universo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Celeste celeste = new Celeste();
        int contador = 0, cAsteroide = 0, cPlanetas = 0, cNebulosas = 0, cDif = 0;

        while (contador != 6) {
            System.out.println("\n");
            System.out.println(contador + 1 + "ºCorpo celeste");
            System.out.println("Nome: ");
            celeste.setNome(entrada.next());
            System.out.println("Tipo: ");
            celeste.setTipo(entrada.next());

            if (!celeste.getTipo().toString().equals("asteroide") && !celeste.getTipo().toString().equals("planeta")
                    && !celeste.getTipo().toString().equals("nebulosa")) {
                cAsteroide += 1;

            }

            if (celeste.getTipo().toString().equals("asteroide")) {
                cAsteroide += 1;

            }
            if (celeste.getTipo().toString().equals("planeta")) {
                cPlanetas += 1;
                System.out.println("ahsduhduasdasd");
            }
            if (celeste.getTipo().toString().equals("nebulosa")) {
                cNebulosas += 1;
            }
            System.out.println("Massa: ");
            celeste.setMassa(entrada.nextInt());
            System.out.println("Tamanho: ");
            celeste.setTamanho(entrada.nextInt());

            contador++;
        }
        System.out.println("Asteróides: " + cAsteroide);
        System.out.println("Planetas: " + cPlanetas);
        System.out.println("Nebulosas: " + cNebulosas);
    }
}
