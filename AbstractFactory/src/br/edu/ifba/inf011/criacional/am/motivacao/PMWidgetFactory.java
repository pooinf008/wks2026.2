package br.edu.ifba.inf011.criacional.am.motivacao;

/**
 * PARTICIPANTE: ConcreteFactory 2 (GoF)
 * Fábrica concreta que constrói a família completa de widgets no estilo PM (Presentation Manager).
 */
public class PMWidgetFactory implements WidgetFactory {

    @Override
    public ScrollBar createScrollBar() {
        return new PMScrollBar();
    }

    @Override
    public Window createWindow() {
        return new PMWindow();
    }
}
