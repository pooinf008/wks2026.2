package br.edu.ifba.inf011.estrutural.composite.motivacao;

/**
 * PARTICIPANTE: Leaf (GoF)
 * Primitiva gráfica que representa um texto a ser exibido no editor.
 * Por ser uma primitiva gráfica, não possui componentes filhos.
 */
public class Text implements Graphic {

    private final String content;
    private final int x;
    private final int y;

    public Text(String content, int x, int y) {
        this.content = content;
        this.x = x;
        this.y = y;
    }

    public Text(String content) {
        this(content, 0, 0);
    }

    @Override
    public void draw() {
        System.out.println("Text: desenhando texto \"" + this.content + "\" na posição (" + this.x + ", " + this.y + ")");
    }

    public String getContent() {
        return this.content;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}
