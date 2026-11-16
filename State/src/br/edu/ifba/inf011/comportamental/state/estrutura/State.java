package br.edu.ifba.inf011.comportamental.state.estrutura;

/**
 * PARTICIPANTE: State (GoF - Estrutura)
 * 
 * Declara uma interface para encapsular o comportamento associado com
 * um determinado estado do Context.
 */
public interface State {
    /**
     * Operação canônica do GoF: Handle()
     * Executa o comportamento específico correspondente ao estado corrente.
     * 
     * @param context o contexto que permite ao estado acessar seus dados
     *                ou disparar transições para um próximo estado.
     */
    void handle(Context context);
}
