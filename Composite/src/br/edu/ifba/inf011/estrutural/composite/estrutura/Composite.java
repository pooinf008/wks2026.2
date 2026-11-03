package br.edu.ifba.inf011.estrutural.composite.estrutura;

import java.util.ArrayList;
import java.util.List;

/**
 * PARTICIPANTE: Composite (GoF)
 * Define o comportamento para componentes que possuem filhos.
 * Armazena componentes-filhos (children) e implementa operações relacionadas a filhos
 * na interface Component (add, remove, getChild).
 * 
 * operation() percorre recursivamente todos os seus filhos invocando operation()
 * em cada um deles (forall c in children -> c.operation()).
 */
public class Composite implements Component {

    private final String name;
    private final List<Component> children = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public Composite() {
        this("Composite");
    }

    @Override
    public void operation() {
        System.out.println("Composite [" + name + "]: executando operation() sobre seus " + children.size() + " filhos...");
        for (Component child : this.children) {
            child.operation();
        }
    }

    @Override
    public void add(Component component) {
    	this.children.add(component);
    }

    @Override
    public void remove(Component component) {
    	this.children.remove(component);
    }

    @Override
    public Component getChild(int index) {
        return this.children.get(index);
    }

    public String getName() {
        return this.name;
    }

    public int getChildCount() {
        return this.children.size();
    }
}
