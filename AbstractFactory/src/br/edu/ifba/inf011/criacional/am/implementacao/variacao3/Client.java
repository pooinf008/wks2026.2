package br.edu.ifba.inf011.criacional.am.implementacao.variacao3;

/**
 * PARTICIPANTE: Client (GoF)
 * Consome a fábrica extensível através da operação única 'make(widgetId)'.
 */
public class Client {

    private WidgetFactory factory;

    public void setFactory(WidgetFactory factory) {
        this.factory = factory;
    }

    public void createUI() {
        System.out.println("Client: Solicitando widgets via operação única 'make'...");

        Window window = (Window) factory.make(WidgetType.Window);
        ScrollBar scrollBar = (ScrollBar) factory.make(WidgetType.ScrollBar);
        Button button = (Button) factory.make(WidgetType.Button);

        if (window != null) window.render();
        if (scrollBar != null) scrollBar.scroll();
        if (button != null) button.click();
    }

    public void run() {
        System.out.println("=== Padrão GoF: Abstract Factory (Implementação - Fábricas Extensíveis com Operação Única 'make') ===");

        // 1. Fábrica no estilo Motif
        System.out.println("\n--- 1. Instanciando MotifWidgetFactory extensível ---");
        this.setFactory(new MotifWidgetFactory());
        this.createUI();

        // 2. Fábrica no estilo PM
        System.out.println("\n--- 2. Instanciando PMWidgetFactory extensível ---");
        this.setFactory(new PMWidgetFactory());
        this.createUI();
    }

    public static void main(String[] args) {
        new Client().run();
    }
}
