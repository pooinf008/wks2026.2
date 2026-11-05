package br.edu.ifba.inf011.estrutural.bridge.estrutura;

/**
 * PARTICIPANTE: Client (GoF)
 * Manipula objetos através da interface de Abstraction.
 * Demonstra como a hierarquia de Abstraction e a de Implementor podem variar
 * e ser combinadas de forma totalmente independente.
 */
public class Client {

    public void run() {
        System.out.println("=== Padrão GoF: Bridge (Estrutura) ===\n");

        Implementor impA = new ConcreteImplementorA();
        Implementor impB = new ConcreteImplementorB();

        System.out.println("-- 1. Abstraction com ConcreteImplementorA:");
        Abstraction abstraction1 = new Abstraction(impA);
        abstraction1.operation();

        System.out.println("\n-- 2. Abstraction com ConcreteImplementorB:");
        Abstraction abstraction2 = new Abstraction(impB);
        abstraction2.operation();

        System.out.println("\n-- 3. RefinedAbstraction com ConcreteImplementorA:");
        RefinedAbstraction refinedA = new RefinedAbstraction(impA);
        refinedA.operation();
        refinedA.otherOperation();

        System.out.println("\n-- 4. RefinedAbstraction com ConcreteImplementorB:");
        RefinedAbstraction refinedB = new RefinedAbstraction(impB);
        refinedB.operation();
        refinedB.otherOperation();
    }

    public static void main(String[] args) {
        new Client().run();
    }
}
