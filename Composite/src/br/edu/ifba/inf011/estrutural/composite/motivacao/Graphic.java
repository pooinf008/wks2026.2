package br.edu.ifba.inf011.estrutural.composite.motivacao;

/**
 * PARTICIPANTE: Component (GoF)
 * Define a interface comum para todos os elementos gráficos (primitivas e recipientes)
 * de uma aplicação como um editor de desenho.
 * 
 * Declara operações de renderização como draw(), além das operações que objetos
 * compostos compartilham para acessar e gerenciar componentes filhos (add, remove, getChild).
 */
public interface Graphic {

    public void draw();
    public default void add(Graphic graphic) {
        throw new UnsupportedOperationException("Operação add não suportada por este componente gráfico primitivo.");
    }
    public default void remove(Graphic graphic) {
        throw new UnsupportedOperationException("Operação remove não suportada por este componente gráfico primitivo.");
    }
    public default Graphic getChild(int index) {
        throw new UnsupportedOperationException("Operação getChild não suportada por este componente gráfico primitivo.");
    }
}
