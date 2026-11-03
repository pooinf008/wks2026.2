package br.edu.ifba.inf011.estrutural.composite.implementacao1;

/**
 * PARTICIPANTE: Client (GoF - Seção Implementação, Item 4)
 * 
 * Demonstra a técnica descrita pelo GoF no item "Declarando as operações de gerenciamento de filhos":
 * 
 * O cliente utiliza o método getComposite() para verificar se uma referência do tipo
 * Component é de fato um Composite. Se o retorno for diferente de null, o cliente
 * pode invocar as operações add() e remove() de forma segura e com verificação de tipo
 * estática, sem recorrer a downcast explícito ou blocos com instanceof.
 */
public class Client {

    public void run() {
        System.out.println("=== Padrão GoF: Composite (Implementação 1 - getComposite) ===\n");

        Component aComposite = new Composite("Composto Principal");
        Component aLeaf = new Leaf("Folha A");

        // 1. Testando quando a referência aponta para um Composite (conforme exemplo do livro GoF)
        System.out.println("-- 1. Testando aComponent quando este referencia um Composite:");
        Component aComponent = aComposite;
        Composite composite = aComponent.getComposite();
        if (composite != null) {
            System.out.println("aComponent.getComposite() != null -> Objeto é um Composite.");
            System.out.println("Invocando test.add() com segurança de tipo...");
            composite.add(new Leaf("Folha Filho 1"));
            composite.add(new Leaf("Folha Filho 2"));
        } else {
            System.out.println("aComponent não é um Composite. Operação add() não permitida.");
        }

        // 2. Testando quando a referência aponta para uma Leaf (conforme exemplo do livro GoF)
        System.out.println("\n-- 2. Testando aComponent quando este referencia uma Leaf:");
        aComponent = aLeaf;
        composite = aComponent.getComposite();
        if (composite != null) {
            System.out.println("aComponent.getComposite() != null -> Invocando test.add()...");
            composite.add(new Leaf("Folha Inválida"));
        } else {
            System.out.println("aComponent.getComposite() retornou null! O objeto é uma Leaf.");
            System.out.println("A chamada indevida a add() foi evitada com segurança e sem casting.");
        }

        // 3. Executando operation() polimorficamente na hierarquia construída
        System.out.println("\n-- 3. Executando operation() na árvore construída:");
        aComposite.operation();
    }

    public static void main(String[] args) {
        new Client().run();
    }
}
