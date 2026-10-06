package br.edu.ifba.inf011.criacional.builder.motivacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Padrão GoF Builder: Produto 3 (TextWidget)
 * 
 * Representa um objeto complexo de interface com o usuário (UI Widget)
 * composto por parágrafos e trechos de texto estilizados editáveis.
 */
public class TextWidget {

    public static class TextElement {
        private final String text;
        private final Font font;

        public TextElement(String text, Font font) {
            this.text = text;
            this.font = font;
        }

        public String getText() {
            return text;
        }

        public Font getFont() {
            return font;
        }

        @Override
        public String toString() {
            return "[" + (font != null ? font.getName() : "Standard") + "] \"" + text + "\"";
        }
    }

    private final List<List<TextElement>> paragraphs = new ArrayList<>();

    public void addParagraph(List<TextElement> elements) {
        paragraphs.add(new ArrayList<>(elements));
    }

    public List<List<TextElement>> getParagraphs() {
        return Collections.unmodifiableList(paragraphs);
    }

    public String renderUI() {
        StringBuilder sb = new StringBuilder();
        sb.append("<TextWidget UI Component>\n");
        int count = 1;
        for (List<TextElement> paragraph : paragraphs) {
            sb.append("  [Parágrafo ").append(count++).append("]:\n");
            for (TextElement elem : paragraph) {
                sb.append("    - Render: ").append(elem).append("\n");
            }
        }
        sb.append("</TextWidget UI Component>");
        return sb.toString();
    }

    @Override
    public String toString() {
        return renderUI();
    }
}
