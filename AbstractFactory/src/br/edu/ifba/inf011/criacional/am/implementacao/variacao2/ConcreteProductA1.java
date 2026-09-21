package br.edu.ifba.inf011.criacional.am.implementacao.variacao2;

/**
 * PARTICIPANTE: ConcreteProduct A1 (GoF)
 */
public class ConcreteProductA1 implements AbstractProductA {

    public ConcreteProductA1() {
        System.out.println("ConcreteProductA1: Protótipo A1 inicializado.");
    }

    @Override
    public void executeA() {
        System.out.println("ConcreteProductA1: Executando operação de Product A1.");
    }

    @Override
    public AbstractProductA clone() {
    	return new ConcreteProductA1();
    }
}
