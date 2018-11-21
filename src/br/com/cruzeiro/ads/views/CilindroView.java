package br.com.cruzeiro.ads.views;


import br.com.cruzeiro.ads.utils.Console;

import java.util.Scanner;

public class CilindroView {

    private Scanner in;

    public CilindroView() {
        Console.clear();
        in = new Scanner(System.in);
        System.out.println("\n\n************************************************");
        System.out.println("                    Cilindro                       ");
        System.out.println("************************************************\n");

        System.out.println(" -> Forneça os valores necessários <-\n");
    }

    public double getValueRaio() {
        System.out.print("Valor do Raio: ");
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
