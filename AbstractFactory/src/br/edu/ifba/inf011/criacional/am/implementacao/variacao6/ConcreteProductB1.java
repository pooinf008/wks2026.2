package br.edu.ifba.inf011.criacional.am.implementacao.variacao6;

/**
 * PARTICIPANTE: ConcreteProduct B1 (GoF)
 */
public class ConcreteProductB1 implements AbstractProductB {

    public ConcreteProductB1() {
        System.out.println("ConcreteProductB1: Instanciado (Família 1).");
    }

    @Override
    public void executeB() {
        System.out.println("ConcreteProductB1: Executando operação de Product B1.");
    }
}
