package br.com.cruzeiro.ads.models;

import br.com.cruzeiro.ads.models.interfaces.IFigura3D;

public class Paralelepipedo extends Ponto implements IFigura3D {

    private double comprimento;
    private double largura;
    private double altura;

    public Paralelepipedo() {}

    public Paralelepipedo(double x, double y, double comprimento, double largura, double altura) {
        super(x, y);
        this.comprimento = comprimento;
        this.largura = largura;
        this.altura = altura;
    }

    public Paralelepipedo(double comprimento, double largura, double altura) {
        super();
        this.comprimento = comprimento;
        this.largura = largura;
        this.altura = altura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calculoVolume() {
        return comprimento * largura * altura;
    }
}
