package br.com.cruzeiro.ads.models;

import br.com.cruzeiro.ads.models.interfaces.IFigura2D;

public class Triangulo extends Ponto implements IFigura2D {

    public Triangulo(double x, double y) {
        super(x, y);
    }

    @Override
    public double calculoArea() {
        return 0;
    }

    @Override
    public double calculoPerimetro() {
        return 0;
    }
}
