package Tarefa9Agencia;

public abstract class Contrato {
    protected int numero;
    protected String contratante;
    protected float valor;
    protected int prazo;

    public Contrato(int numero, String contratante, float valor, int prazo) {
        this.numero = numero;
        this.contratante = contratante;
        this.valor = valor;
        this.prazo = prazo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setContratante(String contratante) {
        this.contratante = contratante;
    }

    public String getContratante() {
        return this.contratante;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getValor() {
        return this.valor;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }

    public int getPrazo() {
        return this.prazo;
    }

    public void exibir() {
        System.out.println("Numero: " + this.numero + " Contratante: " + this.contratante);
    }

    public abstract float calcularPrestacao();
}
