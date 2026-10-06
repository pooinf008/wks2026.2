package br.edu.ifba.inf011.criacional.builder.motivacao;

import java.util.ArrayList;
import java.util.List;

/**
 * Padrão GoF Builder: Construtor Concreto 3 (TextWidgetConverter)
 * 
 * Converte tokens RTF em uma estrutura complexa de objetos visuais (TextWidget),
 * permitindo edição e renderização em interface gráfica.
 */
public class TextWidgetConverter extends TextConverter {
    private final TextWidget widget = new TextWidget();
    private final List<TextWidget.TextElement> currentParagraph = new ArrayList<>();
    private final StringBuilder currentTextRun = new StringBuilder();
    private Font currentFont = new Font("Standard", 12, false);

    @Override
    public void convertCharacter(char c) {
        currentTextRun.append(c);
    }

    @Override
    public void convertFontChange(Font font) {
        flushCurrentRun();
        this.currentFont = font;
    }

    @Override
    public void convertParagraph() {
        flushCurrentRun();
        if (!currentParagraph.isEmpty()) {
            widget.addParagraph(currentParagraph);
            currentParagraph.clear();
        }
    }

    private void flushCurrentRun() {
        if (currentTextRun.length() > 0) {
            currentParagraph.add(new TextWidget.TextElement(currentTextRun.toString(), currentFont));
            currentTextRun.setLength(0);
        }
    }

    /**
     * Retorna o componente gráfico TextWidget montado durante a conversão.
     */
    public TextWidget getTextWidget() {
        flushCurrentRun();
        if (!currentParagraph.isEmpty()) {
            widget.addParagraph(currentParagraph);
            currentParagraph.clear();
        }
        return widget;
    }
}
