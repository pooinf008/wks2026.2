package br.edu.ifba.inf011.criacional.builder.estrutura;

import java.util.ArrayList;
import java.util.List;

public class ConcreteBuilder1 extends Builder {

    private List<String> strings;

    public ConcreteBuilder1() {
        this.reset();
    }

    public void reset() {
        this.strings = new ArrayList<String>();
    }

    @Override
    public void buildPartA() {
    	this.strings.add("Parte A1 (Construída por ConcreteBuilder1)");
    }

    @Override
    public void buildPartB() {
    	this.strings.add("Parte B1 (Construída por ConcreteBuilder1)");
    }

    @Override
    public void buildPartC() {
    	this.strings.add("Parte C1 (Construída por ConcreteBuilder1)");
    }

    public Product1 getResult() {
        Product1 result = new Product1(this.strings);
        this.reset();
        return result;
    }
}
