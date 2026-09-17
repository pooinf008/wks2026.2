package br.edu.ifba.inf011.criacional.fm.implementacao.variacao3;

/**
 * PARTICIPANTE: ConcreteCreator (GoF - Subclasse Exposta à Armadilha de Inicialização)
 */
public class ConcreteCreator extends Creator {

    private Product product = new ConcreteProduct(); 

    public ConcreteCreator() {
        // super();
        System.out.println("ConcreteCreator [Construtor Filho]: Construtor filho concluído");
    }

    @Override
    protected Product factoryMethod() {
        return this.product;
    }
}
