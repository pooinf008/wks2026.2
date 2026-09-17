package br.edu.ifba.inf011.criacional.fm.implementacao.variacao1;

/**
 * PARTICIPANTE: ConcreteCreator (GoF - Subclasse Especializada)
 * Opcionalmente sobrescreve a implementação padrão do Factory Method para criar um CustomProduct.
 */
public class CustomCreator extends Creator {

    @Override
    public Product factoryMethod() {
        System.out.println("CustomCreator: Sobrescrevendo o Factory Method para retornar produto customizado.");
        return new CustomProduct();
    }
}
