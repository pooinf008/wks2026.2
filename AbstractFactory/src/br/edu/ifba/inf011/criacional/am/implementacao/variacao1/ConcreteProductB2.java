package br.edu.ifba.inf011.criacional.am.implementacao.variacao1;

/**
 * PARTICIPANTE: ConcreteProduct B2 (GoF)
 */
public class ConcreteProductB2 implements AbstractProductB {

    public ConcreteProductB2() {
        System.out.println("ConcreteProductB2: Instanciado (Família 2).");
    }

    @Override
    public void executeB() {
        System.out.println("ConcreteProductB2: Executando operação de Product B2.");
    }
}
