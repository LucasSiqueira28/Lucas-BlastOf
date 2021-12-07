package Tarefa2Universo;

public class Celeste {
    protected String nome;
    protected String tipo;
    private int massa;
    private int tamanho;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }

    public int getMassa() {
        return massa;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }
}