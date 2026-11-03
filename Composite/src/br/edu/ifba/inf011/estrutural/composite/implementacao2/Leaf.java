package br.edu.ifba.inf011.estrutural.composite.implementacao2;

import java.util.List;

public record Leaf(String name) implements Component {
    @Override
    public void execute() {
        System.out.println("🍃 Folha: " + name);
    }

    @Override
    public Component add(Component child) {
        // SAFETY TOTAL: Não lança exceção!
        // Transforma a folha + o novo filho em um novo grupo (Composite)!
        return new Composite(List.of(this, child));
    }
}