package Tarefa6Automoveis;

public class CarroLuxo extends Carro {
    private boolean direcaoHidraulica;
    private boolean arCondicionado;
    private boolean vidrosEletricos;

    public CarroLuxo(String placa, String modelo, byte combustivel, String cor, short ano, boolean direcaoHidraulica,
            boolean arCondicionado, boolean vidrosEletricos) {
        super(placa, modelo, combustivel, cor, ano);
        this.direcaoHidraulica = direcaoHidraulica;
        this.arCondicionado = arCondicionado;
        this.vidrosEletricos = vidrosEletricos;
    }

    public void setDirecaoHidraulica(boolean direcaoHidraulica) {
        this.direcaoHidraulica = direcaoHidraulica;
    }

    public boolean getDIrecaoHidraulica() {
        return this.direcaoHidraulica;
    }

    public boolean ifDirecaoHidraulica() {
        return this.direcaoHidraulica;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public boolean getArCondicionado() {
        return this.arCondicionado;
    }

    public boolean ifArCondicionado() {
        return this.arCondicionado;
    }

    public void setVidrosEletricos(boolean vidrosEletricos) {
        this.vidrosEletricos = vidrosEletricos;
    }

    public boolean getVidrosEletricos() {
        return this.vidrosEletricos;
    }

    public boolean ifVidrosEletricos() {
        return this.vidrosEletricos;
    }

    public Double custoLuxo() {
        Double custoTotal = 0.0;

        if (getCombustivel() == 1) {
            custoTotal = 12000.00;
        } else if (getCombustivel() == 2) {
            custoTotal = 10500.00;

        } else if (getCombustivel() == 3) {
            custoTotal = 11000.00;

        } else if (getCombustivel() == 4) {
            custoTotal = 13000.00;
        } else {
            return custoTotal = 0.0;
        }

        if (ifArCondicionado()) {
            custoTotal = custoTotal + 2000.00;
        }

        if (ifDirecaoHidraulica()) {
            custoTotal = custoTotal + 800.00;
        }

        if (ifVidrosEletricos()) {
            custoTotal = custoTotal + 1500.00;
        } else {
            return custoTotal;
        }
        return custoTotal;
    }
}
