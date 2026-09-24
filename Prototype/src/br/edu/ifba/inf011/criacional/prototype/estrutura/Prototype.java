package br.edu.ifba.inf011.criacional.prototype.estrutura;

/**
 * PARTICIPANTE: Prototype (GoF)
 * Declara uma interface genérica para clonagem de si mesmo.
 */
public interface Prototype extends Cloneable {

    /**
     * Operação principal do padrão Prototype: clona a si mesmo.
     */
    Prototype clone();

    /**
     * Operação genérica de execução para demonstração do objeto.
     */
    void execute();
}
