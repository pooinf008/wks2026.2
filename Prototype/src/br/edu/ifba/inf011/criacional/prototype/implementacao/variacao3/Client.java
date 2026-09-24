package br.edu.ifba.inf011.criacional.prototype.implementacao.variacao3;

/**
 * PARTICIPANTE: Client (GoF)
 * Demonstra a variação de implementação 3 do GoF: "Iniciar clones (Inicialização com método initialize)".
 * O cliente clona a instância base e em seguida invoca initialize(parâmetros) para parametrizar
 * o estado do objeto recém-criado sem poluir a assinatura do método clone().
 */
public class Client {

    public void runDemo() {
        System.out.println("=== Padrão GoF: Prototype (Implementação Variação 3 - Método Initialize) ===\n");

        // 1. Criando instâncias de protótipos modelo com estado base
        Prototype proto1 = new ConcretePrototype1("Protótipo Base 1", 0, "Premium");
        Prototype proto2 = new ConcretePrototype2("Protótipo Base 2", 0, "Rascunho");

        System.out.println("--- 1. Protótipos Modelo Base ---");
        proto1.execute();
        proto2.execute();

        // 2. Clonando protótipo 1 e executando o método initialize() com novos parâmetros
        System.out.println("\n--- 2. Clonando e Inicializando Clone 1 com Parâmetros do Cliente ---");
        Prototype clone1 = proto1.clone();
        System.out.println("[Antes da inicialização]");
        clone1.execute();

        // Invocando o método initialize() para customizar o clone recém-criado
        clone1.initialize("Instância Personalizada A", 150);
        System.out.println("[Após inicialização]");
        clone1.execute();

        // 3. Clonando protótipo 2 e inicializando com outros parâmetros
        System.out.println("\n--- 3. Clonando e Inicializando Clone 2 ---");
        Prototype clone2 = proto2.clone();
        clone2.initialize("Instância Personalizada B", 300);
        clone2.execute();

        // 4. Verificação de que o protótipo original permaneceu intacto
        System.out.println("\n--- 4. Estado do Protótipo Original (Inalterado) ---");
        proto1.execute();
    }

    public static void main(String[] args) {
        new Client().runDemo();
    }
}
