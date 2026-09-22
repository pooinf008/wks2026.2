package br.edu.ifba.inf011.criacional.am.implementacao.variacao6;

/**
 * PARTICIPANTE: ConcreteProduct A1 (GoF)
 */
public class ConcreteProductA1 implements AbstractProductA, AbstractProduct {

    public ConcreteProductA1() {
        System.out.println("ConcreteProductA1: Instanciado (Família 1).");
    }

    @Override
    public void executeA() {
        System.out.println("ConcreteProductA1: Executando operação de Product A1.");
    }
}
