package br.edu.ifba.inf011.criacional.am.estrutura;

/**
 * PARTICIPANTE: ConcreteProduct A1 (GoF)
 * Implementação do produto A para a variante/família 1.
 */
public class ConcreteProductA1 implements AbstractProductA {

    public ConcreteProductA1() {
        System.out.println("ConcreteProductA1: Instanciado (Família 1).");
    }

    @Override
    public void executeA() {
        System.out.println("ConcreteProductA1: Executando operação de Product A1.");
    }
}
