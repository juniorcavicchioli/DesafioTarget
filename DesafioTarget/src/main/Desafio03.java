package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Desafio03 {

    public static void main(String[] args) {
        // não tenho um JSON. VOu criar uma lista direto.
        List<Double> faturamento = new ArrayList<Double>(Arrays.asList(1500.0, 1000.0, 2000.0, 0d, 3000.0, 2500.0, 0d, 1800.0, 2800.0, 2000.0, 2200.0, 0d, 1500.0, 1900.0, 2700.0, 2300.0, 2400.0, 2000.0, 0d, 2600.0, 2800.0, 2900.0, 2200.0, 2300.0, 1500.0, 0d, 1800.0, 2000.0, 2100.0, 2500.0, 2200.0));

        double menorVlr = menorValor(faturamento);
        System.out.println("O menor valor de faturamento em um dia do mês foi R$" + menorVlr);

        double maiorVlr = maiorValor(faturamento);
        System.out.println("O maior valor de faturamento em um dia do mês foi R$" + maiorVlr);

        int acimaMedia = diasAcimaMedia(faturamento);
        System.out.println("Número de dias com faturamento acima da média mensal: " + acimaMedia);

    }
    static double menorValor(List<Double> lista){
        Double menor = lista.get(0);
        for (Double i:lista){
            if (i != 0 && i < menor)
                menor = i;
        }
        return menor;
    }

    static double maiorValor(List<Double> lista){
        Double maior = 0d;
        for (Double i:lista){
            if (i > maior)
                maior = i;
        } return maior;
    }

    static double contarDifZero(List<Double> lista){
        Double contagem = 0d;
        for (Double numero:lista) {
            if (numero != 0)
                contagem += 1;
        } return contagem;
    }

    static double calcularMedia(List<Double> lista){
        double dias = contarDifZero(lista);
        double total = 0;
        for (Double i: lista){
            total += i;
        } return total / dias;
    }

    static int diasAcimaMedia(List<Double> lista){
        int contagem = 0;
        double media = calcularMedia(lista);
        for (Double numero:lista) {
            if (numero > media)
                contagem += 1;
        } return contagem;
    }
}
