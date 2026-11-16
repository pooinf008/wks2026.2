package br.edu.ifba.inf011.comportamental.state.estrutura;

/**
 * PARTICIPANTE: Context (GoF - Estrutura)
 * 
 * Responsabilidades conforme o GoF:
 * - Define a interface de interesse para os clientes.
 * - Mantém uma referência para uma instância de ConcreteState que define o estado corrente.
 * - Implementa a operação canônica request() delegando a solicitação para state.handle().
 * - Permite a configuração e transição do objeto State.
 */
public class Context {

    private State state;

    public Context(State state) {
        this.state = state;
    }

    public Context() {
        this(new ConcreteStateA());
    }

    /**
     * Operação canônica do GoF: Request()
     * Delega a solicitação dependente de estado para o objeto State corrente:
     * state.handle(this)
     */
    public void request() {
        if (this.state != null) {
            this.state.handle(this);
        } else {
            System.out.println("Context: nenhum estado configurado.");
        }
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    /**
     * Método auxiliar de mudança de estado conforme a terminologia do GoF (changeState).
     * 
     * @param state o novo estado
     */
    public void changeState(State state) {
        setState(state);
    }
}
