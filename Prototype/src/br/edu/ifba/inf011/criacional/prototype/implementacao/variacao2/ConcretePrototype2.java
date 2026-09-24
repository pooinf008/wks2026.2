package br.edu.ifba.inf011.criacional.prototype.implementacao.variacao2;

import java.util.ArrayList;
import java.util.List;

/**
 * PARTICIPANTE: ConcretePrototype2 (GoF)
 * Implementa a operação clone() utilizando DEEP COPY em coleções internas (List<String> tags).
 */
public class ConcretePrototype2 implements Prototype {

    private int code;
    private List<String> tags;

    public ConcretePrototype2(int code, List<String> tags) {
        this.code = code;
        this.tags = tags != null ? new ArrayList<>(tags) : new ArrayList<>();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<String> getTags() {
        return tags;
    }

    public void addTag(String tag) {
        this.tags.add(tag);
    }

    /**
     * IMPLEMENTAÇÃO DA OPERAÇÃO CLONE COM DEEP COPY (GoF):
     * Cria uma nova lista para evitar o compartilhamento da referência de coleção.
     */
    @Override
    public Prototype clone() {
        List<String> clonedTags = new ArrayList<>(this.tags);
        return new ConcretePrototype2(this.code, clonedTags);
    }

    @Override
    public void execute() {
        System.out.println("ConcretePrototype2 [Código: " + code + ", Tags: " + tags + "] (Hash Objeto: #" 
                + Integer.toHexString(System.identityHashCode(this)) + ", Hash Lista: #" 
                + Integer.toHexString(System.identityHashCode(this.tags)) + ")");
    }
}
