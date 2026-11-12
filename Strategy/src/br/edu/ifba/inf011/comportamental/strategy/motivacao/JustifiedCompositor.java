package br.edu.ifba.inf011.comportamental.strategy.motivacao;

import java.util.ArrayList;
import java.util.List;

/**
 * PARTICIPANTE: ConcreteStrategy (GoF - Motivação)
 * 
 * ESTRATÉGIA 3: Agrupa as palavras na linha e, quando a palavra seguinte não cabe 
 * na largura, tenta justificar a linha distribuindo espaços entre as palavras 
 * para atingir exatamente a largura máxima configurada.
 */
public class JustifiedCompositor implements Compositor {

    @Override
    public List<String> compose(String text, int width) {
        List<String> lines = new ArrayList<>();
        if (text == null || text.trim().isEmpty() || width <= 0) {
            return lines;
        }

        String[] words = text.trim().split("\\s+");
        List<String> currentWords = new ArrayList<>();
        int currentWordsLen = 0;

        for (String word : words) {
            int minNeeded = currentWordsLen + word.length() + currentWords.size();

            if (minNeeded <= width) {
                currentWords.add(word);
                currentWordsLen += word.length();
            } else {
                lines.add(justify(currentWords, width));
                currentWords.clear();
                currentWords.add(word);
                currentWordsLen = word.length();
            }
        }

        if (!currentWords.isEmpty()) {
            lines.add(String.join(" ", currentWords));
        }

        return lines;
    }


    private String justify(List<String> words, int width) {
        if (words.isEmpty()) {
            return "";
        }
        if (words.size() == 1) {
            return words.get(0);
        }

        int totalChars = 0;
        for (String w : words) {
            totalChars += w.length();
        }

        int totalSpaces = width - totalChars;
        int gaps = words.size() - 1;

        if (totalSpaces < gaps)
            return String.join(" ", words);

        int baseSpaces = totalSpaces / gaps;
        int extraSpaces = totalSpaces % gaps;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.size(); i++) {
            sb.append(words.get(i));
            if (i < gaps) {
                int spacesToApply = baseSpaces + (i < extraSpaces ? 1 : 0);
                sb.append(" ".repeat(spacesToApply));
            }
        }

        return sb.toString();
    }
}
