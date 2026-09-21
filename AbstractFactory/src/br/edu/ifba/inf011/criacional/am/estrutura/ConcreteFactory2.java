package br.edu.ifba.inf011.criacional.am.estrutura;

/**
 * PARTICIPANTE: ConcreteFactory 2 (GoF)
 * Constrói os produtos concretos pertencentes à Família/Variante 2.
 */
public class ConcreteFactory2 implements AbstractFactory {

    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB2();
    }
}
