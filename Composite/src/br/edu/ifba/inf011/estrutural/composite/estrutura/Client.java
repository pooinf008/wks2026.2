package br.edu.ifba.inf011.estrutural.composite.estrutura;

/**
 * PARTICIPANTE: Client (GoF)
 * Manipula objetos na composição através da interface Component.
 * Trata tanto objetos primitivos (Leaf) quanto composições (Composite)
 * de maneira uniforme.
 */
public class Client {

    public void run() {
        System.out.println("=== Padrão GoF: Composite (Estrutura) ===\n");

        Component leaf1 = new Leaf("Folha 1");
        Component leaf2 = new Leaf("Folha 2");
        Component leaf3 = new Leaf("Folha 3");

        Composite subComposite = new Composite("SubComposto");
        subComposite.add(leaf1);
        subComposite.add(leaf2);

        Composite rootComposite = new Composite("Composto Raiz");
        rootComposite.add(subComposite);
        rootComposite.add(leaf3);

        System.out.println("-- Executando operation() na hierarquia todo-parte:");
        rootComposite.operation();
    }

    public static void main(String[] args) {
        new Client().run();
    }
}
