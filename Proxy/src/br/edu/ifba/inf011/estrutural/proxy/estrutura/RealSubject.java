package br.edu.ifba.inf011.estrutural.proxy.estrutura;

/**
 * PARTICIPANTE: RealSubject (GoF)
 * Define o objeto real que o proxy representa.
 */
public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("RealSubject: atendendo request()");
    }
}
