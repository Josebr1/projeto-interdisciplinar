package br.com.cruzeiro.ads.controllers;

import br.com.cruzeiro.ads.models.Equacao2Grau;

public class Equacao2GrauController {

    private Equacao2Grau mEquacao2Grau;

    public Equacao2GrauController(int a, int b, int c) {
        mEquacao2Grau = new Equacao2Grau(a, b, c);
    }

    public double delta() {
        return Math.pow(mEquacao2Grau.getB(), 2) - (4 * mEquacao2Grau.getA() * mEquacao2Grau.getC());
    }

    public double calcularX1() {
        return (-(mEquacao2Grau.getB()) + Math.sqrt(delta())) / (2 * mEquacao2Grau.getA());
    }

    public double calcularX2() {
        return (-(mEquacao2Grau.getB()) - Math.sqrt(delta())) / (2 * mEquacao2Grau.getA());
    }

    public boolean temRaizes() {
        return delta() >= 0 ? true : false;
    }

}
