package br.edu.ifba.inf011.estrutural.composite.motivacao;

/**
 * PARTICIPANTE: Leaf (GoF)
 * Primitiva gráfica que representa um retângulo com posição e dimensões.
 * Por ser uma primitiva gráfica, não possui componentes filhos.
 */
public class Rectangle implements Graphic {

    private final int x;
    private final int y;
    private final int width;
    private final int height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
        this(0, 0, 50, 30);
    }

    @Override
    public void draw() {
        System.out.println("Rectangle: desenhando retângulo em (" + this.x + ", " + this.y + ") com dimensões " + this.width + "x" + this.height);
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }
}
