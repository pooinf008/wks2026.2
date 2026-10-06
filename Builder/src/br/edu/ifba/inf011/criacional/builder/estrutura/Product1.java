package br.edu.ifba.inf011.criacional.builder.estrutura;

import java.util.List;


public class Product1 {
    private final List<String> parts;

    public Product1(List<String> parts) {
    	this.parts = parts;
    }

    public List<String> getParts() {
        return parts;
    }

    public String show() {
        StringBuilder sb = new StringBuilder();
        sb.append("Product1 [\n");
        for (String part : parts) {
            sb.append("  - ").append(part).append("\n");
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public String toString() {
        return show();
    }
}
