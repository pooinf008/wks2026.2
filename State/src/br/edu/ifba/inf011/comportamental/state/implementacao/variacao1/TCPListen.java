package br.edu.ifba.inf011.comportamental.state.implementacao.variacao1;

/**
 * IMPLEMENTAÇÃO: Uma alternativa baseada no uso de tabelas (GoF)
 * 
 * Estado de Escuta (Listening).
 * Encapsula o comportamento quando o servidor aguarda conexões.
 */
public class TCPListen implements TCPState {

    @Override
    public String getName() {
        return "Listening";
    }

    @Override
    public void process(TCPConnection connection, TCPInput input) {
        System.out.println("  [Estado Listening] Processando evento: " + input);
    }

    @Override
    public String toString() {
        return getName();
    }
}
