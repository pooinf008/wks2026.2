package br.edu.ifba.inf011.estrutural.proxy.estrutura;

/**
 * PARTICIPANTE: Client (GoF)
 * Conhece apenas Subject; usa o Proxy de forma transparente.
 */
public class Client {

    private final Subject subject;

    public Client(Subject subject) {
        this.subject = subject;
    }

    public void run() {
        System.out.println("=== Padrão GoF: Proxy (Estrutura) ===\n");
        subject.request();
        subject.request();
    }

    public static void main(String[] args) {
        new Client(new Proxy()).run();
    }
}
