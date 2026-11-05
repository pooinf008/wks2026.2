package br.edu.ifba.inf011.estrutural.bridge.estrutura;

/**
 * PARTICIPANTE: ConcreteImplementor (GoF)
 * Implementa a interface Implementor e define sua implementação concreta específica (Variante A).
 */
public class ConcreteImplementorA implements Implementor {

    @Override
    public void operationImp() {
        System.out.println("ConcreteImplementorA: executando operationImp()");
    }
}
