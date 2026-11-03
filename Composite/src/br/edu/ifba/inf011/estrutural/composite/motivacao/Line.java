package br.edu.ifba.inf011.estrutural.composite.motivacao;

/**
 * PARTICIPANTE: Leaf (GoF)
 * Primitiva gráfica que representa uma linha desenhada entre dois pontos.
 * Por ser uma primitiva gráfica, não possui componentes filhos.
 */
public class Line implements Graphic {

    private final int x1;
    private final int y1;
    private final int x2;
    private final int y2;

    public Line(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Line() {
        this(0, 0, 10, 10);
    }

    @Override
    public void draw() {
        System.out.println("Line: desenhando linha de (" + this.x1 + ", " + this.y1 + ") até (" + this.x2 + ", " + this.y2 + ")");
    }

    public int getX1() {
        return this.x1;
    }

    public int getY1() {
        return this.y1;
    }

    public int getX2() {
        return this.x2;
    }

    public int getY2() {
        return this.y2;
    }
}
