package br.com.cruzeiro.ads.models;

import br.com.cruzeiro.ads.models.interfaces.IFigura3D;

public class Paralelepipedo extends Ponto implements IFigura3D {

    private double a;
    private double b;
    private double c;

    public Paralelepipedo(double x, double y, double a, double b, double c) {
        super(x, y);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Paralelepipedo(double a, double b, double c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculoVolume() {
        return a * b * c;
    }
}
