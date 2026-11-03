package br.edu.ifba.inf011.estrutural.composite.motivacao;

import java.util.ArrayList;
import java.util.List;

/**
 * PARTICIPANTE: Composite (GoF)
 * Define um agregado de objetos Graphic (recipiente / figura composta).
 * Mantém referências aos componentes filhos em uma lista (graphics).
 * 
 * Implementa draw() chamando draw() recursivamente em cada um de seus filhos.
 * Implementa também as operações de gerenciamento de filhos (add, remove, getChild).
 */
public class Picture implements Graphic {

    private final String name;
    private final List<Graphic> graphics = new ArrayList<>();

    public Picture(String name) {
        this.name = name;
    }

    public Picture() {
        this("Picture");
    }

    @Override
    public void draw() {
        System.out.println("Picture [" + name + "]: desenhando composição (" + graphics.size() + " elementos)...");
        for (Graphic g : this.graphics) {
            g.draw();
        }
    }

    @Override
    public void add(Graphic graphic) {
    	this.graphics.add(graphic);
    }

    @Override
    public void remove(Graphic graphic) {
    	this.graphics.remove(graphic);
    }

    @Override
    public Graphic getChild(int index) {
        return this.graphics.get(index);
    }

    public String getName() {
        return this.name;
    }

    public int getChildCount() {
        return this.graphics.size();
    }
}
