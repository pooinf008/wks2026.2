package br.edu.ifba.inf011.criacional.am.implementacao.variacao6;

/**
 * PARTICIPANTE: ConcreteProduct A2 (GoF)
 */
public class ConcreteProductA2 implements AbstractProductA {

    public ConcreteProductA2() {
        System.out.println("ConcreteProductA2: Instanciado (Família 2).");
    }

    @Override
    public void executeA() {
        System.out.println("ConcreteProductA2: Executando operação de Product A2.");
    }
}
