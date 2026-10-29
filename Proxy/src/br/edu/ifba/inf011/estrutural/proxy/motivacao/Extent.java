package br.edu.ifba.inf011.estrutural.proxy.motivacao;

/**
 * Classe auxiliar: dimensões (largura e altura) de um gráfico.
 */
public record Extent(int width, int height) {

    @Override
    public String toString() {
        return width + "x" + height;
    }
}
