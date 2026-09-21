package br.edu.ifba.inf011.criacional.am.motivacao;

/**
 * PARTICIPANTE: ConcreteFactory 1 (GoF)
 * Fábrica concreta que constrói a família completa de widgets no estilo Motif.
 */
public class MotifWidgetFactory implements WidgetFactory {

    @Override
    public ScrollBar createScrollBar() {
        return new MotifScrollBar();
    }

    @Override
    public Window createWindow() {
        return new MotifWindow();
    }
}
