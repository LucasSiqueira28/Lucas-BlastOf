package Tarefa3Triangulo;

public class Triangulo {
    private double base;
    private double altura;

    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void exibirArea() {
        double area = (getBase() * getAltura()) / 2;
        System.out.println("Valor da Area do triangulo: " + area);
    }

    public void exibirDados() {
        System.out.println("Base: " + base + " Altura: " + altura);
    }

}
