package br.edu.ifba.inf011.criacional.builder.estrutura;

/**
 * PARTICIPANTE: Director (GoF)
 * 
 * Constrói um objeto utilizando a interface Builder.
 * O Diretor especifica a sequência/algoritmo de passos para montar o objeto complexo,
 * mantendo o código de construção independente da representação concreta do produto.
 */
public class Director {

    private Builder builder;

    public Director() {
    }

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    /**
     * Método de construção completo do produto complexo.
     * Orquestra as chamadas aos métodos de construção da interface Builder.
     */
    public void construct() {
        if (builder == null) {
            throw new IllegalStateException("Builder não foi configurado no Director.");
        }
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
    }

    /**
     * Variação do algoritmo de construção (ex: produto mínimo/parcial).
     */
    public void constructPartial() {
        if (builder == null) {
            throw new IllegalStateException("Builder não foi configurado no Director.");
        }
        builder.buildPartA();
        builder.buildPartB();
    }
}
