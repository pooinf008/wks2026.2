package br.edu.ifba.inf011.comportamental.state.motivacao;

/**
 * PARTICIPANTE: ConcreteState (GoF - Motivação)
 * 
 * Implementa o comportamento específico correspondente ao estado de Escuta (Listening).
 * Neste estado, a conexão aguarda solicitações remotas de conexão.
 * Ao receber uma solicitação ou aceitar a conexão, transiciona para Established.
 * Se fechada, retorna para o estado Closed.
 */
public class TCPListen extends TCPState {


    public TCPListen() {
    }

    @Override
    public void open(TCPConnection connection) {
        System.out.println("[TCPListen] Conexão remota recebida e aceita (SYN-ACK). Conectado.");
        changeState(connection, new TCPEstablished());
    }

    @Override
    public void close(TCPConnection connection) {
        System.out.println("[TCPListen] Encerrando escuta da porta. Conexão fechada.");
        changeState(connection, new TCPClosed());
    }

    @Override
    public void acknowledge(TCPConnection connection) {
        System.out.println("[TCPListen] Recebido pacote durante escuta. Estabelecendo conexão...");
        changeState(connection, new TCPEstablished());
    }

    @Override
    public void send(TCPConnection connection, String data) {
        System.out.println("[TCPListen] Enviando pacote de sincronização (\"" + data + "\") e estabelecendo canal.");
        changeState(connection, new TCPEstablished());
    }

    @Override
    public String getName() {
        return "Listening";
    }
}
