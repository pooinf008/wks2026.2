package br.edu.ifba.inf011.criacional.am.implementacao.variacao4;

/**
 * PARTICIPANTE: Client (GoF)
 * Consome a fábrica e os produtos. Obtém a instância da fábrica concreta através do Singleton (getInstance()).
 */
public class Client {

	private TemplateGenericFactory<? extends AbstractProductA, ? extends AbstractProductB> factory;
	
    public void setFactory(TemplateGenericFactory<? extends AbstractProductA, ? extends AbstractProductB> factory){
    	this.factory = factory;
    }
    

    public void run() {
        System.out.println("Client: Solicitando criação de produtos à fábrica...");
        this.setFactory(new TemplateGenericFactory<>(ConcreteProductA1::new, ConcreteProductB1::new));
        AbstractProductA productA = this.factory.createProductA();
        AbstractProductB productB = this.factory.createProductB();
        productA.executeA();
        productB.executeB();
        
        System.out.println("Client: Solicitando criação de produtos à fábrica...");
        this.setFactory(new TemplateGenericFactory<>(ConcreteProductA2::new, ConcreteProductB2::new));
        productA = this.factory.createProductA();
        productB = this.factory.createProductB();
        productA.executeA();
        productB.executeB();           
        
    }  
    
    



    public static void main(String[] args) {
        new Client().run();
    }
}
