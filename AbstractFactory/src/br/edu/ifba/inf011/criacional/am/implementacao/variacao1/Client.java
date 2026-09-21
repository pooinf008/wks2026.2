package br.edu.ifba.inf011.criacional.am.implementacao.variacao1;

/**
 * PARTICIPANTE: Client (GoF)
 * Consome a fábrica e os produtos. Obtém a instância da fábrica concreta através do Singleton (getInstance()).
 */
public class Client {

    public Client(){
        
    }

    public void run() {
        System.out.println("Client: Solicitando criação de produtos à fábrica...");
        AbstractProductA productA = ConcreteFactory1.getInstance().createProductA();
        AbstractProductB productB = ConcreteFactory1.getInstance().createProductB();
        productA.executeA();
        productB.executeB();
        
        
        System.out.println("Client: Solicitando criação de produtos à fábrica...");
        productA = ConcreteFactory2.getInstance().createProductA();
        productB = ConcreteFactory2.getInstance().createProductB();

        productA.executeA();
        productB.executeB();      
        
        
        System.out.println("Client: Solicitando criação de produtos à fábrica...");
        productA = ConcreteFactory1.getInstance().createProductA();
        productB = ConcreteFactory1.getInstance().createProductB();

        productA.executeA();
        productB.executeB();
        
        System.out.println("Client: Solicitando criação de produtos à fábrica...");
        productA = ConcreteFactory2.getInstance().createProductA();
        productB = ConcreteFactory2.getInstance().createProductB();

        productA.executeA();
        productB.executeB();          
        
        
    }    


//    public static void runDemo() {
//        System.out.println("=== Padrão GoF: Abstract Factory (Implementação - Fábricas como Singletons) ===");
//
//        // 1. Obtendo a instância Singleton da ConcreteFactory1
//        System.out.println("\n--- 1. Obtendo a instância de ConcreteFactory1.getInstance() ---");
//        AbstractFactory factory1 = ConcreteFactory1.getInstance();
//        Client client1 = new Client(factory1);
//        client1.runScenario();
//
//        // Verificando se nova chamada a getInstance() retorna a mesma instância do Singleton
//        boolean mesmaInstancia1 = (factory1 == ConcreteFactory1.getInstance());
//        System.out.println("Verificação de unicidade (ConcreteFactory1): " + mesmaInstancia1);
//
//        // 2. Obtendo a instância Singleton da ConcreteFactory2
//        System.out.println("\n--- 2. Obtendo a instância de ConcreteFactory2.getInstance() ---");
//        AbstractFactory factory2 = ConcreteFactory2.getInstance();
//        Client client2 = new Client(factory2);
//        client2.runScenario();
//
//        // Verificando unicidade
//        boolean mesmaInstancia2 = (factory2 == ConcreteFactory2.getInstance());
//        System.out.println("Verificação de unicidade (ConcreteFactory2): " + mesmaInstancia2);
//    }

    public static void main(String[] args) {
        new Client().run();
    }
}
