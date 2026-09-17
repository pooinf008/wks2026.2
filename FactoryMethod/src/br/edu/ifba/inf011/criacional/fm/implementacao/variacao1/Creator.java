package br.edu.ifba.inf011.criacional.fm.implementacao.variacao1;

/**
 * PARTICIPANTE: Creator Concreto (GoF - Implementação: Duas variedades principais - Caso 2)
 *
 * Nesta variedade, a classe Creator NÃO é abstrata. Ela fornece uma implementação padrão (default)
 * do Factory Method. Isso garante flexibilidade, permitindo que a classe base seja instanciada diretamente
 * enquanto possibilita que subclasses sobrescrevam o método caso necessitem de um Produto diferente.
 */
public class Creator {

    /**
     * FACTORY METHOD (Com Implementação Padrão / Default)
     * Fornece um produto padrão (DefaultProduct), mas pode ser sobrescrito por subclasses.
     */
    public Product factoryMethod() {
        System.out.println("Creator: Executando implementação PADRÃO do Factory Method.");
        return new DefaultProduct();
    }

    /**
     * Operação consumidora do produto no Creator.
     */
    public void anOperation() {
        System.out.println("\nCreator: Invocando 'anOperation'...");
        Product product = this.factoryMethod();
        product.execute();
    }
}
