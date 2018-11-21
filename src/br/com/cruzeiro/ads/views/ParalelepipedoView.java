package br.com.cruzeiro.ads.views;

import java.util.Scanner;

public class ParalelepipedoView {

    private Scanner in;

    public ParalelepipedoView() {
        in = new Scanner(System.in);
    }


    public double setValueComprimento() {
        System.out.print("Valor do comprimento: ");
        return in.nextDouble();
    }

    public double setValueLargura() {
        System.out.print("Valor da largura: ");
        return in.nextDouble();
    }

    public double setValueAltura() {
        System.out.print("Valor Altura: ");
        return in.nextDouble();
    }

    public void result(double volume) {
        System.out.printf("O Volume: %.2f\n", volume);
    }
}
