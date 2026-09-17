package br.edu.ifba.inf011.criacional.fm.implementacao.variacao1;

/**
 * Executável para teste da Variedade 2 da Implementação do Factory Method (GoF):
 * Creator Concreto com implementação padrão do Factory Method.
 */
public class Client {

    public void run() {
        System.out.println("=== Padrão GoF: Factory Method (Implementação - Caso 2: Implementação Padrão) ===");
        Creator defaultCreator = new Creator();
        defaultCreator.anOperation();

        Creator customCreator = new CustomCreator();
        customCreator.anOperation();
    }

    public static void main(String[] args) {
        new Client().run();
    }
}
