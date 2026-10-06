package br.edu.ifba.inf011.criacional.builder.motivacao;

/**
 * Padrão GoF Builder: Produto 1 (ASCIIText)
 * 
 * Representa um documento em formato de texto ASCII puro, sem elementos de formatação.
 */
public class ASCIIText {
    private final String content;

    public ASCIIText(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return content;
    }
}
