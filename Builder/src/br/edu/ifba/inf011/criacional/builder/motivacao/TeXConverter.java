package br.edu.ifba.inf011.criacional.builder.motivacao;

/**
 * Padrão GoF Builder: Construtor Concreto 2 (TeXConverter)
 * 
 * Converte caracteres, alterações de fonte e quebras de parágrafo em marcações no formato TeX.
 */
public class TeXConverter extends TextConverter {
    private final StringBuilder texBuffer = new StringBuilder();

    @Override
    public void convertCharacter(char c) {
        texBuffer.append(c);
    }

    @Override
    public void convertFontChange(Font font) {
        texBuffer.append("\\font{")
                 .append(font.getName())
                 .append(":")
                 .append(font.getSize())
                 .append("pt")
                 .append(font.isBold() ? ":bold" : "")
                 .append("}");
    }

    @Override
    public void convertParagraph() {
        texBuffer.append("\\par\n");
    }

    /**
     * Retorna o produto resultante em formato de documento TeXText.
     */
    public TeXText getTeXText() {
        return new TeXText(texBuffer.toString());
    }
}
