package br.edu.ifba.inf011.criacional.fm.aplicabilidade;

/**
 * PARTICIPANTE: ConcreteCreator A (GoF)
 * Sobrescreve o Factory Method para retornar a classe correspondente na hierarquia paralela (LineManipulator).
 */
public class LineFigure extends Figure {

    @Override
    public void draw() {
        System.out.println("LineFigure: Desenhando uma linha entre dois pontos.");
    }

    @Override
    public Manipulator createManipulator() {
        return new LineManipulator();
    }
}
