package Tarefa5Agencia;

public class Poupanca extends Conta {
    private Double rendimento;

    public Poupanca(String numero, String agencia, double saldo, double rendimento) {
        super(numero, agencia, saldo);
        this.rendimento = rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    public double getRendimento() {
        return this.rendimento;
    }

    public Double calculaRendimento(int meses) {
        Double saldoF = saldo + (saldo * rendimento * meses);
        return saldoF;
    }

    public String exibirDados() {
        return super.exibirDados() + " rendimento: " + rendimento;
    }
}
