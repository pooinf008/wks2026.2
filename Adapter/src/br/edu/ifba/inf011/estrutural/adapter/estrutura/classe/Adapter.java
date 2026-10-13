package br.edu.ifba.inf011.estrutural.adapter.estrutura.classe;

/**
 * PARTICIPANTE: Adapter (GoF) - Adaptador de CLASSE
 * HERDA de Adaptee (herança de implementação) e implementa Target (herança de interface).
 * Adapta apenas a classe Adaptee concreta, mas pode sobrescrever seu comportamento.
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        System.out.println("Adapter (classe): traduzindo request() -> specificRequest() herdado");
        this.specificRequest();
    }
}
