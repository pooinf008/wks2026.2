package br.edu.ifba.inf011.criacional.prototype.implementacao.variacao1;

/**
 * PARTICIPANTE: Client (GoF)
 * Demonstra o uso do Gerenciador de Protótipos (PrototypeManager - GoF Implementação Variação 1).
 * O cliente interage com o gerenciador para registrar, buscar e clonar protótipos via chave.
 */
public class Client {

    public void runDemo() {
        System.out.println("=== Padrão GoF: Prototype (Implementação Variação 1 - Gerenciador de Protótipos) ===\n");

        // 1. Instanciando o PrototypeManager
        PrototypeManager manager = new PrototypeManager();

        // 2. Registrando protótipos dinamicamente
        System.out.println("--- 1. Registrando Protótipos no PrototypeManager ---");
        manager.registerPrototype("protoA", new ConcretePrototype1("Protótipo Modelo A"));
        manager.registerPrototype("protoB", new ConcretePrototype2(500));

        // 3. Solicitando clones ao Gerenciador através das chaves
        System.out.println("\n--- 2. Solicitando Clones ao Gerenciador por Chave ---");
        Prototype clone1 = manager.getPrototype("protoA");
        if (clone1 != null) clone1.execute();

        Prototype clone2 = manager.getPrototype("protoA");
        if (clone2 != null) clone2.execute();

        Prototype clone3 = manager.getPrototype("protoB");
        if (clone3 != null) clone3.execute();

        // 4. Verificação de instâncias distintas no heap
        System.out.println("\n--- 3. Verificação de Identidade das Instâncias ---");
        System.out.println("clone1 == clone2? " + (clone1 == clone2) + " (Instâncias distintas geradas pelo Gerenciador!)");

        // 5. Substituição dinâmica de um protótipo registrado
        System.out.println("\n--- 4. Atualização Dinâmica de Protótipo ---");
        manager.registerPrototype("protoA", new ConcretePrototype1("Protótipo Modelo A Atualizado"));
        Prototype clone4 = manager.getPrototype("protoA");
        if (clone4 != null) clone4.execute();

        // 6. Removendo um protótipo do registro
        System.out.println("\n--- 5. Remoção de Protótipo e Busca Inexistente ---");
        manager.unregisterPrototype("protoB");
        manager.getPrototype("protoB");
    }

    public static void main(String[] args) {
        new Client().runDemo();
    }
}
