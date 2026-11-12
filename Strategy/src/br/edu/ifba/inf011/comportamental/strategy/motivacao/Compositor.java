package br.edu.ifba.inf011.comportamental.strategy.motivacao;

import java.util.List;

/**
 * PARTICIPANTE: Strategy (GoF - Motivação)
 * 
 * Declara a interface comum para as estratégias de formatação e quebra de linhas.
 */
public interface Compositor {

    /**
     * Quebra e formata o texto de acordo com o algoritmo da estratégia.
     * 
     * @param text o texto a ser formatado
     * @param width a largura máxima da linha
     * @return lista de linhas resultantes
     */
    List<String> compose(String text, int width);


}
