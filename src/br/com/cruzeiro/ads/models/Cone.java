package br.com.cruzeiro.ads.models;

import br.com.cruzeiro.ads.models.interfaces.IFigura3D;

public class Cone extends Ponto implements IFigura3D {

    public Cone(double x, double y) {
        super(x, y);
    }

    @Override
    public double calculoVolume() {
        return 0;
    }
}
