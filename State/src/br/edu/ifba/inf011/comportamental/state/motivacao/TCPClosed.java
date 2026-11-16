package br.edu.ifba.inf011.comportamental.state.motivacao;

/**
 * PARTICIPANTE: ConcreteState (GoF - Motivação)
 * 
 * Implementa o comportamento específico correspondente ao estado Fechado (Closed).
 * Neste estado, a conexão não está ativa. Uma chamada a open() ou activeOpen()
 * inicia o handshake e altera o estado para Established (ou passiveOpen() para Listening).
 */
public class TCPClosed extends TCPState {

    public TCPClosed() {
    }

    @Override
    public void open(TCPConnection connection) {
    	this.activeOpen(connection);
    }

    @Override
    public void activeOpen(TCPConnection connection) {
        System.out.println("[TCPClosed] Executando Active Open: enviando SYN para o host remoto...");
        System.out.println("[TCPClosed] Conexão estabelecida com sucesso.");
        this.changeState(connection, new TCPEstablished());
    }

    @Override
    public void passiveOpen(TCPConnection connection) {
        System.out.println("[TCPClosed] Executando Passive Open: aguardando conexões remotas...");
        this.changeState(connection, new TCPListen());
    }

    @Override
    public void close(TCPConnection connection) {
        System.out.println("[TCPClosed] A conexão já se encontra fechada.");
    }

    @Override
    public void acknowledge(TCPConnection connection) {
        System.out.println("\t\t[TCPClosed] Erro: não é possível processar acknowledge em uma conexão fechada.");
    }

    @Override
    public void send(TCPConnection connection, String data) {
        System.out.println("\t\t[TCPClosed] Erro: impossível enviar dados (\"" + data + "\"). A conexão está fechada.");
    }

    @Override
    public String getName() {
        return "Closed";
    }
}
