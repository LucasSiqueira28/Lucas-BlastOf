package Tarefa2Classes;

public class Combustivel {
    protected String tipoCombustivel;
    protected double valorLitro, quantidadeCombustivel;

    public Combustivel(String tipoCombustivel, double valorLitro, double quantidadeCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setValorLitro(double valorLitro) {
        this.valorLitro = valorLitro;
    }

    public double getValorLitro() {
        return valorLitro;
    }

    public void setQuantidadeCombustivel(double quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public double getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }

    public void abastecerPorValor(double litro) {
        double litros = 0;
        litros = litro / valorLitro;
        this.quantidadeCombustivel -= litros;
        System.out.printf("\nLitros colocados: %1.2f ", litros);
    }

    public void abastecerPorLitro(double litro) {
        double valorpago = 0;
        this.quantidadeCombustivel -= litro;
        valorpago = litro * valorLitro;
        System.out.printf("Valor a ser pago: R$ %1.2f", valorpago);
    }

    // alterarValor( )
    // alterarCombustivel( )
    // alterarQuantidadeCombustivel( )
    public void imprimeCombustivel() {
        System.out.println("\nTipo de combustivel: " + tipoCombustivel);
        System.out.println("Preço do combustível: R$" + valorLitro);
        System.out.printf("Total de combustivel: %1.2f", quantidadeCombustivel);
        System.out.println("\n");
    }
}
