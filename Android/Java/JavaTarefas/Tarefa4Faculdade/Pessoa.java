package Tarefa4Faculdade;

public class Pessoa {
    protected String nome;
    protected String endereco;
    protected String telefone;
    protected int idade;
    protected double altura;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome + " Endereço: " + endereco + " Telefone: " + telefone + " Idade: " + idade
                + " Altura: " + altura);
    }
}
