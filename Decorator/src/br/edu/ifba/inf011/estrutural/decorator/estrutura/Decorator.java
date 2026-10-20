package br.edu.ifba.inf011.estrutural.decorator.estrutura;

/**
 * PARTICIPANTE: Decorator (GoF)
 * Mantém uma referência para um objeto Component e define uma interface
 * que segue a interface de Component.
 * operation() { component.operation(); }
 */
public abstract class Decorator implements Component {

    private final Component component;

    protected Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        this.component.operation();
    }
}
