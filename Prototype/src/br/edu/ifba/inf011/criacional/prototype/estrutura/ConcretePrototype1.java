package br.edu.ifba.inf011.criacional.prototype.estrutura;

/**
 * PARTICIPANTE: ConcretePrototype1 (GoF)
 * Implementa a operação de clonagem para criar uma nova instância de si mesmo.
 */
public class ConcretePrototype1 implements Prototype {

    private String attribute;

    public ConcretePrototype1(String attribute) {
        this.attribute = attribute;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    @Override
    public Prototype clone() {
        // Cria e retorna uma nova instância cópia do objeto atual
        return new ConcretePrototype1(this.attribute);
    }

    @Override
    public void execute() {
        System.out.println("ConcretePrototype1 [Atributo: '" + attribute + "'] - Hash: #" 
                + Integer.toHexString(System.identityHashCode(this)));
    }
}
