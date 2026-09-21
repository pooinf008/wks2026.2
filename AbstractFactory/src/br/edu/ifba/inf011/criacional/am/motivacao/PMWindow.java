package br.edu.ifba.inf011.criacional.am.motivacao;

/**
 * PARTICIPANTE: ConcreteProduct B2 (GoF)
 * Janela estilizada para o visual PM (Presentation Manager).
 */
public class PMWindow implements Window {

    public PMWindow() {
        System.out.println("PMWindow: Criada janela com estilo PM.");
    }

    @Override
    public void render() {
        System.out.println("PMWindow: Renderizando bordas e título no estilo PM.");
    }
}
