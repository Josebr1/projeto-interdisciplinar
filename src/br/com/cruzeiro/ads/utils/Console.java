package br.com.cruzeiro.ads.utils;

import java.io.IOException;
import java.util.Scanner;

public class Console {

    public static void clear() {
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {}
    }

    public static void waitKey() {
        System.out.print("\nPressione qualquer tecla para continuar...");
        new Scanner(System.in).nextLine();
    }

}
