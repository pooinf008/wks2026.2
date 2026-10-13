package br.edu.ifba.inf011.estrutural.adapter.estrutura.object;

/**
 * PARTICIPANTE: Adapter (GoF) - Adaptador de OBJETO
 * Implementa Target e COMPÕE um Adaptee, delegando a ele as requisições.
 * Pode adaptar o Adaptee e qualquer uma de suas subclasses.
 */
public class Adapter implements Target {

    private final Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        System.out.println("Adapter (objeto): traduzindo request() -> adaptee.specificRequest()");
        adaptee.specificRequest();
    }
}
