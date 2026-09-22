package br.edu.ifba.inf011.criacional.am.implementacao.variacao5;


/**
 * PARTICIPANTE: Client (GoF)
 * Consome a fábrica e os produtos. Obtém a instância da fábrica concreta através do Singleton (getInstance()).
 */
public class Client {

    public void run() {
    	
    	TemplateConfigurableFactory factory = new TemplateConfigurableFactory();
    	
    	
    	factory.register(AbstractProductA.class, ConcreteProductA1::new);
    	factory.register(AbstractProductB.class, ConcreteProductB1::new);
    	AbstractProductA productA = factory.create(AbstractProductA.class);
    	productA.executeA();
    	AbstractProductB productB = factory.create(AbstractProductB.class);
    	productB.executeB();    	
    	

    	factory.register(AbstractProductA.class, ConcreteProductA2::new);
    	productA = factory.create(AbstractProductA.class);
    	productB = factory.create(AbstractProductB.class);
    	productA.executeA();
    	productB.executeB();
    }  
    
    



    public static void main(String[] args) {
        new Client().run();
    }
}
