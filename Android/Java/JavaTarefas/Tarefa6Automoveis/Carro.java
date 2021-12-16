package Tarefa6Automoveis;

public class Carro {
    private String placa;
    private String modelo;
    private byte combustivel;
    private String cor;
    private short ano;

    public static final byte GASOLINA = 1;
    public static final byte ALCOOL = 2;
    public static final byte DIESEL = 3;
    public static final byte GAS = 4;

    public Carro(String placa, String modelo, byte combustivel, String cor, short ano) {
        this.placa = placa;
        this.modelo = modelo;
        this.combustivel = combustivel;
        this.cor = cor;
        this.ano = ano;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setCombustivel(byte combustivel) {
        this.combustivel = combustivel;
    }

    public byte getCombustivel() {
        return this.combustivel;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return this.cor;
    }

    public void setAno(short ano) {
        this.ano = ano;
    }

    public short getAno() {
        return this.ano;
    }

    public Double custoGasolina() {
        if (combustivel == 1) {
            return 12000.00;
        } else if (combustivel == 2) {
            return 10500.00;

        } else if (combustivel == 3) {
            return 11000.00;

        } else if (combustivel == 4) {
            return 13000.00;
        } else {
            return 0.0;
        }
    }
}
