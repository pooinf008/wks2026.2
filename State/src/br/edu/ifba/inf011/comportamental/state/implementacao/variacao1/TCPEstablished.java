package br.edu.ifba.inf011.comportamental.state.implementacao.variacao1;

/**
 * IMPLEMENTAÇÃO: Uma alternativa baseada no uso de tabelas (GoF)
 * 
 * Estado Estabelecido (Established).
 * Encapsula o comportamento quando o canal TCP está aberto e transmitindo.
 */
public class TCPEstablished implements TCPState {

    public static final TCPEstablished INSTANCE = new TCPEstablished();

    @Override
    public String getName() {
        return "Established";
    }

    @Override
    public void process(TCPConnection connection, TCPInput input) {
        System.out.println("  [Estado Established] Processando evento: " + input);
    }

    @Override
    public String toString() {
        return getName();
    }
}
