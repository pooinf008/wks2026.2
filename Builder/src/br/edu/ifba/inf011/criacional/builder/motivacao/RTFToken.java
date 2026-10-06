package br.edu.ifba.inf011.criacional.builder.motivacao;

/**
 * Representa um token individual extraído de um documento RTF durante a leitura pelo RTFReader.
 */
public class RTFToken {
    private final TokenType type;
    private final Character character;
    private final Font font;

    public RTFToken(char character) {
        this.type = TokenType.CHAR;
        this.character = character;
        this.font = null;
    }

    public RTFToken(Font font) {
        this.type = TokenType.FONT_CHANGE;
        this.character = null;
        this.font = font;
    }

    public RTFToken(TokenType type) {
        this.type = type;
        this.character = null;
        this.font = null;
    }

    public TokenType getType() {
        return type;
    }

    public Character getCharacter() {
        return character;
    }

    public Font getFont() {
        return font;
    }
}
