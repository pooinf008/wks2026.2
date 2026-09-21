package br.edu.ifba.inf011.criacional.am.implementacao.variacao3;

/**
 * PARTICIPANTE: ConcreteProduct C1 (GoF)
 */
public class MotifButton implements Button {

    public MotifButton() {
        System.out.println("MotifButton: Criado botão com estilo Motif.");
    }

    @Override
    public void click() {
        System.out.println("MotifButton: Botão clicado no estilo Motif.");
    }
}
