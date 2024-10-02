package org.example.cliente_servidor;

import org.example.sintomas_doencas.Doenca;
import org.example.sintomas_doencas.Sintoma;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.Map.Entry;

public class DiagnosticoApriori {
    private HashMap<Doenca,List<Sintoma>> dadosTreinamento;

    public DiagnosticoApriori() {
        dadosTreinamento = new HashMap<>();
    }

    public void adicionarExemploTreinamento(Doenca doenca, List<Sintoma> sintomas) {
        if (!dadosTreinamento.containsKey(doenca)) {
            dadosTreinamento.put(doenca, new ArrayList<>());
        }
        dadosTreinamento.get(doenca).addAll(sintomas);
    }


    public Map<Set<Sintoma>, Integer> treinar(double minSupport) {
        Map<Set<Sintoma>, Integer> itemsetsFrequentes = new HashMap<>();

        // Passo 1: Encontrando os itemsets frequentes de tamanho 1 (sintomas frequentes)
        Map<Sintoma, Integer> frequencias = encontrarItemsetsFrequentesDeTamanho1(minSupport);

        // Passo 2: Gerando itemsets frequentes de tamanho 2 (associações de dois sintomas)
        itemsetsFrequentes.putAll(encontrarItemsetsFrequentesDeTamanho2(frequencias, minSupport));

        return itemsetsFrequentes;
    }

    private Map<Sintoma, Integer> encontrarItemsetsFrequentesDeTamanho1(double minSupport) {
        Map<Sintoma, Integer> frequencias = new HashMap<>();
        for (List<Sintoma> sintomas : dadosTreinamento.values()) {
            for (Sintoma sintoma : sintomas) {
                frequencias.put(sintoma, frequencias.getOrDefault(sintoma, 0) + 1);
            }
        }

        Map<Sintoma, Integer> itemsetsFrequentes = new HashMap<>();
        for (Entry<Sintoma, Integer> entry : frequencias.entrySet()) {
            if (entry.getValue() >= minSupport) {
                itemsetsFrequentes.put(entry.getKey(), entry.getValue());
            }
        }

        return itemsetsFrequentes;
    }

    private Map<Set<Sintoma>, Integer> encontrarItemsetsFrequentesDeTamanho2(Map<Sintoma, Integer> itemsetsFrequentes, double minSupport) {
        Map<Set<Sintoma>, Integer> itemsetsFrequentesTamanho2 = new HashMap();

        for (Sintoma item1 : itemsetsFrequentes.keySet()) {
            for (Sintoma item2 : itemsetsFrequentes.keySet()) {
                if (item1 != item2) {
                    Set<Sintoma> itemset = new HashSet<>();
                    itemset.add(item1);
                    itemset.add(item2);

                    int support = calcularSuporte(itemset);
                    if (support >= minSupport) {
                        itemsetsFrequentesTamanho2.put(itemset, support);
                    }
                }
            }
        }

        return itemsetsFrequentesTamanho2;
    }

    private int calcularSuporte(Set<Sintoma> itemset) {
        int suporte = 0;
        for (Entry<Doenca, List<Sintoma>> entry : dadosTreinamento.entrySet()) {
            List<Sintoma> sintomasDaDoenca = entry.getValue();
            if (sintomasDaDoenca.containsAll(itemset)) {
                suporte++;
            }
        }
        return suporte;
    }
    
    public String diagnosticar(List<Sintoma> sintomas, double minSupport) {
        
        Map<Set<Sintoma>, Integer> itemsetsFrequentes = treinar(minSupport);
        Map<Doenca, Double> similaridades = new HashMap<>();
        double maxSimilarity = 0.0;

        for (Doenca doenca : dadosTreinamento.keySet()) {
            int matchCount = 0;
            List<Sintoma> sintomasDaDoenca = new ArrayList<>(dadosTreinamento.get(doenca));

            for (Set<Sintoma> itemset : itemsetsFrequentes.keySet()) {
                if (sintomas.containsAll(itemset) && sintomasDaDoenca.containsAll(itemset)) {
                    matchCount++;
                }
            }

            // Calcula a similaridade como a contagem de correspondências dividida pelo tamanho dos sintomas da doença
            double similarity = (double) matchCount / sintomasDaDoenca.size();
            similaridades.put(doenca, similarity);

            if (similarity > maxSimilarity) {
                maxSimilarity = similarity;
            }
        }

        if (maxSimilarity > 0.0) {
            final double finalMaxSimilarity = maxSimilarity; // Variável final para usar na expressão lambda

            // Encontre a doença com a maior similaridade
            Doenca diagnóstico = similaridades.entrySet().stream()
                .filter(entry -> entry.getValue() == finalMaxSimilarity)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

            if (diagnóstico != null) {
                return diagnóstico.toString();
            }
        }

        return "Aviso: Não foi encontrado um diagnóstico confiável.";
    }


    
    public HashMap<Doenca,List<Sintoma>> listAllDiagnosticos(){
        
        return this.dadosTreinamento;
    }

    public static void imprimirDiagnostico(Map<String, Double> diagnósticos) {
        for (Map.Entry<String, Double> entry : diagnósticos.entrySet()) {
            String doenca = entry.getKey();
            double confianca = entry.getValue();
            System.out.println("Doença: " + doenca);
            System.out.println("Confiança de Diagnóstico: " + confianca);
        }
    }

}

