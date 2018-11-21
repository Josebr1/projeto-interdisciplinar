package br.com.cruzeiro.ads.views;

import java.util.Scanner;

public class Equacao2GrauView {

    private Scanner in;

    public void init() {
        in = new Scanner(System.in);
    }

    public double setValueA() {
        System.out.print("Digite o valor de A: ");
        return in.nextDouble();
    }

    public double setValueB() {
        System.out.print("Digite o valor de B: ");
        return in.nextDouble();
    }

    public double setValueC() {
        System.out.print("Digite o valor de C: ");
        return in.nextDouble();
    }

    public void result(double delta, boolean temRaizes, double x1, double x2) {
        System.out.println("Valor do DELTA: " + delta);
        System.out.println("Exite raizes: " + (temRaizes ? "Sim" : "Não"));
        if (temRaizes) {
            System.out.printf("Valor de X' %.2f\n", x1);
            System.out.printf("Valor de X'' %.2f\n", x2);
        }
    }
}
