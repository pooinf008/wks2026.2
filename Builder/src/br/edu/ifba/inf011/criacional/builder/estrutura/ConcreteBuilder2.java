package br.edu.ifba.inf011.criacional.builder.estrutura;

/**
 * PARTICIPANTE: ConcreteBuilder2 (GoF)
 * 
 * Outra implementação concreta do Builder que monta uma representação diferente (Product2).
 */
public class ConcreteBuilder2 extends Builder {

    private Product2 product;

    public ConcreteBuilder2() {
        this.reset();
    }

    public void reset() {
        this.product = new Product2();
    }

    @Override
    public void buildPartA() {
        product.appendComponent("Módulo Alfa (PartA do ConcreteBuilder2)");
    }

    @Override
    public void buildPartB() {
        product.appendComponent("Módulo Beta (PartB do ConcreteBuilder2)");
    }

    @Override
    public void buildPartC() {
        product.appendComponent("Módulo Gama (PartC do ConcreteBuilder2)");
    }

    /**
     * Retorna o produto resultante construído.
     */
    public Product2 getResult() {
        Product2 result = this.product;
        this.reset();
        return result;
    }
}
