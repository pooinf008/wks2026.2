package br.edu.ifba.inf011.criacional.fm.implementacao.variacao3;

/**
 * PARTICIPANTE: ConcreteProduct (GoF)
 * Produto concreto que recebe o tipo no construtor.
 */
public class ConcreteProduct implements Product {


    public ConcreteProduct() {
        System.out.println("ConcreteProduct: Instanciado...");
    }

    @Override
    public void usar() {
        System.out.println("ConcreteProduct: Executando ...");
    }
}
