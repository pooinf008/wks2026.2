package br.edu.ifba.inf011.estrutural.flyweight.motivacao;

import java.util.ArrayList;
import java.util.List;

/**
 * PARTICIPANTE: UnsharedConcreteFlyweight / Composite (GoF)
 * Representa uma linha de texto no documento, contendo uma sequência de glifos.
 * 
 * Não é compartilhado porque seu estado agregado (lista de filhos e posição física)
 * é específico de cada ocorrência de linha no documento. No entanto, seus filhos
 * folhas (Character) são instâncias compartilhadas (Flyweights).
 */
public class Row implements Glyph {

    private final List<Glyph> children = new ArrayList<>();
    private int lineHeight;

    public Row() {
        this.lineHeight = 8;
    }

    @Override
    public void draw(int x, int y) {
        for (int iCont = 0; iCont < this.children.size(); iCont++)
        	this.children.get(iCont).draw(x * this.lineHeight, y + iCont);
    }

    @Override
    public void add(Glyph glyph) {
        this.children.add(glyph);
    }

    public int getChildCount() {
        return this.children.size();
    }
}
