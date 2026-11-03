package br.edu.ifba.inf011.estrutural.composite.implementacao1;

/**
 * PARTICIPANTE: Leaf (GoF - Seção Implementação, Item 4)
 * 
 * Representa um objeto-folha na composição.
 * Uma folha não possui filhos e, nesta abordagem focada em segurança,
 * não disponibiliza métodos como add(), remove() ou getChild() em sua interface.
 * 
 * Herda a implementação padrão de getComposite() de Component, que retorna null.
 */
public class Leaf implements Component {

    private final String name;

    public Leaf(String name) {
        this.name = name;
    }

    public Leaf() {
        this("Leaf");
    }

    @Override
    public void operation() {
        System.out.println("Leaf [" + this.name + "]: executando operation()");
    }

    public String getName() {
        return this.name;
    }
}
