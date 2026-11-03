package br.edu.ifba.inf011.estrutural.composite.motivacao;

import java.util.ArrayList;
import java.util.List;

/**
 * PARTICIPANTE: Client (GoF)
 * Editor de desenho que manipula componentes gráficos através da interface Graphic.
 * Não precisa distinguir se está lidando com uma primitiva básica (Line, Rectangle, Text)
 * ou com uma figura composta (Picture). Trata objetos primitivos e compostos de forma uniforme.
 */
public class DrawingEditor {

    private final List<Graphic> documents = new ArrayList<>();

    public void add(Graphic graphic) {
        this.documents.add(graphic);
    }

    public void draw() {
        for (Graphic g : this.documents) {
            g.draw();
        }
    }

    public void run() {
        System.out.println("=== Padrão GoF: Composite (Motivação - Editor de Desenho / Graphic) ===\n");

        // Criação de primitivas gráficas (folhas)
        Graphic line1 = new Line(0, 0, 100, 100);
        Graphic rect1 = new Rectangle(10, 10, 80, 50);
        Graphic line2 = new Rectangle(10, 10, 80, 80);
        Graphic text1 = new Text("Diagrama de Sistema", 15, 25);

        // Agrupamento de componentes em uma Picture menor
        Picture subPicture = new Picture("SubFigura - Bloco Central");
        subPicture.add(line1);
        subPicture.add(rect1);
        subPicture.add(line2);

        // Agrupamento em uma Picture maior (composição recursiva de Picture e Text)
        Picture mainPicture = new Picture("Figura Completa - Documento");
        mainPicture.add(text1);
        mainPicture.add(subPicture);
        mainPicture.add(new Line(0, 100, 200, 100));

        // O editor manipula tudo uniformemente como Graphic
        this.add(mainPicture);

        System.out.println("-- Renderizando todos os elementos do editor:");
        this.draw();
    }

    public static void main(String[] args) {
        new DrawingEditor().run();
    }
}
