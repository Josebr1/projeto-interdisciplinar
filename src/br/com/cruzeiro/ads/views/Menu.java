package br.com.cruzeiro.ads.views;

import br.com.cruzeiro.ads.controllers.*;
import br.com.cruzeiro.ads.models.*;
import br.com.cruzeiro.ads.utils.Console;

import java.util.Scanner;

public class Menu {

    public static void execute() {
        Scanner in = new Scanner(System.in);

        for (; ; ) {
            System.out.println("====================================================================================================");
            System.out.println("                                                ******                                              ");
            System.out.println("====================================================================================================");
            System.out.println("\t\t\t** Cálculo da área total da figura e cálculo do perímetro **");
            System.out.println("\t\t1. Triângulo");
            System.out.println("\t\t2. Quadrado");
            System.out.println("");
            System.out.println("\t\t\t** Cálculo do volume **");
            System.out.println("\t\t3. Cone");
            System.out.println("\t\t4. Paralelepípedo");
            System.out.println("\t\t5. Cilindro");
            System.out.println("");
            System.out.println("\t\t\t** Outros **");
            System.out.println("\t\t6. Equação de 2º grau");
            System.out.println("\t\t7. Sair");

            System.out.println("====================================================================================================");
            System.out.print("  [Opção do Usuário] -> ");

            String digitado = in.nextLine();
            if (digitado.equals("7"))
                break;

            switch (digitado) {
                case "1":
                    new TrianguloController(new Triangulo(), new TrianguloView()).exec();
                    break;
                case "2":
                    new QuadradoController(new Quadrado(), new QuadradoView()).exec();
                    break;
                case "3":
                    new ConeController(new Cone(), new ConeView()).exec();
                    break;
                case "4":
                    new ParalelepipedoController(new Paralelepipedo(), new ParalelepipedoView()).exec();
                    break;
                case "5":
                    new CilindroController(new Cilindro(), new CilindroView()).exec();
                    break;
                case "6":
                    new Equacao2GrauController(new Equacao2Grau(), new Equacao2GrauView()).exec();
                    break;
                default:
                    System.out.println("Opção inválida");
                    Console.waitKey();
            }

            Console.clear();

            System.out.println("====================================================================================================");
        }
    }
}
