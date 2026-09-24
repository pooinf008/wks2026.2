package br.edu.ifba.inf011.criacional.prototype.implementacao.variacao2;

/**
 * PARTICIPANTE: Prototype (GoF)
 * Declara a interface com a operação de clonagem (clone).
 */
public interface Prototype extends Cloneable {

    /**
     * Operação de clonagem profunda (Deep Copy).
     */
    Prototype clone();

    /**
     * Exibe o estado interno do objeto e de seus componentes.
     */
    void execute();
}
