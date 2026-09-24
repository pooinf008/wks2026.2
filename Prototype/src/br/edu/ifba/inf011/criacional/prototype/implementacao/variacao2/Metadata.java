package br.edu.ifba.inf011.criacional.prototype.implementacao.variacao2;

/**
 * Objeto interno referenciado para demonstração da Cópia Profunda (Deep Copy).
 */
public class Metadata implements Cloneable {

    private String author;
    private String version;

    public Metadata(String author, String version) {
        this.author = author;
        this.version = version;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public Metadata clone() {
        try {
            return (Metadata) super.clone();
        } catch (CloneNotSupportedException e) {
            return new Metadata(this.author, this.version);
        }
    }

    @Override
    public String toString() {
        return "[Autor: '" + author + "', Versão: '" + version + "'] (Hash: #" 
                + Integer.toHexString(System.identityHashCode(this)) + ")";
    }
}
