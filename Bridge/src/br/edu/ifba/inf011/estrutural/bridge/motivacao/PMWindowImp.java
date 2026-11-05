package br.edu.ifba.inf011.estrutural.bridge.motivacao;

/**
 * PARTICIPANTE: ConcreteImplementor (GoF - Motivação)
 * Implementa a interface WindowImp para o Presentation Manager da IBM (OS/2 PM).
 */
public class PMWindowImp implements WindowImp {

    @Override
    public void devDrawText(String text, int x, int y) {
        System.out.println("PMWindowImp (Presentation Manager): desenhando texto \"" + text + "\" na posição (" + x + ", " + y + ")");
    }

    @Override
    public void devDrawLine(int x1, int y1, int x2, int y2) {
        System.out.println("PMWindowImp (Presentation Manager): traçando linha de (" + x1 + ", " + y1 + ") até (" + x2 + ", " + y2 + ")");
    }
}
