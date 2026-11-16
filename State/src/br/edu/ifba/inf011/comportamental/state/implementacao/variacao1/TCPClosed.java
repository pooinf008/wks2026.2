package br.edu.ifba.inf011.comportamental.state.implementacao.variacao1;

/**
 * IMPLEMENTAÇÃO: Uma alternativa baseada no uso de tabelas (GoF)
 * 
 * Estado Fechado (Closed).
 * Não contém lógica acoplada de transição para outros estados;
 * a determinação do próximo estado ao receber eventos como ACTIVE_OPEN
 * ou PASSIVE_OPEN é de inteira responsabilidade da TransitionTable.
 */
public class TCPClosed implements TCPState {

    public static final TCPClosed INSTANCE = new TCPClosed();

    @Override
    public String getName() {
        return "Closed";
    }

    @Override
    public void process(TCPConnection connection, TCPInput input) {
        System.out.println("  [Estado Closed] Processando evento: " + input);
    }

    @Override
    public String toString() {
        return getName();
    }
}
