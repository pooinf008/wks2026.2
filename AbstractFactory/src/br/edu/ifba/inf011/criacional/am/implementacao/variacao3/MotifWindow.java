package br.edu.ifba.inf011.criacional.am.implementacao.variacao3;

/**
 * PARTICIPANTE: ConcreteProduct B1 (GoF)
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
