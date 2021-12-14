public class Engenheiro extends Funcionario {
    private String crea;
    private String categoria;
    private String projetoAtual;

    public Engenheiro(String nome, String CPF, Double salario, String crea, String categoria, String projetoAtual) {
        super(nome, CPF, salario);
        this.crea = crea;
        this.categoria = categoria;
        this.projetoAtual = projetoAtual;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    public String getCrea() {
        return this.crea;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setProjetoAtual(String projetoAtual) {
        this.projetoAtual = projetoAtual;
    }

    public string getProjetoAtual() {
        return this.projetoAtual;
    }

    public void exibir() {
        super.exibir();
        System.out.println(
                "Crea: " + this.crea + " Categoria: " + this.categoria + " Projeto atual: " + this.projetoAtual);
    }

}
