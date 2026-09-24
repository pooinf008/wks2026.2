package br.edu.ifba.inf011.criacional.prototype.motivacao;

/**
 * PARTICIPANTE: ConcretePrototype (GoF)
 * Representa a pauta musical (conjunto de linhas horizontais) no editor de partituras.
 */
public class Staff implements Graphic {

    private Position position;
    private int numLines;

    public Staff() {
        this.numLines = 5;
        this.position = new Position(0, 0);
    }

    public Staff(int numLines, Position position) {
        this.numLines = numLines;
        this.position = position != null ? position.clone() : new Position(0, 0);
    }

    @Override
    public Graphic clone() {
        // Realiza cópia do protótipo Staff
        return new Staff(this.numLines, this.position);
    }

    @Override
    public String draw() {
        return "Staff (Pauta de " + numLines + " linhas) na posição " + this.position;
    }

    @Override
    public void setPosition(Position position) {
        this.position = position != null ? position.clone() : new Position(0, 0);
    }

    @Override
    public Position getPosition() {
        return this.position;
    }
}
