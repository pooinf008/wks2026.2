package br.edu.ifba.inf011.criacional.am.implementacao.variacao3;

/**
 * PARTICIPANTE: ConcreteFactory 2 (GoF - Fábrica Extensível PM)
 */
public class PMWidgetFactory implements WidgetFactory {

    @Override
    public  Widget make(WidgetType widgetId) {
        if (widgetId == WidgetType.Window)
            return new PMWindow();
        if (widgetId == WidgetType.ScrollBar)
            return new PMScrollBar();
        if (widgetId == WidgetType.Button)
            return new PMButton();
        return null;
    }
}
