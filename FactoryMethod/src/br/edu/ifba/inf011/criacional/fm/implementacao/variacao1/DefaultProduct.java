package br.edu.ifba.inf011.criacional.fm.implementacao.variacao1;

/**
 * PARTICIPANTE: ConcreteProduct (Default) (GoF)
 * Produto padrão instanciado pela implementação padrão do Creator.
 */
public class DefaultProduct implements Product {

    public DefaultProduct() {
        System.out.println("DefaultProduct: Produto Padrão criado.");
    }

    @Override
    public void execute() {
        System.out.println("DefaultProduct: Executando comportamento padrão.");
    }
}
