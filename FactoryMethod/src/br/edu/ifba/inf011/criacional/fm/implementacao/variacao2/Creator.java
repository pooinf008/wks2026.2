package br.edu.ifba.inf011.criacional.fm.implementacao.variacao2;

/**
 * PARTICIPANTE: Creator (GoF - Implementação: Métodos-fábrica parametrizados)
 *
 * Implementa o Factory Method parametrizado (createProduct) que aceita um identificador
 * (ProductIdentifier) para decidir qual tipo de produto instanciar.
 */
public class Creator {

    /**
     * FACTORY METHOD PARAMETRIZADO (GoF)
     * Recebe um parâmetro identificador e instancia a classe de produto correspondente.
     */
    public Product createProduct(ProductIdentifier id) {
        System.out.println("Creator: Processando solicitação no Factory Method parametrizado para o ID: " + id);
        if (id == ProductIdentifier.MINE)
            return new MyProduct();
        if (id == ProductIdentifier.YOURS)
            return new YourProduct();
        return null;
    }

    /**
     * Operação que consome o produto especificando o identificador desejado.
     */
    public void anOperation(ProductIdentifier id) {
        System.out.println("\nCreator: Invocando 'anOperation' para o ID [" + id + "]...");
        Product product = this.createProduct(id);
        if (product != null) {
            product.execute();
        } else {
            System.out.println("Creator: Erro — Nenhum produto suportado para o ID informado.");
        }
    }
}
