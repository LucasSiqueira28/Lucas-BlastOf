package Tarefa9Agencia;

public class PessoaJuridica extends Contrato {
    protected String CNPJ;
    protected String IE;

    public PessoaJuridica(int numero, String contratante, float valor, int prazo, String CNPJ, String IE) {
        super(numero, contratante, valor, prazo);
        this.CNPJ = CNPJ;
        this.IE = IE;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getCNPJ() {
        return this.CNPJ;
    }

    public void setIE(String IE) {
        this.IE = IE;
    }

    public String getIE() {
        return this.IE;
    }

    public void exibir() {
        super.exibir();
        System.out.println("CNPJ: " + this.CNPJ + " IE: " + this.IE);
    }

    @Override
    public float calcularPrestacao() {
        float prestacao = 0;
        prestacao = (this.valor / this.prazo) + 3;
        return prestacao;
    }

    public void exibirInfo() {
        System.out.println("Valor do contrato: " + this.valor + " Prazo: " + this.prazo + " Valor da prestacao: "
                + calcularPrestacao());
    }

}
