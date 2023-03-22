package org.example;

import java.util.Scanner;

public class Desafio05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite qualquer coisa: ");
        String texto = in.nextLine();
        in.close();

        String textoInvertido = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            textoInvertido += texto.charAt(i);
        }

        System.out.println(textoInvertido);
    }
}
