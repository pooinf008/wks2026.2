package br.edu.ifba.inf011.criacional.am.implementacao.variacao1;

/**
 * PARTICIPANTE: ConcreteFactory 2 (GoF - Implementação: Fábricas como Singletons)
 *
 * Fábrica concreta para a Família 2 implementada como Singleton.
 */
public class ConcreteFactory2 implements AbstractFactory {

    private static ConcreteFactory2 instance;

    // Construtor privado impede instanciações externas desnecessárias
    private ConcreteFactory2() {
        System.out.println("ConcreteFactory2 [Singleton]: Criando a instância única da fábrica.");
    }

    public static synchronized ConcreteFactory2 getInstance() {
        if (instance == null) {
            instance = new ConcreteFactory2();
        }
        return instance;
    }

    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB2();
    }
}
