package Tarefa8Compra;

public class ContaEstudante extends Compra {
    public ContaEstudante(double preco, int parcelas, String tipo) {
        super(preco, parcelas, tipo);
    }

    @Override // sobreescrever
    public void pagarParcela() {
        setParcelas(getParcelas() - 1);
    }

    @Override
    public void quitarCompra() {
        setParcelas(0);
    }
}
