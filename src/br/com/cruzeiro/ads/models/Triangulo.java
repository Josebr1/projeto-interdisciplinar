package br.com.cruzeiro.ads.models;

import br.com.cruzeiro.ads.models.interfaces.IFigura2D;

public class Triangulo extends Ponto implements IFigura2D {

    private double base;
    private double altura;
    private double lado;

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

    @Override
    public double calculoArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calculoPerimetro() {
        return lado + lado + lado;
    }
}
