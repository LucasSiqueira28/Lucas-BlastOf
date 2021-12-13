package Tarefa8Compra;

public class Tarefa8Compra {
    public static void main(String[] args) {
        Compra compra = new Compra(800.50, 5, "Fatura do Cartão");
        ContaEstudante contaEstudante = new ContaEstudante(100.10, 2, "Marmita");

        verificaObjeto(compra);
        verificaObjeto(contaEstudante);
    }

    public static void verificaObjeto(Object objeto) {
        if (objeto instanceof Compra) {
            // some os preços e os números de parcelas e imprima tais valores no terminal.
            Compra compra = Compra.class.cast(objeto);
            double soma = 0;
            soma = compra.getPreco() + compra.getParcelas();
            System.out.println("Soma dos preços e parcelas: " + soma);
        }
        if (objeto instanceof ContaEstudante) {
            // divida o preço e o número de parcelas por 2 e imprima os valores no terminal.
            ContaEstudante contaEstudante = ContaEstudante.class.cast(objeto);
            double preco = 0;
            preco = contaEstudante.getPreco() / 2;
            System.out.println("Preço das parcelas divido por 2: " + preco);
        }
    }
}
