package br.edu.ifba.inf011.estrutural.adapter.motivacao;

/**
 * PARTICIPANTE: Adaptee (GoF)
 * Classe pronta de um toolkit de terceiros para exibição/edição de texto.
 * Possui interface INCOMPATÍVEL com Shape (origem + extensão, em vez de bounding box)
 * e não pode ser modificada.
 */
public class TextView {

    private final Point origin;
    private final int width;
    private final int height;
    private final String content;

    public TextView(Point origin, int width, int height, String content) {
        this.origin = origin;
        this.width = width;
        this.height = height;
        this.content = content;
    }

    public Point getOrigin() { return origin; }

    /** Retorna largura (x) e altura (y) do texto. */
    public Point getExtent() { return new Point(width, height); }

    public boolean isEmpty() { return content == null || content.isEmpty(); }

    public String getContent() { return content; }
}
