package Tarefa8Compra;

public class Compra {
    protected Double preco;
    protected int parcelas;
    protected String tipo;

    public Compra(double preco, int parcelas, String tipo) {
        this.preco = preco;
        this.parcelas = parcelas;
        this.tipo = tipo;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getPreco() {
        return this.preco;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public int getParcelas() {
        return this.parcelas;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void pagarParcela() {
        parcelas -= 1;
    }

    public void quitarCompra() {
        parcelas = 0;
    }

    public void cancelarCompra() {
        System.out.println("Compra cancelada.");
        parcelas = 0;
    }

    public void atualizarParcela(Double taxadeJuros, int novaQuantidadeParcela) {
        double novoValor = 0;
        parcelas = novaQuantidadeParcela;
        novoValor = preco + (preco * taxadeJuros * novaQuantidadeParcela);
        preco = novoValor;

    }
}
