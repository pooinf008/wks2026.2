package br.edu.ifba.inf011.criacional.am.estrutura;

/**
 * PARTICIPANTE: Client (GoF)
 * Consome os produtos de uma família utilizando estritamente as abstrações.
 */
public class Client {

    private AbstractFactory factory;

    public void setFactory(AbstractFactory factory) {
        this.factory = factory;
    }

    public void runScenario() {
        System.out.println("Client: Solicitando criação de produtos à fábrica...");
        AbstractProductA productA = this.factory.createProductA();
        AbstractProductB productB = this.factory.createProductB();

        productA.executeA();
        productB.executeB();
    }

    public void run() {
        System.out.println("=== Padrão GoF: Abstract Factory (Estrutura Genérica) ===");

        // 1. Execução utilizando a ConcreteFactory1
        System.out.println("\n--- 1. Executando com ConcreteFactory1 ---");
        this.setFactory(new ConcreteFactory1());
        this.runScenario();

        // 2. Execução utilizando a ConcreteFactory2
        System.out.println("\n--- 2. Executando com ConcreteFactory2 ---");
        this.setFactory(new ConcreteFactory2());
        this.runScenario();
    }

    public static void main(String[] args) {
        new Client().run();
    }
}
