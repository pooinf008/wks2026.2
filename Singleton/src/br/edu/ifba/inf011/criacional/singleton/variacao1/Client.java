package br.edu.ifba.inf011.criacional.singleton.variacao1;

/**
 * PARTICIPANTE: Client (GoF)
 * 
 * Demonstra o uso da técnica de "Criando subclasses da classe Singleton" utilizando
 * o Registro de Singletons (Registry of Singletons) descrito na seção Implementação da GoF.
 */
public class Client {

    public void run() {
        System.out.println("=== Padrão GoF: Singleton - Variação 1 (Subclasses e Registro) ===\n");

        try {
            Class.forName("br.edu.ifba.inf011.criacional.singleton.variacao1.MySingleton");
            Class.forName("br.edu.ifba.inf011.criacional.singleton.variacao1.SpecialSingleton");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("--- 1. Recuperando subclasses registradas por nome ---");
        Singleton s1 = Singleton.getInstance("MySingleton");
        System.out.print("Recuperado s1 (" + s1 + "): ");
        s1.operation();

        Singleton s2 = Singleton.getInstance("SpecialSingleton");
        System.out.print("Recuperado s2 (" + s2 + "): ");
        s2.operation();

        System.out.println("\n--- 2. Verificação de instância única da subclasse ---");
        Singleton s1Again = Singleton.getInstance("MySingleton");
        System.out.println("s1 == s1Again? " + (s1 == s1Again) + " (Mesma instância de MySingleton!)");

        System.out.println("\n--- 3. Seleção de subclasse por configuração de ambiente ---");
        System.setProperty("SINGLETON_TYPE", "SpecialSingleton");
        Singleton.setInstance(null);

        Singleton activeSingleton = Singleton.getInstance();
        System.out.print("Instância ativa configurada (" + activeSingleton + "): ");
        activeSingleton.operation();
    }

    public static void main(String[] args) {
        new Client().run();
    }
}
