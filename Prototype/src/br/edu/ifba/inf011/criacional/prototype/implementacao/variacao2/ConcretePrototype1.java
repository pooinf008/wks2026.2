package br.edu.ifba.inf011.criacional.prototype.implementacao.variacao2;

/**
 * PARTICIPANTE: ConcretePrototype1 (GoF)
 * Implementa a operação clone() utilizando DEEP COPY (Cópia Profunda)
 * no objeto de referência interno (Metadata).
 */
public class ConcretePrototype1 implements Prototype {

    private String name;
    private Metadata metadata;

    public ConcretePrototype1(String name, Metadata metadata) {
        this.name = name;
        this.metadata = metadata;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    /**
     * IMPLEMENTAÇÃO DA OPERAÇÃO CLONE COM DEEP COPY (GoF):
     * Além de clonar a classe principal, clona explicitamente o objeto interno 'metadata'.
     */
    @Override
    public Prototype clone() {
        Metadata clonedMetadata = (this.metadata != null) ? this.metadata.clone() : null;
        return new ConcretePrototype1(this.name, clonedMetadata);
    }

    @Override
    public void execute() {
        System.out.println("ConcretePrototype1 [Nome: '" + name + "'] (Hash Objeto: #" 
                + Integer.toHexString(System.identityHashCode(this)) + ")");
        System.out.println("   └─ Metadados: " + metadata);
    }
}
