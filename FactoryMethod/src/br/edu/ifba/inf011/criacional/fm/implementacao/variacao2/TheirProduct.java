package br.edu.ifba.inf011.criacional.fm.implementacao.variacao2;

/**
 * PARTICIPANTE: ConcreteProduct (GoF)
 * Produto do tipo THEIRS (introduzido pela subclasse MyCreator).
 */
public class TheirProduct implements Product {

    public TheirProduct() {
        System.out.println("TheirProduct: Instanciado (Tipo: THEIRS).");
    }

    @Override
    public void execute() {
        System.out.println("TheirProduct: Executando lógica própria do TheirProduct.");
    }
}
