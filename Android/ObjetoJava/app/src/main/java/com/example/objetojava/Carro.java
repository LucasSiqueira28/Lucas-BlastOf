package com.example.objetojava;

public class Carro extends Veiculo{
    public Carro(String cor, int rodas, String marca, int ano, String combustivel) {
        super(cor, rodas, marca, ano, combustivel);
    }

    //private String marca = "Fusca"; //não consigo chamar na main, somente no escopo locaL

    @Override
    public void veiculoAndar(){
        System.out.println("Carro está andando");
    }

    public void veiculoFrear(){
        System.out.println("Carro está freiando");
    }


}
