package br.edu.ifba.inf011.criacional.builder.motivacao;

import java.util.List;

/**
 * Padrão GoF Builder: Diretor (Director) - RTFReader
 * 
 * Responsável pela análise estrutural (parsing) de um documento RTF.
 * O RTFReader independe da representação final do documento criado (ASCII, TeX, TextWidget).
 * Conforme lê os tokens do documento RTF, ele efetua chamadas para o TextConverter (Builder)
 * configurado, delegando a este a criação e montagem do formato de saída.
 */
public class RTFReader {
    
    private TextConverter builder;

    public RTFReader(TextConverter builder) {
        this.builder = builder;
    }

    public void setConverter(TextConverter builder) {
        this.builder = builder;
    }

    /**
     * Realiza o parse da lista de tokens RTF, notificando o Builder conforme cada token é encontrado.
     */
    public void parseRTF(List<RTFToken> tokens) {
        if (builder == null) {
            throw new IllegalStateException("TextConverter (Builder) não foi configurado no RTFReader.");
        }

        for (RTFToken token : tokens) {
            switch (token.getType()) {
                case CHAR:
                    builder.convertCharacter(token.getCharacter());
                    break;
                case FONT_CHANGE:
                    builder.convertFontChange(token.getFont());
                    break;
                case PARAGRAPH:
                    builder.convertParagraph();
                    break;
            }
        }
    }
}
