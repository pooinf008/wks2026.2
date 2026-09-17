package br.edu.ifba.inf011.criacional.fm.motivacao;

/**
 * Classe principal para execução e teste do padrão Factory Method (GoF - Motivação).
 */
public class Client {


    public void run(){
        System.out.println("=== Padrão GoF: Factory Method (Motivação) ===");
        Application app = new MyApplication();
        app.newDocument();
    }        

    public static void main(String[] args) {
        new Client().run();
    }

}
