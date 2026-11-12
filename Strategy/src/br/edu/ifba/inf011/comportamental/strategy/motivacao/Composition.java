package br.edu.ifba.inf011.comportamental.strategy.motivacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * PARTICIPANTE: Context (GoF - Motivação)
 * 
 * Mantém um texto, a largura máxima da linha e uma referência para a estratégia
 * (Compositor). A responsabilidade de quebra e formatação é delegada à estratégia.
 */
public class Composition {

    private String text;
    private int width;
    private Compositor compositor;
    private List<String> lines;

    public Composition(String text, int width, Compositor compositor) {
        this.text = text;
        this.width = width;
        this.compositor = compositor;
        this.lines = new ArrayList<>();
    }

    public Composition(String text, int width) {
        this(text, width, new HardBreakCompositor());
    }

    /**
     * Operação do GoF: repair()
     * Reformata o texto delegando a responsabilidade à estratégia atual (Compositor).
     */
    public void repair() {
        if (this.compositor != null) {
            this.lines = this.compositor.compose(this.text, this.width);
        }
    }

    public void format() {
        repair();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Compositor getCompositor() {
        return compositor;
    }

    public void setCompositor(Compositor compositor) {
        this.compositor = compositor;
    }

    public List<String> getLines() {
        return Collections.unmodifiableList(this.lines);
    }

    public void setLines(List<String> lines) {
        this.lines = (lines != null) ? new ArrayList<>(lines) : new ArrayList<>();
    }

    public void display() {
        System.out.println("--- Exibição do Texto Formatado (Largura: " + width + " | Total de Linhas: " + lines.size() + ") ---");
        for (int i = 0; i < lines.size(); i++) {
            System.out.printf("Linha %02d [%02d chars]: \"%s\"%n", (i + 1), lines.get(i).length(), lines.get(i));
        }
        System.out.println("------------------------------------------------------------------");
    }
}
