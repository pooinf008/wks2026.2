package br.edu.ifba.inf011.estrutural.adapter.motivacao;

/**
 * PARTICIPANTE: Adapter (GoF) - Adaptador de OBJETO
 * Implementa Shape (Target) e mantém uma referência a um TextView (Adaptee),
 * traduzindo as requisições de Shape para operações de TextView.
 */
public class TextShape implements Shape {

    private final TextView text;

    public TextShape(TextView text) {
        this.text = text;
    }

    /**
     * Converte a interface origem+extensão do TextView em bounding box.
     */
    @Override
    public Point[] boundingBox() {
        Point origin = text.getOrigin();
        Point extent = text.getExtent();
        Point bottomLeft = origin;
        Point topRight = new Point(origin.getX() + extent.getX(), origin.getY() + extent.getY());
        return new Point[] { bottomLeft, topRight };
    }

    /**
     * Encaminhamento direto de requisição (operação simples).
     */
    public boolean isEmpty() {
        return this.text.isEmpty();
    }

    /**
     * Funcionalidade inexistente no Adaptee: implementada pelo próprio Adapter.
     */
    @Override
    public Manipulator createManipulator() {
        return new TextManipulator(this);
    }
}
