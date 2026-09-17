package br.edu.ifba.inf011.criacional.fm.estrutura;

/**
 * Classe principal para execução e teste do padrão Factory Method (GoF - Estrutura Genérica).
 */
public class Client {

    public void run() {
        System.out.println("=== Padrão GoF: Factory Method (Estrutura Genérica) ===");
        Creator creator = new ConcreteCreator();
        creator.anOperation();
    }

    public static void main(String[] args) {
        new Client().run();
    }
}
