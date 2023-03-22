package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        int num;
        String pertence = "";

        Scanner in = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Digite um número inteiro: ");
                num = Integer.parseInt(in.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("O valor digitado não é um número inteiro válido. Tente novamente.");
            }
        }
        in.close();

        List<Integer> lista = new ArrayList<Integer>();
        lista = fibonacciLista(num);
        if (!lista.contains(num)){
            pertence = " não";
        }
        System.out.println(num+pertence+" está na sequencia de fibonacci.");
    }

    public static List<Integer> fibonacciLista(int n) {
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(0);
        int i = 1;
        while (lista.get(lista.size()-1) <= n) {
            lista.add((int) formulaFechada(i));
            i += 1;
        }
        return lista;
    }
    static long formulaFechada(int enesimo) {
        double raizCinco = Math.sqrt(5);
        double fn = 1.0/raizCinco*Math.pow((1.0/2.0+raizCinco/2.0), enesimo)-1.0/raizCinco*Math.pow((1.0/2.0-raizCinco/2.0), enesimo);
        return Math.round(fn);
    }

}
