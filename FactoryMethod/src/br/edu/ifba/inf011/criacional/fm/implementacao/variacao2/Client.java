package br.edu.ifba.inf011.criacional.fm.implementacao.variacao2;

/**
 * Executável para teste do Factory Method Parametrizado (GoF - Implementação: Variedade 2).
 */
public class Client {

    public void run() {
        System.out.println("=== Padrão GoF: Factory Method (Implementação - Métodos-Fábrica Parametrizados) ===");

        // 1. Testando o Creator base com os parâmetros MINE e YOURS
        System.out.println("--- 1. Uso do Creator base ---");
        Creator creator = new Creator();
        creator.anOperation(ProductIdentifier.MINE);
        creator.anOperation(ProductIdentifier.YOURS);
        creator.anOperation(ProductIdentifier.THEIRS); // Retorna nulo no Creator base

        // 2. Testando a subclasse MyCreator que estende os parâmetros suportados (adiciona THEIRS)
        System.out.println("\n--- 2. Uso do MyCreator (Subclasse estendida) ---");
        Creator myCreator = new MyCreator();
        myCreator.anOperation(ProductIdentifier.MINE);   // Delegado para super
        myCreator.anOperation(ProductIdentifier.THEIRS); // Tratado diretamente por MyCreator
    }

    public static void main(String[] args) {
        new Client().run();
    }
}
