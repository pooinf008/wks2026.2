package br.edu.ifba.inf011.criacional.am.implementacao.variacao2;

/**
 * PARTICIPANTE: Client (GoF)
 * Teste e demonstração da Abstract Factory parametrizada por Protótipos.
 */
public class Client {

    private AbstractFactory factory;

    public void setFactory(AbstractFactory factory) {
        this.factory = factory;
    }

    public void runScenario() {
        System.out.println("Client: Solicitando criação de produtos à fábrica baseada em Protótipos...");
        AbstractProductA productA = factory.createProductA();
        AbstractProductB productB = factory.createProductB();

        productA.executeA();
        productB.executeB();
    }

    public void run() {
        System.out.println("=== Padrão GoF: Abstract Factory (Implementação - Fábricas Parametrizadas por Protótipos) ===");

        // 1. Configurando a fábrica com os protótipos da Família 1 (ConcreteProductA1 + ConcreteProductB1)
        System.out.println("\n--- 1. Inicializando PrototypeFactory com protótipos da Família 1 ---");
        this.setFactory(new PrototypeFactory(new ConcreteProductA1(), new ConcreteProductB1()));
        this.runScenario();

        // 2. Configurando a fábrica com os protótipos da Família 2 (ConcreteProductA2 + ConcreteProductB2)
        System.out.println("\n--- 2. Inicializando PrototypeFactory com protótipos da Família 2 ---");
        this.setFactory(new PrototypeFactory(new ConcreteProductA2(), new ConcreteProductB2()));
        this.runScenario();

        // 3. Vantagem: Combinação flexível (Mix-and-Match) sem criar novas subclasses de fábrica!
        System.out.println("\n--- 3. Criando uma família personalizada (Mix: A1 + B2) sem subclasse de fábrica ---");
        this.setFactory(new PrototypeFactory(new ConcreteProductA1(), new ConcreteProductB2()));
        this.runScenario();
    }

    public static void main(String[] args) {
        new Client().run();
    }
}
