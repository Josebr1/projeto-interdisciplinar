package br.com.cruzeiro.ads.models;

import br.com.cruzeiro.ads.models.interfaces.IFigura2D;

public class Quadrado extends Ponto implements IFigura2D {

    private double lado;

    public Quadrado(double x, double y, double lado) {
        super(x, y);
        this.lado = lado;
    }

    public Quadrado(double lado) {
        super();
        this.lado = lado;
    }

    @Override
    public double calculoArea() {
        return Math.pow(lado, 2);
    }

    @Override
    public double calculoPerimetro() {
        return lado * 4;
    }
}
