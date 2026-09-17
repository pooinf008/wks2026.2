package br.edu.ifba.inf011.criacional.fm.implementacao.variacao2;

/**
 * PARTICIPANTE: ConcreteCreator (GoF - Extensão de Método Parametrizado)
 *
 * Conforme o livro GoF, sobrescrever um Factory Method parametrizado permite:
 * 1. Adicionar suporte a novos produtos (ex: ProductIdentifier.THEIRS).
 * 2. Substituir um produto existente por outro produto personalizado.
 * 3. Delegar o tratamento dos demais tipos para super.createProduct(id).
 */
public class MyCreator extends Creator {

    @Override
    public Product createProduct(ProductIdentifier id) {
        System.out.println("MyCreator: Sobrescrevendo o Factory Method parametrizado para o ID: " + id);
        if (id == ProductIdentifier.THEIRS)
            return new TheirProduct();
        return super.createProduct(id);
    }
}
