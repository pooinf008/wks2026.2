package br.edu.ifba.inf011.criacional.prototype.implementacao.variacao1;

/**
 * PARTICIPANTE: ConcretePrototype1 (GoF)
 * Implementação concreta de protótipo gerenciada pelo PrototypeManager.
 */
public class ConcretePrototype1 implements Prototype {

    private String name;

    public ConcretePrototype1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype1(this.name);
    }

    @Override
    public void execute() {
        System.out.println("ConcretePrototype1 [Nome: '" + name + "'] - Hash: #" 
                + Integer.toHexString(System.identityHashCode(this)));
    }
}
