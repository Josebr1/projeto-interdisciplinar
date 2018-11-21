package br.com.cruzeiro.ads.views;

import br.com.cruzeiro.ads.utils.Console;

import java.util.Scanner;

public class Equacao2GrauView {

    private Scanner in;

    public void init() {
        in = new Scanner(System.in);
        Console.clear();
        System.out.println("\n\n************************************************");
        System.out.println("               Equação do 2º Grau                   ");
        System.out.println("************************************************\n");

        System.out.println(" -> Forneça os valores necessários <-\n");
    }

    public double getValueA() {
        System.out.print("Digite o valor de A: ");
        return in.nextDouble();
    }

    public double getValueB() {
        System.out.print("Digite o valor de B: ");
        return in.nextDouble();
    }

    public double getValueC() {
        System.out.print("Digite o valor de C: ");
        return in.nextDouble();
    }

    public void result(double delta, boolean temRaizes, double x1, double x2) {
        System.out.println("\n-----------------------");
        System.out.println("Resultado da operação:");
        System.out.println("-----------------------");
        System.out.println("\tValor do DELTA (Δ): " + delta);
        System.out.println("\tExite raizes: " + (temRaizes ? "Sim" : "Não"));
        if (temRaizes) {
            System.out.println("\t\t **** Raízes da operação **** ");
            System.out.printf("\t\tValor de X' %.2f (√)\n\t\tValor de X'' %.2f(√)\n", x1, x2);
        }
        Console.waitKey();
    }
}
