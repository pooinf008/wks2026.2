package br.edu.ifba.inf011.criacional.builder.estrutura;

import java.util.ArrayList;
import java.util.List;

public class Product2 {
    private final List<String> components = new ArrayList<>();

    public void appendComponent(String component) {
        components.add(component);
    }

    public List<String> getComponents() {
        return components;
    }

    public String render() {
        StringBuilder sb = new StringBuilder();
        sb.append("Product2 (Estrutura Diferente) [\n");
        for (String comp : components) {
            sb.append("  * Componente: ").append(comp).append("\n");
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public String toString() {
        return render();
    }
}
