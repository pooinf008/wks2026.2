package br.edu.ifba.inf011.estrutural.decorator.motivacao;

/**
 * PARTICIPANTE: Decorator (GoF)
 * Subclasse de VisualComponent que mantém uma referência ao componente
 * decorado e repassa (forwarding) as requisições a ele.
 * Sua interface é conforme à do componente, tornando sua presença
 * transparente para os clientes.
 */
public abstract class Decorator implements VisualComponent {

    private final VisualComponent component;

    protected Decorator(VisualComponent component) {
        this.component = component;
    }

    @Override
    public void draw() {
        component.draw();
    }

    @Override
    public void resize() {
        component.resize();
    }
}
