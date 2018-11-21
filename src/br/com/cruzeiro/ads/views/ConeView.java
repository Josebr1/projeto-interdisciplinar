package br.com.cruzeiro.ads.views;

import java.util.Scanner;

public class ConeView {
    private Scanner in;

    public ConeView() {
        in = new Scanner(System.in);
    }

    public double setValueRaio() {
        System.out.print("Valor do raio: ");
        return in.nextDouble();
    }

    public double setValueAltura() {
        System.out.print("Valor da Altura: ");
        return in.nextDouble();
    }

    public void result(double volume) {
        System.out.printf("O Volume: %.2f\n", volume);
    }
}
