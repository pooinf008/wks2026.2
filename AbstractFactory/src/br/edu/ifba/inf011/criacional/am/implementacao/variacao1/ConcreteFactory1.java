package br.edu.ifba.inf011.criacional.am.implementacao.variacao1;

/**
 * PARTICIPANTE: ConcreteFactory 1 (GoF - Implementação: Fábricas como Singletons)
 *
 * Conforme o livro GoF (Implementation item 1), uma aplicação normalmente necessita de
 * apenas uma única instância de cada fábrica concreta por família de produtos. Por isso,
 * a fábrica concreta é implementada aplicando o padrão Singleton.
 */
public class ConcreteFactory1 implements AbstractFactory {

    private static ConcreteFactory1 instance;

    // Construtor privado impede instanciações externas desnecessárias
    private ConcreteFactory1() {
        System.out.println("ConcreteFactory1 [Singleton]: Criando a instância única da fábrica.");
    }

    public static synchronized ConcreteFactory1 getInstance() {
        if (instance == null) {
            instance = new ConcreteFactory1();
        }
        return instance;
    }

    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB1();
    }
}
