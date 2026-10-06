package br.edu.ifba.inf011.criacional.builder.estrutura;

/**
 * PARTICIPANTE: Client (GoF)
 * 
 * O cliente cria o objeto Director e o configura com o objeto Builder desejado.
 * O Director executa a construção notificando o Builder.
 * Em seguida, o Client recupera o produto final diretamente do ConcreteBuilder.
 */
public class Client {

    public void runDemo() {
        System.out.println("=== Padrão GoF: Builder (Estrutura Genérica) ===\n");

        Director director = new Director();

        System.out.println("--- 1. Construção com ConcreteBuilder1 ---");
        ConcreteBuilder1 builder1 = new ConcreteBuilder1();
        director.setBuilder(builder1);
        director.construct();
        Product1 product1 = builder1.getResult();
        System.out.println(product1.show() + "\n");

        System.out.println("--- 2. Construção com ConcreteBuilder2 ---");
        ConcreteBuilder2 builder2 = new ConcreteBuilder2();
        director.setBuilder(builder2);
        director.construct();
        Product2 product2 = builder2.getResult();
        System.out.println(product2.render() + "\n");

        System.out.println("--- 3. Construção Parcial com ConcreteBuilder1 ---");
        director.setBuilder(builder1);
        director.constructPartial();
        Product1 partialProduct = builder1.getResult();
        System.out.println(partialProduct.show() + "\n");
    }

    public static void main(String[] args) {
        new Client().runDemo();
    }
}
