package br.com.cruzeiro.ads.views;

import br.com.cruzeiro.ads.utils.Console;

import java.util.Scanner;

public class TrianguloView {

    private Scanner in;

    public TrianguloView() {
        in = new Scanner(System.in);
        Console.clear();
        System.out.println("\n\n************************************************");
        System.out.println("                     Triângulo                      ");
        System.out.println("************************************************\n");

        System.out.println(" -> Forneça os valores necessários <-\n");
    }

    public double getValueBase() {
        System.out.print("Valor da Base: ");
        return in.nextDouble();
    }

    public double getValueAltura() {
        System.out.print("Valor da Altura: ");
        return in.nextDouble();
    }

    public double getValueLado() {
        System.out.print("Valor do Lado: ");
        return in.nextDouble();
    }

    public void result(double area, double perimetro) {
        System.out.println("\n-----------------------");
        System.out.println("Resultados da operação:");
        System.out.println("-----------------------");
        System.out.printf("\tÁrea: %.2f \n\tPerímetro: %.2f\n", area, perimetro);
        Console.waitKey();
    }
}
