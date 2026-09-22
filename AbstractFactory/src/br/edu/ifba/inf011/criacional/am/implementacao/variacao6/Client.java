package br.edu.ifba.inf011.criacional.am.implementacao.variacao6;

import java.lang.reflect.InvocationTargetException;

/**
 * PARTICIPANTE: Client (GoF)
 * Consome a fábrica e os produtos. Obtém a instância da fábrica concreta através do Singleton (getInstance()).
 */
public class Client {



    public void run() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
    	TemplateReflectionFactory factory = new TemplateReflectionFactory();
    	
    	
    	factory.register("ProductA", "br.edu.ifba.inf011.criacional.am.implementacao.variacao6.ConcreteProductA1");
    	factory.register("ProductB", "br.edu.ifba.inf011.criacional.am.implementacao.variacao6.ConcreteProductB1");
    	
    	AbstractProductA productA = (AbstractProductA) factory.create("ProductA");
    	AbstractProductB productB = (AbstractProductB) factory.create("ProductB");
    	productA.executeA();
    	productB.executeB();    	
    	

    	factory.register("ProductA", "br.edu.ifba.inf011.criacional.am.implementacao.variacao6.ConcreteProductA2");
    	productA = (AbstractProductA) factory.create("ProductA");
    	productB = (AbstractProductB) factory.create("ProductB");
    	productA.executeA();
    	productB.executeB();       
        
    }  
    
    



    public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
        new Client().run();
    }
}
