package Tarefa9Agencia;

public class PessoaFisica extends Contrato {
    protected String CPF;
    protected int idade;

    public PessoaFisica(int numero, String contratante, float valor, int prazo, String CPF, int idade) {
        super(numero, contratante, valor, prazo);
        this.CPF = CPF;
        this.idade = idade;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getCPF() {
        return this.CPF;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void exibir() {
        super.exibir();
        System.out.println("CPF: " + this.CPF + " Idade: " + this.idade);
    }

    @Override
    public float calcularPrestacao() {
        float prestacao = 0;
        prestacao = this.valor / this.prazo;

        if (this.idade <= 30) {
            prestacao += 1;
        }
        if (this.idade <= 40) {
            prestacao += 2;
        }
        if (this.idade <= 50) {
            prestacao += 3;
        }
        if (this.idade <= 60) {
            prestacao += 4;
        }

        return prestacao;
    }

    public void exibirInfo() {
        System.out.println("Valor do contrato: " + this.valor + " Prazo: " + this.prazo + " Valor da prestacao: "
                + calcularPrestacao() + " Idade: " + this.idade);
    }

}
