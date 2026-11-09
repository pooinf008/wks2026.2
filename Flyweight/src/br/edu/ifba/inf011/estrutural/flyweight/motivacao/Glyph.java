package br.edu.ifba.inf011.estrutural.flyweight.motivacao;

/**
 * PARTICIPANTE: Flyweight (GoF)
 * Classe/Interface base abstrata para todos os elementos gráficos do documento
 * (caracteres individuais, linhas, colunas, páginas).
 * 
 * Declara a operação draw(Window, GlyphContext), recebendo a janela de desenho
 * e o contexto extrínseco (GlyphContext) em tempo de execução.
 */
public interface Glyph {

    public void draw(int x, int y);

    public default void add(Glyph glyph) {
        throw new UnsupportedOperationException("Operação add não suportada para este glifo folha.");
    }

}
