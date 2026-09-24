package br.edu.ifba.inf011.criacional.prototype.motivacao;

/**
 * Representa as coordenadas de posicionamento de um elemento gráfico na partitura.
 */
public class Position implements Cloneable {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public Position clone() {
        try {
            return (Position) super.clone();
        } catch (CloneNotSupportedException e) {
            return new Position(this.x, this.y);
        }
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
