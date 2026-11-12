package br.edu.ifba.inf011.comportamental.strategy.estrutura;

/**
 * PARTICIPANTE: ConcreteStrategy (GoF - Estrutura)
 * 
 * Implementa o algoritmo usando a interface Strategy (Variante B).
 */
public class ConcreteStrategyB implements Strategy {

    @Override
    public void algorithmInterface(Integer contador) {
        System.out.println("Executando ConcreteStrategyB.algorithmInterface(): Algoritmo variante B. " + contador);
    }
}
