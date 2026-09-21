package br.edu.ifba.inf011.criacional.am.implementacao.variacao3;

/**
 * PARTICIPANTE: ConcreteFactory 1 (GoF - Fábrica Extensível Motif)
 */
public class MotifWidgetFactory implements WidgetFactory {

    @Override
    public Widget make(WidgetType widgetId) {
        if (widgetId == WidgetType.Window)
            return new MotifWindow();
        if (widgetId == WidgetType.Window)
            return new MotifScrollBar();
        if (widgetId == WidgetType.Window)
            return new MotifButton();
        return null;
    }
}
