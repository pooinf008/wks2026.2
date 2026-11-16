package br.edu.ifba.inf011.comportamental.state.implementacao.variacao1;

import br.edu.ifba.inf011.comportamental.state.implementacao.variacao1.transition.Table;

/**
 * IMPLEMENTAÇÃO: Uma alternativa baseada no uso de tabelas (GoF)
 * 
 * Contexto da conexão TCP. Utiliza uma TransitionTable orientada a dados
 * para determinar as transições entre estados, substituindo comandos condicionais
 * (switch/if) por consultas regulares à tabela.
 */
public class TCPConnection {

    private TCPState state;
    private Table transitionTable;

    public TCPConnection(TCPState initialState, Table transitionTable) {
        this.state = initialState != null ? initialState : new TCPClosed();
        this.transitionTable = transitionTable;
    }

    public TCPConnection() {
        this(new TCPClosed(), null);
        this.transitionTable = this.createDefaultTCPTable();
    }

    public void handleInput(TCPInput input) {
        System.out.println("\n--- Evento: [" + input + "] | Estado Atual: [" + this.state.getName() + "] ---");
        boolean transitioned = this.transitionTable.execute(this, input);
        if (transitioned)
            this.state.process(this, input);
    }

    public void activeOpen() {
        this.handleInput(TCPInput.ACTIVE_OPEN);
    }

    public void passiveOpen() {
    	this.handleInput(TCPInput.PASSIVE_OPEN);
    }

    public void close() {
    	this.handleInput(TCPInput.CLOSE);
    }

    public void acknowledge() {
    	this.handleInput(TCPInput.ACKNOWLEDGE);
    }

    public void send(String data) {
        System.out.println("[Tentativa de envio: \"" + data + "\"]");
        this.handleInput(TCPInput.SEND);
    }

    public TCPState getState() {
        return state;
    }

    public void setState(TCPState state) {
        this.state = state;
    }

    public Table getTransitionTable() {
        return this.transitionTable;
    }

    public void setTransitionTable(Table transitionTable) {
        this.transitionTable = transitionTable;
    }

    public void status() {
        System.out.println("Status da Conexão: " + this.state.getName());
    }
    
    public Table createDefaultTCPTable() {
        
    	Table table = new Table();
        TCPState closed = new TCPClosed();
        TCPState listen = new TCPListen();
        TCPState established = new TCPEstablished();


        // 1. No estado CLOSED:
        table.addTransition(closed, TCPInput.ACTIVE_OPEN, established,
            (conn, in) -> System.out.println("  [Ação] Enviando pacote SYN e estabelecendo conexão..."));
        table.addTransition(closed, TCPInput.PASSIVE_OPEN, listen,
            (conn, in) -> System.out.println("  [Ação] Abrindo porta local para aguardar conexões remotas..."));
        

        // 2. No estado LISTEN:
        table.addTransition(listen, TCPInput.ACTIVE_OPEN, established,
            (conn, in) -> System.out.println("  [Ação] Conexão recebida e confirmada (SYN-ACK). Estabelecida."));
        table.addTransition(listen, TCPInput.CLOSE, closed,
            (conn, in) -> System.out.println("  [Ação] Encerrando escuta da porta. Conexão fechada."));

        // 3. No estado ESTABLISHED:
        table.addTransition(established, TCPInput.CLOSE, closed,
            (conn, in) -> System.out.println("  [Ação] Enviando pacote FIN e encerrando transmissão..."));
        table.addTransition(established, TCPInput.ACKNOWLEDGE, established,
            (conn, in) -> System.out.println("  [Ação] Confirmação ACK processada com sucesso."));
        table.addTransition(established, TCPInput.SEND, established,
            (conn, in) -> System.out.println("  [Ação] Transmitindo bloco de dados pelo canal..."));

        return table;
    }    
    
}
