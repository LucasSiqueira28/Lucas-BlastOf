package Tarefa7Museu;

import java.util.Date;

public class VisitantePremium extends Visitante {
    protected Double saldo;
    protected int numeroVale;

    public VisitantePremium(String nome, String CPF, Date dataNascimento, int temas, int numeroVale) {
        super(nome, CPF, dataNascimento, temas);
        this.saldo = (double) 100;
        this.numeroVale = numeroVale;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return this.saldo;
    }

    public void setNumeroVale(int numeroVale) {
        this.numeroVale = numeroVale;
    }

    public int getNumeroVale() {
        return this.numeroVale;
    }

    public void pracaAlimentacao(int valor) {
        if (valor <= saldo) {
            setSaldo(saldo - valor);
            System.out.println("VOcê gastou R$: " + valor);
        } else {
            System.out.println("Sem saldo");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Numero do vale: " + this.numeroVale + " saldo: " + this.saldo + " disponivel!.");
    }

    public void exibir() {
        super.exibir();
    }
}
