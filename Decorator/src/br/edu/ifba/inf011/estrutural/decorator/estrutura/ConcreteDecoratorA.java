package br.edu.ifba.inf011.estrutural.decorator.estrutura;

/**
 * PARTICIPANTE: ConcreteDecoratorA (GoF)
 * Acrescenta responsabilidades ao componente por meio de estado adicional (addedState).
 */
public class ConcreteDecoratorA extends Decorator {

    private String addedState;

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        this.addedState = "estado acrescentado";
        System.out.println("ConcreteDecoratorA: addedState = " + this.addedState);
    }
}
