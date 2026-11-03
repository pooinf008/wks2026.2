package br.edu.ifba.inf011.estrutural.composite.implementacao1;

import java.util.ArrayList;
import java.util.List;

/**
 * PARTICIPANTE: Composite (GoF - Seção Implementação, Item 4)
 * 
 * Representa um componente composto que possui filhos.
 * Define e implementa as operações de gerenciamento de filhos (add, remove, getChild).
 * 
 * Redefine o método getComposite() para retornar a si mesmo (this), permitindo
 * que clientes identifiquem a composição e tenham acesso seguro e estaticamente tipado
 * às operações de filhos sem downcast explícito.
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
        System.out.println("Composite [" + this.name + "]: executando operation() sobre seus " + this.children.size() + " filhos...");
        for (Component child : this.children) {
            child.operation();
        }
    }

    @Override
    public Composite getComposite() {
        return this;
    }

    public void add(Component component) {
    	this.children.add(component);
    }

    public void remove(Component component) {
    	this.children.remove(component);
    }

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
