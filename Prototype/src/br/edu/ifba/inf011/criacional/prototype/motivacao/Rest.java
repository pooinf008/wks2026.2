package br.edu.ifba.inf011.criacional.prototype.motivacao;

/**
 * PARTICIPANTE: ConcretePrototype (GoF)
 * Representa uma pausa musical (silêncio) no editor de partituras.
 */
public class Rest implements Graphic {

    private String restType; // Ex: "Pausa de Semínima", "Pausa de Mínima"
    private Position position;

    public Rest(String restType) {
        this.restType = restType;
        this.position = new Position(0, 0);
    }

    public Rest(String restType, Position position) {
        this.restType = restType;
        this.position = position != null ? position.clone() : new Position(0, 0);
    }

    @Override
    public Graphic clone() {
        // Clona a pausa musical protótipo
        return new Rest(this.restType, this.position);
    }

    @Override
    public String draw() {
        return "Rest [" + restType + "] na posição " + this.position;
    }

    @Override
    public void setPosition(Position position) {
        this.position = position != null ? position.clone() : new Position(0, 0);
    }

    @Override
    public Position getPosition() {
        return this.position;
    }

    public String getRestType() {
        return restType;
    }
}
