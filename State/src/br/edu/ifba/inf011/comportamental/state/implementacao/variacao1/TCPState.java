package br.edu.ifba.inf011.comportamental.state.implementacao.variacao1;

/**
 * IMPLEMENTAÇÃO: Uma alternativa baseada no uso de tabelas (GoF)
 * 
 * Interface que representa um estado da conexão TCP.
 * Na abordagem baseada em tabelas descrita por Blandy e Pressman no GoF,
 * a decisão de transição entre estados é terceirizada para a TransitionTable,
 * permitindo que a definição do fluxo de estados seja totalmente orientada a dados.
 */
public interface TCPState {

    /**
     * Retorna o nome amigável/identificador do estado.
     * 
     * @return nome do estado
     */
    String getName();

    /**
     * Executa o comportamento específico correspondente ao estado após
     * o processamento da transição.
     * 
     * @param connection o contexto da conexão
     * @param input o evento/entrada processado
     */
    void process(TCPConnection connection, TCPInput input);
}
