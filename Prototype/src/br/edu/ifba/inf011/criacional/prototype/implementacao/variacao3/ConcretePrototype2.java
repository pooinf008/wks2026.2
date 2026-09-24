package br.edu.ifba.inf011.criacional.prototype.implementacao.variacao3;

/**
 * PARTICIPANTE: ConcretePrototype2 (GoF)
 * Segunda implementação concreta de protótipo com suporte ao método initialize().
 */
public class ConcretePrototype2 implements Prototype {

    private String name;
    private int value;
    private String status;

    public ConcretePrototype2(String name, int value, String status) {
        this.name = name;
        this.value = value;
        this.status = status;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype2(this.name, this.value, this.status);
    }

    @Override
    public void initialize(String name, int value) {
        this.name = name;
        this.value = value;
        this.status = "Inicializado/Ativo";
        System.out.println("ConcretePrototype2: Objeto re-inicializado com [Nome: '" 
                + this.name + "', Valor: " + this.value + ", Status: '" + this.status + "']");
    }

    public String getStatus() {
        return status;
    }

    @Override
    public void execute() {
        System.out.println("ConcretePrototype2 [Nome: '" + name + "', Valor: " + value 
                + ", Status: '" + status + "'] - Hash: #" 
                + Integer.toHexString(System.identityHashCode(this)));
    }
}
