package Tarefa5Agencia;

public class Corrente extends Conta {
    private Double mensalidade;

    public Corrente(String numero, String agencia, double saldo, double mensalidade) {
        super(numero, agencia, saldo);
        this.mensalidade = mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    public double getMensalidade() {
        return this.mensalidade;
    }

    public Double descontaMensalidade() {
        Double saldoFInal = saldo - mensalidade;
        setSaldo(saldoFInal);
        return saldoFInal;
    }

    public String exibirDados() {
        return super.exibirDados() + " mensalidade: " + mensalidade;
    }

}
