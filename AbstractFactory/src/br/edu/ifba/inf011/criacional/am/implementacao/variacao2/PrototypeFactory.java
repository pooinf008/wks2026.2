package br.edu.ifba.inf011.criacional.am.implementacao.variacao2;

/**
 * PARTICIPANTE: ConcreteFactory / PrototypeFactory (GoF - Implementação: Fábricas Parametrizadas por Protótipos)
 *
 * Conforme o livro GoF (Implementation item 2), em vez de criar uma nova subclasse de fábrica
 * para cada família de produtos, uma única classe concreta de fábrica é parametrizada com
 * instâncias de protótipos de cada produto da família. A fábrica cria novos objetos clonando
 * os protótipos configurados.
 */
public class PrototypeFactory implements AbstractFactory {

    private AbstractProductA prototypeA;
    private AbstractProductB prototypeB;

    public PrototypeFactory(AbstractProductA prototypeA, AbstractProductB prototypeB) {
        this.prototypeA = prototypeA;
        this.prototypeB = prototypeB;
    }

    @Override
    public AbstractProductA createProductA() {
        System.out.println("PrototypeFactory: Clonando protótipo de Product A...");
        return this.prototypeA.clone();
    }

    @Override
    public AbstractProductB createProductB() {
        System.out.println("PrototypeFactory: Clonando protótipo de Product B...");
        return this.prototypeB.clone();
    }

    public void setPrototypeA(AbstractProductA prototypeA) {
        this.prototypeA = prototypeA;
    }

    public void setPrototypeB(AbstractProductB prototypeB) {
        this.prototypeB = prototypeB;
    }
}
