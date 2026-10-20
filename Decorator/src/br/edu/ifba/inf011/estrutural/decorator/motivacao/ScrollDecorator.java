package br.edu.ifba.inf011.estrutural.decorator.motivacao;

/**
 * PARTICIPANTE: ConcreteDecorator (GoF)
 * Acrescenta barras de rolamento ao componente, mantendo o estado
 * scrollPosition e a operação adicional scrollTo().
 */
public class ScrollDecorator extends Decorator {

    private int scrollPosition;

    public ScrollDecorator(VisualComponent component) {
        super(component);
        this.scrollPosition = 0;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("ScrollDecorator: desenhando barras de rolamento (posição " + scrollPosition + ")");
    }

    public void scrollTo(int position) {
        this.scrollPosition = position;
        System.out.println("ScrollDecorator: rolando para a posição " + position);
    }
}
