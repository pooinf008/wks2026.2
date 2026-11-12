package br.edu.ifba.inf011.comportamental.strategy.estrutura;

/**
 * PARTICIPANTE: ConcreteStrategy (GoF - Estrutura)
 * 
 * Implementa o algoritmo usando a interface Strategy (Variante C).
 */
public class ConcreteStrategyC implements Strategy {

    @Override
    public void algorithmInterface(Integer contador) {
        System.out.println("Executando ConcreteStrategyC.algorithmInterface(): Algoritmo variante C. " + contador);
    }
}
