package br.edu.ifba.inf011.criacional.prototype.implementacao.variacao3;

/**
 * PARTICIPANTE: ConcretePrototype1 (GoF)
 * Implementação concreta de protótipo que suporta a operação initialize()
 * para parametrizar e configurar o estado do objeto recém-clonado.
 */
public class ConcretePrototype1 implements Prototype {

    private String name;
    private int value;
    private String category; // Atributo padrão mantido do protótipo

    public ConcretePrototype1(String name, int value, String category) {
        this.name = name;
        this.value = value;
        this.category = category;
    }

    /**
     * IMPLEMENTAÇÃO DE CLONE (GoF):
     * Retorna uma cópia da instância base com as configurações padrão.
     */
    @Override
    public Prototype clone() {
        return new ConcretePrototype1(this.name, this.value, this.category);
    }

    /**
     * MÉTODO INITIALIZE (GoF Implementação - Iniciar Clones):
     * Permite ao cliente redefinir parâmetros do clone sem precisar passar argumentos no clone().
     */
    @Override
    public void initialize(String name, int value) {
        this.name = name;
        this.value = value;
        System.out.println("ConcretePrototype1: Objeto re-inicializado com [Nome: '" 
                + this.name + "', Valor: " + this.value + "]");
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public void execute() {
        System.out.println("ConcretePrototype1 [Nome: '" + name + "', Valor: " + value 
                + ", Categoria: '" + category + "'] - Hash: #" 
                + Integer.toHexString(System.identityHashCode(this)));
    }
}
