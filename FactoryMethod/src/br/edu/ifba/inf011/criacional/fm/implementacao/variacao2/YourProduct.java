package br.edu.ifba.inf011.criacional.fm.implementacao.variacao2;

/**
 * PARTICIPANTE: ConcreteProduct (GoF)
 * Produto do tipo YOURS.
 */
public class YourProduct implements Product {

    public YourProduct() {
        System.out.println("YourProduct: Instanciado (Tipo: YOURS).");
    }

    @Override
    public void execute() {
        System.out.println("YourProduct: Executando lógica própria do YourProduct.");
    }
}
