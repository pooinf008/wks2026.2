package br.edu.ifba.inf011.comportamental.strategy.estrutura;

/**
 * PARTICIPANTE: ConcreteStrategy (GoF - Estrutura)
 * 
 * Implementa o algoritmo usando a interface Strategy (Variante A).
 */
public class ConcreteStrategyA implements Strategy {

    @Override
    public void algorithmInterface(Integer contador) {
        System.out.println("Executando ConcreteStrategyA.algorithmInterface(): Algoritmo variante A. " + contador);
    }
}
