package br.edu.ifba.inf011.comportamental.strategy.motivacao;

import java.util.ArrayList;
import java.util.List;

/**
 * PARTICIPANTE: ConcreteStrategy (GoF - Motivação)
 * 
 * ESTRATÉGIA 2: Só coloca palavras inteiras se couberem na largura da linha (word-wrap).
 * Caso uma palavra não caiba na linha atual com o espaçamento, quebra para a próxima linha.
 */
public class WordBreakCompositor implements Compositor {

    @Override
    public List<String> compose(String text, int width) {
        List<String> lines = new ArrayList<>();
        if (text == null || text.trim().isEmpty() || width <= 0) {
            return lines;
        }

        String[] words = text.trim().split("\\s+");
        StringBuilder currentLine = new StringBuilder();

        for (String word : words) {
            if (currentLine.length() == 0) {
                currentLine.append(word);
            } else if (currentLine.length() + 1 + word.length() <= width) {
                currentLine.append(" ").append(word);
            } else {
                lines.add(currentLine.toString());
                currentLine = new StringBuilder(word);
            }
        }

        if (currentLine.length() > 0) {
            lines.add(currentLine.toString());
        }

        return lines;
    }
}
