package br.edu.ifba.inf011.comportamental.state.implementacao.variacao1;

/**
 * IMPLEMENTAÇÃO: Uma alternativa baseada no uso de tabelas (GoF)
 * 
 * Demonstra a variação do padrão State com transições orientadas a tabelas (Blandy e Pressman):
 * 1. Mapeamento regular de entradas para estados através de consultas à tabela.
 * 2. Bloqueio automático de entradas inválidas no estado corrente.
 * 3. Vantagem da regularidade: reconfiguração dinâmica da tabela em tempo de execução sem alterar o código.
 */
public class Client {

    public void run() {
        System.out.println("==========================================================================");
        System.out.println("=== Padrão State: Implementação - Alternativa Baseada em Tabelas (GoF) ==");
        System.out.println("==========================================================================\n");

        TCPConnection connection = new TCPConnection();
        connection.status();

        System.out.println("\n-- 1. Tentando enviar dados no estado Closed:");
        connection.send("Mensagem inicial");

        System.out.println("\n-- 2. Executando Active Open:");
        connection.activeOpen();
        connection.status();

        System.out.println("\n-- 3. Transmitindo dados e enviando confirmações (ACK):");
        connection.send("GET /index.html HTTP/1.1");
        connection.acknowledge();
        connection.status();

        System.out.println("\n-- 4. Fechando a conexão:");
        connection.close();
        connection.status();

        System.out.println("\n-- 5. Executando Passive Open para escuta de servidor:");
        connection.passiveOpen();
        connection.status();

        System.out.println("\n==========================================================================");
        System.out.println("=== Vantagem da Abordagem: Modificando Critérios na Tabela em Runtime =====");
        System.out.println("==========================================================================");

        System.out.println("\nAdicionando nova regra dinâmica à tabela: permitir 'Acknowledge' no estado Listening...");
        connection.getTransitionTable().addTransition(new TCPListen(),
        										      TCPInput.ACKNOWLEDGE,
        										      new TCPEstablished(),
        										      (conn, in) -> 
        												System.out.println("\t[Regra Dinâmica] Conexão forçada para Established via ACK externo!")
        );

        connection.acknowledge();
        connection.status();

    }

    public static void main(String[] args) {
        new Client().run();
    }
}
