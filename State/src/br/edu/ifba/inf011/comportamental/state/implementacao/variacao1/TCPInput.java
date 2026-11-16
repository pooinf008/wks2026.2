package br.edu.ifba.inf011.comportamental.state.implementacao.variacao1;

/**
 * IMPLEMENTAÇÃO: Uma alternativa baseada no uso de tabelas (GoF)
 * 
 * Representa as possíveis entradas (inputs/eventos) que disparam
 * transições de estado na conexão TCP através da consulta à tabela.
 */
public enum TCPInput {
    ACTIVE_OPEN("Active Open"),
    PASSIVE_OPEN("Passive Open"),
    CLOSE("Close"),
    ACKNOWLEDGE("Acknowledge"),
    SEND("Send");

    private final String descricao;

    TCPInput(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
