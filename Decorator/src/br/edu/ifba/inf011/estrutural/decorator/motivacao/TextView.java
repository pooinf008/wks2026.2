package br.edu.ifba.inf011.estrutural.decorator.motivacao;

/**
 * PARTICIPANTE: ConcreteComponent (GoF)
 * Objeto que exibe texto numa janela. Por padrão não possui barras
 * de rolamento nem borda.
 */
public class TextView implements VisualComponent {

    private final String text;

    public TextView(String text) {
        this.text = text;
    }

    @Override
    public void draw() {
        System.out.println("TextView: desenhando texto \"" + text + "\"");
    }

    @Override
    public void resize() {
        System.out.println("TextView: redimensionando");
    }
}
