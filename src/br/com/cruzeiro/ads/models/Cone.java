package br.com.cruzeiro.ads.models;

import br.com.cruzeiro.ads.models.interfaces.IFigura3D;

public class Cone extends Ponto implements IFigura3D {

    private double raio;
    private double altura;

    public Cone() {
    }

    public Cone(double x, double y, double raio, double altura) {
        super(x, y);
        this.raio = raio;
        this.altura = altura;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calculoVolume() {
        return (1 * Math.PI * Math.pow(raio, 2) * altura) / 3;
    }
}
