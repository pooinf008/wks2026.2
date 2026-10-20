package br.edu.ifba.inf011.model;

public enum TipoMemoria {
	
	DDR4("DDR4 Standard"),
    DDR5("DDR5 Alta Velocidade"),
    ECC("Error-Correcting Code (Alta Confiabilidade)");

    private final String descricao;

    TipoMemoria(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    
}
