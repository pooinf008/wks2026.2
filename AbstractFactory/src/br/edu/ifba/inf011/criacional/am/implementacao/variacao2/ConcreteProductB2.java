package br.edu.ifba.inf011.criacional.am.implementacao.variacao2;

/**
 * PARTICIPANTE: ConcreteProduct B2 (GoF)
 */
public class ConcreteProductB2 implements AbstractProductB {

    public ConcreteProductB2() {
        System.out.println("ConcreteProductB2: Protótipo B2 inicializado.");
    }

    @Override
    public void executeB() {
        System.out.println("ConcreteProductB2: Executando operação de Product B2.");
    }

    @Override
    public AbstractProductB clone() {
    	return new ConcreteProductB2();
    }
}
