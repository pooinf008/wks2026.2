package br.edu.ifba.inf011.comportamental.state.implementacao.variacao1;

/**
 * IMPLEMENTAÇÃO: Uma alternativa baseada no uso de tabelas (GoF)
 * 
 * Aborda uma das principais desvantagens apontadas pelo GoF na abordagem por tabelas:
 * "É usualmente difícil adicionar ações a serem executadas durante uma transição de estado."
 * Esta interface funcional permite associar uma computação/efeito colateral a ser disparado
 * no momento exato da transição orientada a dados.
 */
@FunctionalInterface
public interface TransitionAction {
    public void execute(TCPConnection connection, TCPInput input);
}
