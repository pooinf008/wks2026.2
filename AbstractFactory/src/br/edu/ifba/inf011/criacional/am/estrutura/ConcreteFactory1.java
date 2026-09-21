package br.edu.ifba.inf011.criacional.am.estrutura;

/**
 * PARTICIPANTE: ConcreteFactory 1 (GoF)
 * Constrói os produtos concretos pertencentes à Família/Variante 1.
 */
public class ConcreteFactory1 implements AbstractFactory {

    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB1();
    }
}
