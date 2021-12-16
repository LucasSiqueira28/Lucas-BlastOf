package Tarefa1Classes;

public class Retangulo {
    protected int comprimento;
    protected int largura;

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getLargura() {
        return largura;
    }

    public int getPisos() {
        return comprimento * largura;
    }

    public int getRodape() {
        return 2 * (comprimento + largura);
    }
}
