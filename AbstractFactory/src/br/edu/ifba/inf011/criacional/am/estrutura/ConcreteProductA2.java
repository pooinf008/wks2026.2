package br.edu.ifba.inf011.criacional.am.estrutura;

/**
 * PARTICIPANTE: ConcreteProduct A2 (GoF)
 * Implementação do produto A para a variante/família 2.
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
