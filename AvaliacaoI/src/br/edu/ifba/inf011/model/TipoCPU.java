package br.edu.ifba.inf011.model;

public enum TipoCPU {

	STANDARD("x86 General Purpose"),
    COMPUTE_OPTIMIZED("Alta Frequência / Otimizado para Computação"),
    MEMORY_OPTIMIZED("Otimizado para Memória"),
    ARM("Arquitetura ARM / Alta Eficiência");

    private final String descricao;

    TipoCPU(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }	
	
	
}
