package br.edu.ifba.inf011.estrutural.adapter.motivacao;

/**
 * Manipulator de texto: funcionalidade que TextView NÃO oferece
 * e que o adaptador TextShape precisa implementar por conta própria.
 */
public class TextManipulator implements Manipulator {

    private final TextShape shape;

    public TextManipulator(TextShape shape) {
        this.shape = shape;
    }

    @Override
    public void manipulate(Point to) {
        System.out.println("TextManipulator: movendo texto de bounding box "
                + shape.boundingBox()[0] + " para " + to);
    }
}
