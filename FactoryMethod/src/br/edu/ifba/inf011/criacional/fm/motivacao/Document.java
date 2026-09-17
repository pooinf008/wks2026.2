package br.edu.ifba.inf011.criacional.fm.motivacao;

/**
 * PARTICIPANTE: Product (GoF)
 * Define a interface comum para os objetos criados pelo Factory Method.
 */
public interface Document {
    void open();
    void close();
    void save();
    void revert();
}
