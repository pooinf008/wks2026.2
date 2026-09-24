package br.edu.ifba.inf011.criacional.prototype.implementacao.variacao1;

/**
 * PARTICIPANTE: Prototype (GoF)
 * Declara uma interface genérica para clonagem de objetos protótipo.
 */
public interface Prototype extends Cloneable {

    /**
     * Operação principal do padrão Prototype: clona a si mesmo.
     */
    Prototype clone();

    /**
     * Operação de exibição de dados do protótipo.
     */
    void execute();
}
