package br.edu.ifba.inf011.comportamental.state.motivacao;

/**
 * PARTICIPANTE: ConcreteState (GoF - Motivação)
 * 
 * Implementa o comportamento específico correspondente ao estado Estabelecido (Established).
 * Neste estado, a conexão está plenamente ativa para transmissão de dados e confirmações (ACK).
 * Uma solicitação de fechamento (close) envia terminação (FIN) e transiciona para Closed.
 */
public class TCPEstablished extends TCPState {

    public TCPEstablished() {
    }

    @Override
    public void open(TCPConnection connection) {
        System.out.println("[TCPEstablished] A conexão já está aberta e estabelecida.");
    }

    @Override
    public void close(TCPConnection connection) {
        System.out.println("[TCPEstablished] Enviando pacote FIN e encerrando conexão...");
        this.changeState(connection, new TCPClosed());
    }

    @Override
    public void acknowledge(TCPConnection connection) {
        System.out.println("[TCPEstablished] Confirmação (ACK) processada com sucesso no fluxo TCP.");
    }

    @Override
    public void send(TCPConnection connection, String data) {
        System.out.println("[TCPEstablished] Transmitindo dados: \"" + data + "\"");
    }

    @Override
    public String getName() {
        return "Established";
    }
}
