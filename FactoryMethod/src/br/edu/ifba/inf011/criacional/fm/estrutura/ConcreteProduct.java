package br.edu.ifba.inf011.criacional.fm.estrutura;

/**
 * PARTICIPANTE: ConcreteProduct (GoF)
 * Implementação concreta da interface Product.
 */
public class ConcreteProduct implements Product {

    public ConcreteProduct() {
        System.out.println("ConcreteProduct: Instanciado com sucesso.");
    }

    @Override
    public void execute() {
        System.out.println("ConcreteProduct: Executando operação específica do Produto Concreto.");
    }
}
