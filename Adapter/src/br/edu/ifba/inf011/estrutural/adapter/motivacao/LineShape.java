package br.edu.ifba.inf011.estrutural.adapter.motivacao;

/**
 * Forma "nativa" do editor (LineShape no GoF): implementa Shape diretamente, sem adaptação.
 */
public class LineShape implements Shape {

    private final Point start;
    private final Point end;

    public LineShape(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public Point[] boundingBox() {
        return new Point[] {
            new Point(Math.min(start.getX(), end.getX()), Math.min(start.getY(), end.getY())),
            new Point(Math.max(start.getX(), end.getX()), Math.max(start.getY(), end.getY()))
        };
    }

    @Override
    public Manipulator createManipulator() {
        return to -> System.out.println("LineManipulator: arrastando extremidade da linha para " + to);
    }
}
