package br.edu.ifba.inf011.estrutural.flyweight.estrutura;

/**
 * PARTICIPANTE: Flyweight (GoF)
 * Declara uma interface através da qual os flyweights podem receber
 * e atuar sobre o estado extrínseco (extrinsicState).
 */
public interface Flyweight {
    public void operation(String extrinsicState);
}
