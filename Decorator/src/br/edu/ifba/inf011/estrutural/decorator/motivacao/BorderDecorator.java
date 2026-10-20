package br.edu.ifba.inf011.estrutural.decorator.motivacao;

/**
 * PARTICIPANTE: ConcreteDecorator (GoF)
 * Acrescenta uma borda ao componente. Redefine draw() para primeiro
 * desenhar o componente (super.draw()) e depois a borda (drawBorder()).
 */
public class BorderDecorator extends Decorator {

    private final int borderWidth;

    public BorderDecorator(VisualComponent component, int borderWidth) {
        super(component);
        this.borderWidth = borderWidth;
    }

    @Override
    public void draw() {
        super.draw();
        drawBorder(borderWidth);
    }

    private void drawBorder(int width) {
        System.out.println("BorderDecorator: desenhando borda de largura " + width);
    }
}
