package br.edu.ifba.inf011.estrutural.bridge.estrutura;

/**
 * PARTICIPANTE: Abstraction (GoF)
 * Define a interface da abstração e mantém uma referência para um objeto do tipo
 * Implementor (a ponte).
 * 
 * Implementa sua operação delegando as solicitações para o objeto Implementor:
 * imp.operationImp().
 */
public class Abstraction {

    protected final Implementor imp;

    public Abstraction(Implementor imp) {
        this.imp = imp;
    }

    public void operation() {
        System.out.print("Abstraction -> ");
        this.imp.operationImp();
    }

}
