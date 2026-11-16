package br.edu.ifba.inf011.comportamental.state.motivacao;

/**
 * PARTICIPANTE: Context (GoF - Motivação)
 * 
 * Representa a conexão de rede TCP. Mantém uma referência para uma instância de
 * uma subclasse de TCPState que representa o estado corrente da conexão.
 * Delega todas as solicitações dependentes de estado ao objeto de estado atual.
 */
public class TCPConnection {

    private TCPState state;

    public TCPConnection(TCPState initialState) {
        this.state = (initialState != null) ? initialState : new TCPClosed();
    }

    public TCPConnection() {
        this(new TCPClosed());
    }

    public void open() {
        this.state.open(this);
    }

    public void activeOpen() {
        this.state.activeOpen(this);
    }

    public void passiveOpen() {
        this.state.passiveOpen(this);
    }

    public void close() {
        this.state.close(this);
    }

    public void acknowledge() {
        this.state.acknowledge(this);
    }

    public void send(String data) {
        this.state.send(this, data);
    }

    protected void changeState(TCPState state) {
        System.out.println(">>> Transição de Estado: [" + this.state + "] -> [" + state + "]");
        this.state = state;
    }

    public TCPState getState() {
        return this.state;
    }

    public void status() {
        System.out.println("Status da Conexão: " + this.state.getName());
    }
}
