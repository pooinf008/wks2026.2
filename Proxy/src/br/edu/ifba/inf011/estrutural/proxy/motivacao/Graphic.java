package br.edu.ifba.inf011.estrutural.proxy.motivacao;

/**
 * PARTICIPANTE: Subject (GoF)
 * Define a interface comum para objetos gráficos do editor de documentos,
 * de modo que um ImageProxy possa ser usado onde quer que uma Image seja esperada.
 */
public interface Graphic {
    public void draw();
    public Extent getExtent();
    public void store(String out);
    public void load(String in);
}
