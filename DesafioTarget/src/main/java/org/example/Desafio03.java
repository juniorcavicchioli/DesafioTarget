package org.example;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Desafio03 {

    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode rootNode = objectMapper.readTree(new File("src/main/resources/dados.json"));
        List<Double> faturamento = new ArrayList<Double>();
        for (JsonNode node : rootNode) {
            Double valor = node.get("valor").asDouble();
            faturamento.add(valor);
        }
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
