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
                    TrianguloController trianguloController = new TrianguloController(new Triangulo(), new TrianguloView());
                    trianguloController.init();
                    trianguloController.updateView();
                    break;
                case "2":
                    QuadradoController quadradoController = new QuadradoController(new Quadrado(), new QuadradoView());
                    quadradoController.init();
                    quadradoController.updateView();
                    break;
                case "3":
                    ConeController coneController = new ConeController(new Cone(), new ConeView());
                    coneController.init();
                    coneController.updateView();
                    break;
                case "4":
                    ParalelepipedoController paralelepipedoController = new ParalelepipedoController(new Paralelepipedo(), new ParalelepipedoView());
                    paralelepipedoController.init();
                    paralelepipedoController.updateView();
                    break;
                case "5":
                    CilindroController cilindroController = new CilindroController(new Cilindro(), new CilindroView());
                    cilindroController.init();
                    cilindroController.updateView();
                    break;
                case "6":
                    Equacao2GrauController equacao2Grau = new Equacao2GrauController(new Equacao2Grau(), new Equacao2GrauView());
                    equacao2Grau.init();
                    equacao2Grau.updateView();
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
