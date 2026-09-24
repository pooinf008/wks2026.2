package br.edu.ifba.inf011.criacional.prototype.estrutura;

/**
 * PARTICIPANTE: Client (GoF)
 * Cria um novo objeto solicitando a um protótipo que clone a si mesmo.
 */
public class Client {

    private Prototype prototype;

    public Client() {
    }

    public Client(Prototype prototype) {
        this.prototype = prototype;
    }

    public void setPrototype(Prototype prototype) {
        this.prototype = prototype;
    }

    public Prototype getPrototype() {
        return prototype;
    }

    /**
     * Operação do cliente que clona o protótipo configurado.
     */
    public Prototype operation() {
        if (prototype == null) {
            System.out.println("Client: Nenhum protótipo configurado.");
            return null;
        }

        System.out.println("Client: Solicitando clonagem ao protótipo " + prototype.getClass().getSimpleName() + "...");
        Prototype clone = prototype.clone();
        clone.execute();
        return clone;
    }

    public void runDemo() {
        System.out.println("=== Padrão GoF: Prototype (Estrutura Genérica) ===\n");

        // 1. Instanciando protótipos concretos originais
        Prototype proto1 = new ConcretePrototype1("Protótipo Alfa");
        Prototype proto2 = new ConcretePrototype2(100);

        System.out.println("--- Instâncias Protótipo Originais ---");
        proto1.execute();
        proto2.execute();

        // 2. Client clonando protótipo 1
        System.out.println("\n--- 1. Clonagem de ConcretePrototype1 ---");
        this.setPrototype(proto1);
        Prototype clone1 = this.operation();

        // 3. Client clonando protótipo 2
        System.out.println("\n--- 2. Clonagem de ConcretePrototype2 ---");
        this.setPrototype(proto2);
        Prototype clone2 = this.operation();

        // 4. Verificação das referências de memória
        System.out.println("\n--- Verificação de Identidade dos Objetos ---");
        System.out.println("proto1 == clone1? " + (proto1 == clone1) + " (Instâncias distintas!)");
        System.out.println("proto2 == clone2? " + (proto2 == clone2) + " (Instâncias distintas!)");
    }

    public static void main(String[] args) {
        new Client().runDemo();
    }
}
