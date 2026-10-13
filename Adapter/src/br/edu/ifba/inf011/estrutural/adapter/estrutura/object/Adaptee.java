package br.edu.ifba.inf011.estrutural.adapter.estrutura.object;

/**
 * PARTICIPANTE: Adaptee (GoF)
 * Define uma interface existente que precisa ser adaptada.
 */
public class Adaptee {
    public void specificRequest() {
        System.out.println("Adaptee: executando specificRequest()");
    }
}
