package br.edu.ifba.inf011.criacional.fm.aplicabilidade;

/**
 * PARTICIPANTE: ConcreteProduct B (GoF)
 * Manipulador específico para a figura de texto (TextFigure).
 */
public class TextManipulator implements Manipulator {

    public TextManipulator() {
        System.out.println("TextManipulator: Criado para manipular a caixa de texto e fonte.");
    }

    @Override
    public void drag() {
        System.out.println("TextManipulator: Arrastando a caixa de texto pela tela.");
    }

    @Override
    public void resize() {
        System.out.println("TextManipulator: Ajustando a largura e altura da caixa de texto.");
    }
}
