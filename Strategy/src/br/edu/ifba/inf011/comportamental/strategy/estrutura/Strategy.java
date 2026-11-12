package br.edu.ifba.inf011.comportamental.strategy.estrutura;

/**
 * PARTICIPANTE: Strategy (GoF - Estrutura)
 * 
 * Declara uma interface comum para todos os algoritmos suportados.
 * O Context usa esta interface para chamar o algoritmo definido por um ConcreteStrategy.
 */
public interface Strategy {

    /**
     * Operação canônica do GoF: AlgorithmInterface()
     * Executa a lógica encapsulada da estratégia.
     */
    void algorithmInterface(Integer contador);
}
