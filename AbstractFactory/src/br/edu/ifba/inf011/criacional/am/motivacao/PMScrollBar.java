package br.edu.ifba.inf011.criacional.am.motivacao;

/**
 * PARTICIPANTE: ConcreteProduct A2 (GoF)
 * Barra de rolagem estilizada para o visual PM (Presentation Manager).
 */
public class PMScrollBar implements ScrollBar {

    public PMScrollBar() {
        System.out.println("PMScrollBar: Criada barra de rolagem com estilo PM.");
    }

    @Override
    public void scroll() {
        System.out.println("PMScrollBar: Rolando tela no estilo PM.");
    }
}
