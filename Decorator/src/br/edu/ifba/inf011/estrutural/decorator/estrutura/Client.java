package br.edu.ifba.inf011.estrutural.decorator.estrutura;

/**
 * PARTICIPANTE: Client
 * Conhece apenas Component; decoradores são transparentes para ele.
 */
public class Client {

    public void run() {
        System.out.println("=== Padrão GoF: Decorator (Estrutura) ===\n");

        Component component = new ConcreteDecoratorB(
                                  new ConcreteDecoratorA(
                                      new ConcreteComponent()));
        component.operation();
    }

    public static void main(String[] args) {
        new Client().run();
    }
}
