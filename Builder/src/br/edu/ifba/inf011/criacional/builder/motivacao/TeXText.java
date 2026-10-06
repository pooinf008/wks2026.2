package br.edu.ifba.inf011.criacional.builder.motivacao;

/**
 * Padrão GoF Builder: Produto 2 (TeXText)
 * 
 * Representa um documento em sintaxe de marcação TeX.
 */
public class TeXText {
    private final String texCode;

    public TeXText(String texCode) {
        this.texCode = texCode;
    }

    public String getTexCode() {
        return texCode;
    }

    @Override
    public String toString() {
        return texCode;
    }
}
