package br.edu.ifba.inf011.criacional.fm.aplicabilidade;

/**
 * PARTICIPANTE: ConcreteProduct A (GoF)
 * Manipulador específico para a figura de linha (LineFigure).
 */
public class LineManipulator implements Manipulator {

    public LineManipulator() {
        System.out.println("LineManipulator: Criado para manipular extremidades da linha.");
    }

    @Override
    public void drag() {
        System.out.println("LineManipulator: Arrastando os pontos inicial e final da linha.");
    }

    @Override
    public void resize() {
        System.out.println("LineManipulator: Redimensionando o comprimento da linha.");
    }
}
