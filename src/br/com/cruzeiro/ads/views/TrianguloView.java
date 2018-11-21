package br.com.cruzeiro.ads.views;

import java.util.Scanner;

public class TrianguloView {

    private Scanner in;

    public TrianguloView() {
        in = new Scanner(System.in);
    }

    public double setValueBase() {
        System.out.print("Valor da Base: ");
        return in.nextDouble();
    }

    public double setValueAltura() {
        System.out.print("Valor Altura: ");
        return in.nextDouble();
    }

    public double setValueLado() {
        System.out.print("Valor do lado: ");
        return in.nextDouble();
    }

    public void result(double area, double perimetro) {
        System.out.printf("Area: %.2f, Perimetro: %.2f\n", area, perimetro);
    }
}
