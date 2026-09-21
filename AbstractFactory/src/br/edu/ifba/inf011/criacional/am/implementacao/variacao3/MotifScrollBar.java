package br.edu.ifba.inf011.criacional.am.implementacao.variacao3;

/**
 * PARTICIPANTE: ConcreteProduct A1 (GoF)
 */
public class MotifScrollBar implements ScrollBar {

    public MotifScrollBar() {
        System.out.println("MotifScrollBar: Criada barra de rolagem com estilo Motif.");
    }

    @Override
    public void scroll() {
        System.out.println("MotifScrollBar: Rolando tela no estilo Motif.");
    }
}
