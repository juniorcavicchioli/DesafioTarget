package org.example;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.round;

public class Desafio04 {
    public static void main(String[] args) {
        Map<String, Double> faturamento = new HashMap<>();
        faturamento.put("SP", 67836.43);
        faturamento.put("RJ", 36678.66);
        faturamento.put("MG", 29229.88);
        faturamento.put("ES", 27165.48);
        faturamento.put("Outros", 19849.53);

        double faturamento_total = 0d;
        for (double value : faturamento.values()) {
            faturamento_total += value;
        }
        faturamento.put("total", faturamento_total);
        Map<String, Double> porcentagem = new HashMap<>();
        for (Map.Entry<String, Double> entry : faturamento.entrySet()){
            if (entry.getKey() != "total"){
                porcentagem.put(entry.getKey(), (entry.getValue()/faturamento.get("total"))*100);
                System.out.println("O valor da porcentagem para o estado " + entry.getKey() +
                        " é de " + round(porcentagem.get(entry.getKey())) + "%");
            }
        }
    }
}
