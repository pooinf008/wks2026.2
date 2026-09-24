package br.edu.ifba.inf011.criacional.prototype.motivacao;

/**
 * PARTICIPANTE: Prototype (GoF)
 * Declara uma interface para clonagem de si mesmo e para operações dos objetos gráficos do editor.
 */
public interface Graphic extends Cloneable {

    /**
     * Operação principal do padrão Prototype: clona a si mesmo.
     */
    Graphic clone();

    /**
     * Desenha / renderiza a representação textual do elemento gráfico.
     */
    String draw();

    /**
     * Define a posição do elemento gráfico.
     */
    void setPosition(Position position);

    /**
     * Obtém a posição atual do elemento gráfico.
     */
    Position getPosition();
}
