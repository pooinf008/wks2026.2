package br.edu.ifba.inf011.criacional.builder.motivacao;

/**
 * Representa informações de fonte/estilo de caractere no leitor de documentos RTF.
 */
public class Font {
    private final String name;
    private final int size;
    private final boolean bold;

    public Font(String name, int size, boolean bold) {
        this.name = name;
        this.size = size;
        this.bold = bold;
    }

    public Font(String name) {
        this(name, 12, false);
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public boolean isBold() {
        return bold;
    }

    @Override
    public String toString() {
        return name + " (" + size + "pt" + (bold ? ", negrito" : "") + ")";
    }
}
