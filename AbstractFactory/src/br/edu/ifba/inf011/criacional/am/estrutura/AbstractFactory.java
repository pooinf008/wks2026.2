package br.edu.ifba.inf011.criacional.am.estrutura;

/**
 * PARTICIPANTE: AbstractFactory (GoF)
 * Declara a interface com métodos de fabricação para cada tipo de produto abstrato.
 */
public interface AbstractFactory {
    public AbstractProductA createProductA();
    public AbstractProductB createProductB();
}
