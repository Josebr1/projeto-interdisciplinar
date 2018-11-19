package br.com.cruzeiro.ads.models;

import br.com.cruzeiro.ads.models.interfaces.IFigura3D;

public class Cilindro extends Ponto implements IFigura3D {

    private double raio;
    private double altura;

    public Cilindro(double x, double y, double raio, double altura) {
        super(x, y);
        this.raio = raio;
        this.altura = altura;
    }

    public Cilindro(double raio, double altura) {
        super();
        this.raio = raio;
        this.altura = altura;
    }

    @Override
    public double calculoVolume() {
        return Math.PI * Math.pow(this.raio, 2) * this.altura;
    }
}
