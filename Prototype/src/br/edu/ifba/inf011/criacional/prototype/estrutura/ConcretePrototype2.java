package br.edu.ifba.inf011.criacional.prototype.estrutura;

/**
 * PARTICIPANTE: ConcretePrototype2 (GoF)
 * Implementa a operação de clonagem para criar uma nova instância de si mesmo.
 */
public class ConcretePrototype2 implements Prototype {

    private int value;

    public ConcretePrototype2(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public Prototype clone() {
        // Cria e retorna uma nova instância cópia do objeto atual
        return new ConcretePrototype2(this.value);
    }

    @Override
    public void execute() {
        System.out.println("ConcretePrototype2 [Valor: " + value + "] - Hash: #" 
                + Integer.toHexString(System.identityHashCode(this)));
    }
}
