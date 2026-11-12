package br.edu.ifba.inf011.comportamental.strategy.motivacao;

import java.util.ArrayList;
import java.util.List;

/**
 * PARTICIPANTE: ConcreteStrategy (GoF - Motivação)
 * 
 * Alias para a Estratégia 1: Quebra o texto na largura, mesmo dividindo palavras.
 */
public class HardBreakCompositor implements Compositor {
	
    @Override
    public List<String> compose(String text, int width) {
        List<String> lines = new ArrayList<>();
        if (text == null || text.isEmpty() || width <= 0) {
            return lines;
        }

        int length = text.length();
        for (int i = 0; i < length; i += width) {
            int end = Math.min(i + width, length);
            lines.add(text.substring(i, end));
        }

        return lines;
    }
}
