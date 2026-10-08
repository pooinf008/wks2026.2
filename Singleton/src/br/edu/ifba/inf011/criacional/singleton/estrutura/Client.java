package br.edu.ifba.inf011.criacional.singleton.estrutura;

/**
 * PARTICIPANTE: Client (GoF)
 * 
 * O cliente acessa a única instância do Singleton exclusivamente
 * através da chamada ao método estático Singleton.getInstance().
 */
public class Client {

    public void run() {
        System.out.println("=== Padrão GoF: Singleton (Estrutura Genérica) ===\n");

        System.out.println("--- 1. Solicitando Singleton.getInstance() pela primeira vez (s1) ---");
        Singleton s1 = Singleton.getInstance();
        s1.singletonOperation();

        System.out.println("\n--- 2. Alterando o estado interno do Singleton através de s1 ---");
        s1.setSingletonData("Novo Estado Configurado por s1");
        System.out.println("Estado alterado com sucesso!");

        System.out.println("\n--- 3. Solicitando Singleton.getInstance() pela segunda vez (s2) ---");
        Singleton s2 = Singleton.getInstance();
        s2.singletonOperation();

        System.out.println("\n--- 4. Verificação de Identidade dos Objetos ---");
        System.out.println("s1 == s2? " + (s1 == s2) + " (Apontam para o MESMO objeto na memória!)");
        System.out.println("Código Hash de s1: " + System.identityHashCode(s1));
        System.out.println("Código Hash de s2: " + System.identityHashCode(s2));
    }

    public static void main(String[] args) {
        new Client().run();
    }
}
