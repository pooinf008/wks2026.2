package br.edu.ifba.inf011.criacional.am.implementacao.variacao3;

/**
 * PARTICIPANTE: ConcreteProduct C2 (GoF)
 */
public class PMButton implements Button {

    public PMButton() {
        System.out.println("PMButton: Criado botão com estilo PM.");
    }

    @Override
    public void click() {
        System.out.println("PMButton: Botão clicado no estilo PM.");
    }
}
