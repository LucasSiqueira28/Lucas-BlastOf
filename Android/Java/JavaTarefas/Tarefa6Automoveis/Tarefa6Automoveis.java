package Tarefa6Automoveis;

public class Tarefa6Automoveis {
    public static void main(String[] args) throws Exception {
        Carro carro = new Carro("ABC1234", "Fusca", Carro.GASOLINA, "Azul", (short) 1990);
        CarroLuxo carroluxo = new CarroLuxo("DEF5678", "Uno de Escada", CarroLuxo.GAS, "Branco", (short) 1820, true,
                false, true);

        System.out.println("Custo do carro, conforme seu combustivel: " + carro.custoGasolina());
        System.out.println("Custo do carro de luxo, conforme seu combustivel: " + carroluxo.custoGasolina());
    }
}
