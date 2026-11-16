package br.edu.ifba.inf011.comportamental.state.motivacao;

/**
 * PARTICIPANTE: State (GoF - Motivação)
 * 
 * Classe abstrata que declara a interface comum para todos os estados que
 * representam as diferentes fases operacionais de uma conexão de rede (TCPConnection).
 * Fornece implementações padrão para as operações, permitindo que subclasses
 * sobrescrevam apenas os comportamentos válidos para cada estado.
 */
public abstract class TCPState {

    protected void changeState(TCPConnection connection, TCPState state) {
        connection.changeState(state);
    }

    public void open(TCPConnection connection) {
        System.out.println("[TCPState] Operação open() sem efeito no estado: " + getName());
    }

    public void activeOpen(TCPConnection connection) {
        this.open(connection);
    }

    public void passiveOpen(TCPConnection connection) {
        System.out.println("[TCPState] Operação passiveOpen() sem efeito no estado: " + getName());
    }

    public void close(TCPConnection connection) {
        System.out.println("[TCPState] Operação close() sem efeito no estado: " + getName());
    }

    public void acknowledge(TCPConnection connection) {
        System.out.println("[TCPState] Operação acknowledge() sem efeito no estado: " + getName());
    }

    public void send(TCPConnection connection, String data) {
        System.out.println("[TCPState] Operação send() não permitida no estado: " + getName());
    }

    public abstract String getName();

    @Override
    public String toString() {
        return this.getName();
    }
}
