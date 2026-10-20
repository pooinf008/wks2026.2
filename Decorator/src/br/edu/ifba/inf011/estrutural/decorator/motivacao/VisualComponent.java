package br.edu.ifba.inf011.estrutural.decorator.motivacao;

/**
 * PARTICIPANTE: Component (GoF)
 * Classe abstrata para objetos visuais. Define a interface de desenho
 * e de tratamento de eventos comum a componentes e decoradores.
 */
public interface VisualComponent {
    public void draw();
    public void resize();
}
