package br.edu.ifba.inf011.estrutural.adapter.estrutura.object;

/**
 * PARTICIPANTE: Client (GoF)
 * Colabora com objetos compatíveis com a interface Target.
 */
public class Client {

    private final Target target;

    public Client(Target target) {
        this.target = target;
    }

    public void run() {
        target.request();
    }

    public static void main(String[] args) {
        System.out.println("=== Padrão GoF: Adapter (Estrutura - Adapter de Objeto) ===");
        new Client(new Adapter(new Adaptee())).run();
    }
}
