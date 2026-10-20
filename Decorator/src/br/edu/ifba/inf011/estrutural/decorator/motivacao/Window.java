package br.edu.ifba.inf011.estrutural.decorator.motivacao;

/**
 * PARTICIPANTE: Client (GoF)
 * Janela que conhece apenas VisualComponent. Não distingue um componente
 * decorado de um não decorado.
 */
public class Window {

    private VisualComponent contents;

    public void setContents(VisualComponent contents) {
        this.contents = contents;
    }

    public void draw() {
        contents.draw();
    }

    public void run() {
        System.out.println("=== Padrão GoF: Decorator (Motivação - TextView com borda e rolamento) ===\n");

        TextView textView = new TextView("Olá, Decorator!");
        this.setContents(new BorderDecorator(new BorderDecorator(new ScrollDecorator(textView), 1), 2));
        this.draw();
    }

    public static void main(String[] args) {
        new Window().run();
    }
}
