package br.edu.ifba.inf011.estrutural.composite.estrutura;

/**
 * PARTICIPANTE: Component (GoF)
 * Declara a interface para os objetos na composição.
 * Implementa o comportamento padrão para a interface comum a todas as classes,
 * conforme apropriado.
 * Declara uma interface para acessar e gerenciar seus componentes-filhos (add, remove, getChild).
 */
public interface Component {

    public void operation();
    public default void add(Component component) {
        throw new UnsupportedOperationException("Operação add não suportada.");
    }
    public default void remove(Component component) {
        throw new UnsupportedOperationException("Operação remove não suportada.");
    }
    public default Component getChild(int index) {
        throw new UnsupportedOperationException("Operação getChild não suportada.");
    }
}
