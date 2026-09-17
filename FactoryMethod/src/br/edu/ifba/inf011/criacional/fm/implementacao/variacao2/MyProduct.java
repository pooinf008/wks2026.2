package br.edu.ifba.inf011.criacional.fm.implementacao.variacao2;

/**
 * PARTICIPANTE: ConcreteProduct (GoF)
 * Produto do tipo MINE.
 */
public class MyProduct implements Product {

    public MyProduct() {
        System.out.println("MyProduct: Instanciado (Tipo: MINE).");
    }

    @Override
    public void execute() {
        System.out.println("MyProduct: Executando lógica própria do MyProduct.");
    }
}
