public class Funcionario {
    protected String nome;
    protected String CPF;
    protected Double salario;

    public Funcionario(String nome, String CPF, Double salario) {
        this.nome = nome;
        this.CPF = CPF;
        this.salario = salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getCPF() {
        return this.CPF;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getSalario() {
        return this.salario;
    }

    public void bonificacao(Funcionario funcionario) {
        double bonus = 0;
        if (funcionario instanceof Engenheiro) {
            System.out.println("Bonus de: " + funcionario.salario * 0.10);
        } else if (funcionario instanceof Gerente) {
            System.out.println("Bonus de: " + funcionario.salario * 0.05);
        }
    }

    public void exibir() {
        System.out.println("Nome: " + this.nome + " CPF: " + this.CPF + " Salario: " + this.salario);
    }

}
