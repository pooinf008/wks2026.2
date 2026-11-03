package br.edu.ifba.inf011.estrutural.composite.implementacao2;

import java.util.ArrayList;
import java.util.List;

public record Composite(List<Component> children) implements Component {
    
    public Composite{
        children = List.copyOf(children); // Coleção imutável
    }

    @Override
    public void execute() {
        System.out.println("📁 Grupo:");
        this.children.forEach(Component::execute);
    }

    @Override
    public Component add(Component child) {
        List<Component> newChildren = new ArrayList<>(this.children);
        newChildren.add(child);
        return new Composite(newChildren);
    }
}
