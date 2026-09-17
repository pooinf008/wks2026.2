package br.edu.ifba.inf011.criacional.fm.estrutura;

/**
 * PARTICIPANTE: Creator (GoF)
 * Declara o método de fabricação (factoryMethod) que retorna um objeto Product.
 * Pode conter operações (anOperation) que dependem da criação do produto.
 */
public abstract class Creator {

    /**
     * FACTORY METHOD (GoF)
     * Método abstrato genérico a ser sobrescrito pelas subclasses para instanciar o produto.
     */
    public abstract Product factoryMethod();

    /**
     * Operação genérica do Creator (chamada AnOperation no GoF) que consome o produto.
     */
    public void anOperation() {
        System.out.println("\nCreator: Invocando 'anOperation'...");
        // O Creator invoca o Factory Method para criar o produto de forma polimórfica
        Product product = this.factoryMethod();
        product.execute();
    }
}
