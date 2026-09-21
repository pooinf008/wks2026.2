package br.edu.ifba.inf011.criacional.am.implementacao.variacao2;

/**
 * PARTICIPANTE: ConcreteProduct B1 (GoF)
 */
public class ConcreteProductB1 implements AbstractProductB {

    public ConcreteProductB1() {
        System.out.println("ConcreteProductB1: Protótipo B1 inicializado.");
    }

    @Override
    public void executeB() {
        System.out.println("ConcreteProductB1: Executando operação de Product B1.");
    }

    @Override
    public AbstractProductB clone() {
    	return new ConcreteProductB1();
    }
}
