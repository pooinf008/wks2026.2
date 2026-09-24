package br.edu.ifba.inf011.criacional.prototype.motivacao;

/**
 * PARTICIPANTE: Tool (GoF Framework Interface)
 * Interface abstrata do framework de editores gráficos para as ferramentas da paleta.
 */
public interface Tool {

    /**
     * Manipula a ferramenta ao clicar ou arrastar na posição indicada da partitura.
     */
    void manipulate(Position position);
}
