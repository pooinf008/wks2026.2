package br.edu.ifba.inf011.criacional.fm.estrutura;

/**
 * PARTICIPANTE: ConcreteCreator (GoF)
 * Sobrescreve o método de fabricação (factoryMethod) para retornar uma instância de ConcreteProduct.
 */
public class ConcreteCreator extends Creator {

    @Override
    public Product factoryMethod() {
        return new ConcreteProduct();
    }
}
