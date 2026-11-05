package br.edu.ifba.inf011.estrutural.bridge.estrutura;

/**
 * PARTICIPANTE: ConcreteImplementor (GoF)
 * Implementa a interface Implementor e define sua implementação concreta específica (Variante B).
 */
public class ConcreteImplementorB implements Implementor {

    @Override
    public void operationImp() {
        System.out.println("ConcreteImplementorB: executando operationImp()");
    }
}
