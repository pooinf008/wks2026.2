package br.edu.ifba.inf011.criacional.builder.estrutura;

/**
 * PARTICIPANTE: Builder (GoF)
 * 
 * Especifica uma interface abstrata para a criação de partes de um objeto Product.
 * No GoF, o Builder define os métodos de construção de cada parte do produto complexo.
 */
public abstract class Builder {
    
    /**
     * Constrói a primeira parte do produto.
     */
    public void buildPartA() {}

    /**
     * Constrói a segunda parte do produto.
     */
    public void buildPartB() {}

    /**
     * Constrói a terceira parte do produto.
     */
    public void buildPartC() {}
}
