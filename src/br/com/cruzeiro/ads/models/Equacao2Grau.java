package br.com.cruzeiro.ads.models;

public class Equacao2Grau {
    private double a;
    private double b;
    private double c;

    public Equacao2Grau() {}

    public Equacao2Grau(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }


    public double delta() {
        return Math.pow(this.getB(), 2) - (4 * this.getA() * this.getC());
    }

    public double calcularX1() {
        return (-(this.getB()) + Math.sqrt(delta())) / (2 * this.getA());
    }

    public double calcularX2() {
        return (-(this.getB()) - Math.sqrt(delta())) / (2 * this.getA());
    }

    public boolean temRaizes() {
        return delta() >= 0 ? true : false;
    }
}
