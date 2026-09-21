package br.edu.ifba.inf011.criacional.am.motivacao;

/**
 * PARTICIPANTE: Client (GoF)
 * Constrói a interface de usuário utilizando exclusivamente o WidgetFactory abstrato,
 * garantindo a consistência do look-and-feel sem se acoplar a classes de widgets concretas.
 */
public class Client {

    private WidgetFactory factory;

    public Client(){
        
    }

    public void setWidgetFactory(WidgetFactory factory) {   
        this.factory = factory;
    }

    public void createUI() {
        System.out.println("Client: Construindo interface visual completa...");
        Window window = factory.createWindow();
        ScrollBar scrollBar = factory.createScrollBar();

        window.render();
        scrollBar.scroll();
    }

    public void runDemo() {
        System.out.println("=== Padrão GoF: Abstract Factory (Motivação - Multi Look-and-Feel GUI Toolkit) ===");
        System.out.println("\n--- 1. Aplicação configurada com Look-and-Feel Motif ---");

        this.setWidgetFactory(new MotifWidgetFactory());
        this.createUI();

        System.out.println("\n--- 2. Aplicação configurada com Look-and-Feel PM ---");
        this.setWidgetFactory(new PMWidgetFactory());
        this.createUI();
    }

    public static void main(String[] args) {
        new Client().runDemo();
    }
}
