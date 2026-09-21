package br.edu.ifba.inf011.criacional.am.estrutura;

/**
 * PARTICIPANTE: ConcreteProduct B2 (GoF)
 * Implementação do produto B para a variante/família 2.
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
