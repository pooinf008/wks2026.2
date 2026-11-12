package br.edu.ifba.inf011.comportamental.strategy.estrutura;

/**
 * PARTICIPANTE: Client (GoF - Estrutura)
 * 
 * Conforme o GoF:
 * "O Client cria e passa um objeto ConcreteStrategy para o Context; 
 * a partir de então, os clientes interagem exclusivamente com o Context."
 * 
 * Demonstra a instanciação do Context, o polimorfismo das estratégias e
 * a troca dinâmica de algoritmos em tempo de execução sem acoplamento.
 */
public class Client {

    public void run() {
        System.out.println("==========================================================");
        System.out.println("=== Padrão GoF: Strategy (Estrutura Canônica) ===========");
        System.out.println("==========================================================\n");

        // 1. Configurando Context com ConcreteStrategyA
        System.out.println("-- 1. Context configurado com ConcreteStrategyA:");
        Context context = new Context(new ConcreteStrategyA());
        context.contextInterface();

        // 2. Trocando dinamicamente para ConcreteStrategyB
        System.out.println("\n-- 2. Trocando em tempo de execução para ConcreteStrategyB:");
        context.setStrategy(new ConcreteStrategyB());
        context.contextInterface();

        // 3. Trocando dinamicamente para ConcreteStrategyC
        System.out.println("\n-- 3. Trocando em tempo de execução para ConcreteStrategyC:");
        context.setStrategy(new ConcreteStrategyC());
        context.contextInterface();
    }

    public static void main(String[] args) {
        new Client().run();
    }
}
