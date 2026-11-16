package br.edu.ifba.inf011.comportamental.state.estrutura;

/**
 * PARTICIPANTE: ConcreteState (GoF - Estrutura)
 * 
 * Implementa o comportamento associado a um determinado estado do Context (Estado B).
 * Executa a operação específica e pode transicionar o contexto para o próximo estado (ex: ConcreteStateA).
 */
public class ConcreteStateB implements State {

    @Override
    public void handle(Context context) {
        System.out.println("Executando ConcreteStateB.handle(): processando requisição no Estado B.");
        if (context != null)
            context.setState(new ConcreteStateA());
    }

    @Override
    public String toString() {
        return "ConcreteStateB";
    }
}
