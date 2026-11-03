package br.edu.ifba.inf011.estrutural.composite.estrutura;

/**
 * PARTICIPANTE: Leaf (GoF)
 * Representa objetos-folha na composição. Uma folha não tem filhos.
 * Define o comportamento para objetos primitivos na composição,
 * implementando a operação básica operation().
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
