package br.edu.ifba.inf011.criacional.fm.aplicabilidade;

/**
 * PARTICIPANTE: ConcreteCreator B (GoF)
 * Sobrescreve o Factory Method para retornar a classe correspondente na hierarquia paralela (TextManipulator).
 */
public class TextFigure extends Figure {

    @Override
    public void draw() {
        System.out.println("TextFigure: Renderizando o texto estilizado.");
    }

    @Override
    public Manipulator createManipulator() {
        return new TextManipulator();
    }
}
