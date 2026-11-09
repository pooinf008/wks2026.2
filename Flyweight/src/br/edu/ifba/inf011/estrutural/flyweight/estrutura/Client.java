package br.edu.ifba.inf011.estrutural.flyweight.estrutura;

/**
 * PARTICIPANTE: Client (GoF)
 * Mantém uma referência para flyweights.
 * Calcula ou armazena o estado extrínseco (extrinsicState) dos flyweights.
 * Obtém objetos ConcreteFlyweight exclusivamente a partir da FlyweightFactory.
 */
public class Client {
	
	private FlyweightFactory factory;
	
	public Client() {
		this.factory = new FlyweightFactory();
	}
	
	
    public void run() {
        System.out.println("=== Padrão GoF: Flyweight (Estrutura) ===\n");
        Flyweight flyweightA1 = factory.getFlyweight("Intrinseco_A");
        Flyweight flyweightA2 = factory.getFlyweight("Intrinseco_A");
        Flyweight flyweightB  = factory.getFlyweight("Intrinseco_B");
        UnsharedConcreteFlyweight unshared = new UnsharedConcreteFlyweight("UNSHARED");
        

        System.out.println("Verificação de compartilhamento de instâncias:");
        System.out.println("flyweightA1 == flyweightA2: " + (flyweightA1 == flyweightA2));
        System.out.println("flyweightA1 == flyweightB: " + (flyweightA1 == flyweightB));
        System.out.println("Total de instâncias compartilhadas na fábrica: " + factory.getFlyweightCount() + "\n");


        System.out.println("Executando operações em ConcreteFlyweights com estados extrínsecos distintos:");
        flyweightA1.operation("Extrinseco_1");
        flyweightA2.operation("Extrinseco_2");
        flyweightB.operation("Extrinseco_3");

        System.out.println("Executando operação em UnsharedConcreteFlyweight (composto não compartilhado):");
        unshared.add(flyweightA1);
        unshared.add(flyweightB);
        unshared.operation("Extrinseco_Global");
    }

    public static void main(String[] args) {
        new Client().run();
    }
}
