package com.example.objetojava;

public class Veiculo {
    private String cor;
    private int rodas;
    private String marca;
    private int ano;
    private String combustivel;

    public Veiculo(String cor, int rodas, String marca, int ano, String combustivel){
        this.cor = cor;
        this.rodas = rodas;
        this.marca = marca;
        this.ano = ano;
        this.combustivel = combustivel;
    };

    public String getCor(){
      return this.cor;
    };

    public void setCor(String cor){
        this.cor = cor;
    };

    public int getRodas(){
        return this.rodas;
    }
    public void setRodas(int rodas){
        this.rodas = rodas;
    }

    public String getMarca() {
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public int getAno(){
        return this.ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }

    public String getCombustivel(){
        return this.combustivel;
    }
    public void setCombustivel(String combustivel){
        this.combustivel = combustivel;
    }

    public void veiculoAndar(){
        System.out.println("Veiculo está andando");
    }

    public void veiculoFrear(){
        System.out.println("Veiculo está freiando");
    }

}
