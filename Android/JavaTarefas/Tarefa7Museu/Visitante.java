package Tarefa7Museu;

import java.util.Date;

public class Visitante {
    protected String nome;
    protected String CPF;
    protected Date dataNascimento;
    protected int temas;

    public Visitante(String nome, String CPF, Date dataNascimento, int temas) {
        this.nome = nome;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
        this.temas = temas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setCPF(String CPF) {
        this.nome = CPF;
    }

    public String getCPF() {
        return this.CPF;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Date getDataNascimento() {
        return this.dataNascimento;
    }

    public void setTemas(int temas) {
        this.temas = temas;
    }

    public int getTemas() {
        return this.temas;
    }

    public void exibir() {
        System.out.println("Nome: " + this.nome + " CPF: " + this.CPF + " Data de Nascimento: " + this.dataNascimento
                + " Temas: " + this.temas);
    }

}