package br.edu.ifba.inf011.criacional.fm.implementacao.variacao1;

/**
 * PARTICIPANTE: ConcreteProduct (Customizado) (GoF)
 * Produto customizado instanciado pelas subclasses especializadas do Creator.
 */
public class CustomProduct implements Product {

    public CustomProduct() {
        System.out.println("CustomProduct: Produto Customizado/Especializado criado.");
    }

    @Override
    public void execute() {
        System.out.println("CustomProduct: Executando comportamento customizado.");
    }
}
