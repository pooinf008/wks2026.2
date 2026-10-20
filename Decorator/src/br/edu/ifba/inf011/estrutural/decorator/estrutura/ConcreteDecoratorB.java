package br.edu.ifba.inf011.estrutural.decorator.estrutura;

/**
 * PARTICIPANTE: ConcreteDecoratorB (GoF)
 * Acrescenta responsabilidades ao componente por meio de comportamento adicional.
 * operation() { Decorator::operation(); addedBehavior(); }
 */
public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        this.addedBehavior();
    }

    public void addedBehavior() {
        System.out.println("ConcreteDecoratorB: addedBehavior()");
    }
}
