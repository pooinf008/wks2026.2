package br.edu.ifba.inf011.criacional.prototype.motivacao;

/**
 * PARTICIPANTE: ConcretePrototype (GoF)
 * Representa uma nota musical (ex: Mínima, Semínima, Colcheia) no editor de partituras.
 */
public class MusicalNote implements Graphic {

    private String noteType; // Ex: "Semínima", "Mínima", "Semibreve"
    private String pitch;    // Ex: "Dó", "Ré", "Mi"
    private Position position;

    public MusicalNote(String noteType, String pitch) {
        this.noteType = noteType;
        this.pitch = pitch;
        this.position = new Position(0, 0);
    }

    public MusicalNote(String noteType, String pitch, Position position) {
        this.noteType = noteType;
        this.pitch = pitch;
        this.position = position != null ? position.clone() : new Position(0, 0);
    }

    @Override
    public Graphic clone() {
        // Clona a nota musical protótipo
        return new MusicalNote(this.noteType, this.pitch, this.position);
    }

    @Override
    public String draw() {
        return "MusicalNote [" + noteType + " - Tom: " + pitch + "] na posição " + this.position;
    }

    @Override
    public void setPosition(Position position) {
        this.position = position != null ? position.clone() : new Position(0, 0);
    }

    @Override
    public Position getPosition() {
        return this.position;
    }

    public String getNoteType() {
        return noteType;
    }

    public String getPitch() {
        return pitch;
    }
}
