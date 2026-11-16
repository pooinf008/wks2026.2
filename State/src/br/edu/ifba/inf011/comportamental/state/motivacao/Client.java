package br.edu.ifba.inf011.comportamental.state.motivacao;

/**
 * PARTICIPANTE: Client (GoF - Motivação)
 * 
 * Demonstra o uso da classe TCPConnection alternando comportamentos de acordo com o
 * estado atual (Closed, Established, Listening), exatamente como descrito na seção
 * de Motivação do padrão State no livro do GoF.
 */
public class Client {

    public void run() {
        System.out.println("==========================================================================");
        System.out.println("=== Padrão State: Seção Motivação (GoF) - Conexão de Rede TCP ==========");
        System.out.println("==========================================================================\n");

        // 1. Conexão inicia no estado Closed
        System.out.println("--- Cenário 1: Conexão Inicialmente Fechada (Closed) ---");
        TCPConnection connection = new TCPConnection();
        connection.status();

        System.out.println("\nTentando enviar dados no estado Closed:");
        connection.send("Olá, mundo!");

        System.out.println("\nTentando processar acknowledge no estado Closed:");
        connection.acknowledge();

        // 2. Transição Closed -> Established via open() / activeOpen()
        System.out.println("\n--- Cenário 2: Abrindo Conexão (Active Open -> Established) ---");
        connection.open();
        connection.status();

        System.out.println("\nTransmitindo dados na conexão Established:");
        connection.send("GET /index.html HTTP/1.1");

        System.out.println("\nProcessando confirmação (ACK) na conexão Established:");
        connection.acknowledge();

        System.out.println("\nTentando abrir novamente a conexão já estabelecida:");
        connection.open();

        // 3. Transição Established -> Closed via close()
        System.out.println("\n--- Cenário 3: Fechando a Conexão (Established -> Closed) ---");
        connection.close();
        connection.status();

        // 4. Transição Closed -> Listening via passiveOpen()
        System.out.println("\n--- Cenário 4: Abertura Passiva para Servidor (Closed -> Listening) ---");
        connection.passiveOpen();
        connection.status();

        System.out.println("\nRecebendo requisição no estado Listening (Listening -> Established):");
        connection.open();
        connection.status();

        System.out.println("\nEncerrando conexão final:");
        connection.close();
        connection.status();

    }

    public static void main(String[] args) {
        new Client().run();
    }
}
