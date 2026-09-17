package br.edu.ifba.inf011.criacional.fm.implementacao.variacao3;

/**
 * Executável para teste e demonstração da armadilha de linguagem (GoF - Implementação: Variedade 3).
 * Invocar métodos polimórficos no construtor em Java.
 */
public class Client {

    public void run() {
        System.out.println("=== Padrão GoF: Factory Method (Armadilha em Java: Métodos Polimórficos em Construtores) ===");

        try {
            System.out.println("\nTentando instanciar ConcreteCreator...");
            Creator creator = new ConcreteCreator();
        } catch (NullPointerException e) {
            System.err.println("\n------------------------------------------------------------------------");
            System.err.println("CAPTURADO NULLPOINTEREXCEPTION!");
            System.err.println("Causa do erro: O construtor de Creator chamou factoryMethod() antes da");
            System.err.println("inicialização dos campos de ConcreteCreator.");
            System.err.println("------------------------------------------------------------------------");
        }
    }

    public static void main(String[] args) {
        new Client().run();
    }
}
