package br.edu.ifba.inf011.criacional.am.motivacao;

/**
 * PARTICIPANTE: ConcreteProduct B1 (GoF)
 * Janela estilizada para o visual Motif.
 */
public class MotifWindow implements Window {

    public MotifWindow() {
        System.out.println("MotifWindow: Criada janela com estilo Motif.");
    }

    @Override
    public void render() {
        System.out.println("MotifWindow: Renderizando bordas e título no estilo Motif.");
    }
}
