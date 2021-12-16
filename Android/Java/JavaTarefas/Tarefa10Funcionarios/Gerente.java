public class Gerente extends Funcionario {
    private float senhaEspecial;
    private int quantidadeFuncionarios;

    public Gerente(String nome, String CPF, Double salario, float senhaEspecial, int quantidadeFuncionarios) {
        super(nome, CPF, salario);
        this.senhaEspecial = senhaEspecial;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public void setSenhaEspecial(float senhaEspecial) {
        this.senhaEspecial = senhaEspecial;
    }

    public float getSenhaEspecial() {
        return this.senhaEspecial;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public int getQuantidadeFuncionarios() {
        return this.quantidadeFuncionarios;
    }

    public void exibir() {
        super.exibir();
        System.out.println(
                "Senha Especial: " + this.senhaEspecial + " Quantidade de funcionarios: "
                        + this.quantidadeFuncionarios);
    }
}
