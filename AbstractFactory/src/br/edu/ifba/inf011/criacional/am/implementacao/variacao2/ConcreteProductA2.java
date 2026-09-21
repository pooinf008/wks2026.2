package br.edu.ifba.inf011.criacional.am.implementacao.variacao2;

/**
 * PARTICIPANTE: ConcreteProduct A2 (GoF)
 */
public class ConcreteProductA2 implements AbstractProductA {

    public ConcreteProductA2() {
        System.out.println("ConcreteProductA2: Protótipo A2 inicializado.");
    }

    @Override
    public void executeA() {
        System.out.println("ConcreteProductA2: Executando operação de Product A2.");
    }

    @Override
    public AbstractProductA clone() {
    	return new ConcreteProductA2();
    }
}
