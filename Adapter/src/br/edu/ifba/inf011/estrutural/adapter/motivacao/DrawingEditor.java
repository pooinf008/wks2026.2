package br.edu.ifba.inf011.estrutural.adapter.motivacao;

import java.util.ArrayList;
import java.util.List;

/**
 * PARTICIPANTE: Client (GoF)
 * Editor de desenho que conhece apenas a interface Shape.
 * Graças ao TextShape, consegue usar o TextView do toolkit de terceiros sem conhecê-lo.
 */
public class DrawingEditor {

    private final List<Shape> shapes = new ArrayList<>();

    public void add(Shape shape) {
        shapes.add(shape);
    }

    public void render() {
        for (Shape s : shapes) {
            Point[] box = s.boundingBox();
            System.out.println(s.getClass().getSimpleName() + " -> bounding box: " + box[0] + " a " + box[1]);
            s.createManipulator().manipulate(new Point(100, 100));
        }
    }
    
    public void run() {
        System.out.println("=== Padrão GoF: Adapter (Motivação - Editor de Desenho) ===\n");

        this.add(new LineShape(new Point(0, 0), new Point(30, 40)));
        TextView textView = new TextView(new Point(10, 20), 50, 12, "Olá, Adapter!");
        this.add(new TextShape(textView));
        this.render();    	
    }

    public static void main(String[] args) {
    	new DrawingEditor().run();
    }
}
