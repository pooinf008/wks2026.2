package br.edu.ifba.inf011.comportamental.state.estrutura;

/**
 * PARTICIPANTE: ConcreteState (GoF - Estrutura)
 * 
 * Implementa o comportamento associado a um determinado estado do Context (Estado A).
 * Executa a operação específica e pode transicionar o contexto para o próximo estado (ex: ConcreteStateB).
 */
public class ConcreteStateA implements State {

    @Override
    public void handle(Context context) {
        System.out.println("Executando ConcreteStateA.handle(): processando requisição no Estado A.");
        if (context != null)
        	context.setState(new ConcreteStateB());
    }

    @Override
    public String toString() {
        return "ConcreteStateA";
    }
}
