package br.edu.ifba.inf011.comportamental.strategy.estrutura;

/**
 * PARTICIPANTE: Context (GoF - Estrutura)
 * 
 * Responsabilidades conforme o GoF:
 * - É configurado com um objeto ConcreteStrategy.
 * - Mantém uma referência para um objeto Strategy.
 * - Pode definir uma interface que permite a Strategy acessar seus dados.
 * - Implementa a operação contextInterface() delegando para strategy.algorithmInterface().
 */
public class Context {

    private Strategy strategy;
    public Integer contador;

    public Context(Strategy strategy) {
        this.strategy = strategy;
        this.contador = 0;
    }

    /**
     * Operação canônica do GoF: ContextInterface()
     * Delega a solicitação para o algoritmo encapsulado no objeto Strategy atual.
     */
    public void contextInterface() {
        if (this.strategy == null)
        	System.out.println("Context: nenhuma estratégia configurada.");
        this.strategy.algorithmInterface(this.contador);
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
    	this.contador++;
        this.strategy = strategy;
    }
}
