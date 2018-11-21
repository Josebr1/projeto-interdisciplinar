package br.com.cruzeiro.ads.models;

import br.com.cruzeiro.ads.models.interfaces.IFigura2D;

public class Triangulo extends Ponto implements IFigura2D {

    private double base;
    private double altura;
    private double lado;

    public Triangulo() {}

    public Triangulo(double x, double y, double base, double altura, double lado) {
        super(x, y);
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }

    public Triangulo(double base, double altura, double lado) {
        super();
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calculoArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calculoPerimetro() {
        return lado + lado + lado;
    }
}
