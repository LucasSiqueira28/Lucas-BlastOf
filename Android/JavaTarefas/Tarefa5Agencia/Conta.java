package Tarefa5Agencia;

public class Conta {
    protected String numero;
    protected String agencia;
    protected double saldo;

    public Conta(String numero, String agencia, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String exibirDados() {
        return ("Conta: " + this.numero + " Agencia: " + this.agencia + " Saldo: " + this.saldo);
    }
}
