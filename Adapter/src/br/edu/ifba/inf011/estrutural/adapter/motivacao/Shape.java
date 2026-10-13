package br.edu.ifba.inf011.estrutural.adapter.motivacao;

/**
 * PARTICIPANTE: Target (GoF)
 * Interface que o DrawingEditor espera de todo objeto gráfico.
 */
public interface Shape {
    public Point[] boundingBox();
    public Manipulator createManipulator();
}
