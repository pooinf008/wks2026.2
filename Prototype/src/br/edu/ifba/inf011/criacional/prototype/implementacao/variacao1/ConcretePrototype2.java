package br.edu.ifba.inf011.criacional.prototype.implementacao.variacao1;

/**
 * PARTICIPANTE: ConcretePrototype2 (GoF)
 * Segunda implementação concreta de protótipo gerenciada pelo PrototypeManager.
 */
public class ConcretePrototype2 implements Prototype {

    private int code;

    public ConcretePrototype2(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype2(this.code);
    }

    @Override
    public void execute() {
        System.out.println("ConcretePrototype2 [Código: " + code + "] - Hash: #" 
                + Integer.toHexString(System.identityHashCode(this)));
    }
}
