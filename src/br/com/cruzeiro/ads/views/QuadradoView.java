package br.com.cruzeiro.ads.views;

import java.util.Scanner;

public class QuadradoView {

    private Scanner in;

    public QuadradoView() {
        in = new Scanner(System.in);
    }

    public double setValueLado() {
        System.out.print("Valor do lado do quadrado: ");
        return in.nextDouble();
    }

    public void result(double area, double perimetro) {
        System.out.printf("Area: %.2f, Perimetro: %.2f\n", area, perimetro);
    }
}
