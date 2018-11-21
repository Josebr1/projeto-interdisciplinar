package br.com.cruzeiro.ads.views;

import br.com.cruzeiro.ads.utils.Console;

import java.util.Scanner;

public class ParalelepipedoView {

    private Scanner in;

    public ParalelepipedoView() {
        in = new Scanner(System.in);
        Console.clear();
        System.out.println("\n\n************************************************");
        System.out.println("                   Paralelepípedo                   ");
        System.out.println("************************************************\n");

        System.out.println(" -> Forneça os valores necessários <-\n");
    }


    public double getValueComprimento() {
        System.out.print("Valor do Comprimento: ");
        return in.nextDouble();
    }

    public double getValueLargura() {
        System.out.print("Valor da Largura: ");
        return in.nextDouble();
    }

    public double getValueAltura() {
        System.out.print("Valor da Altura: ");
        return in.nextDouble();
    }

    public void result(double volume) {
        System.out.println("\n-----------------------");
        System.out.println("Resultado da operação:");
        System.out.println("-----------------------");
        System.out.printf("\tO Volume: %.2f\n", volume);
        Console.waitKey();
    }
}
