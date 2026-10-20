package br.edu.ifba.inf011.model;

public enum TipoStorage {
	
	HDD("Disco Rígido Magnético (Baixo Custo)"),
    SSD("Solid State Drive (Equilibrado)"),
    NVME("NVMe SSD (Alta Performance / IOPS)");

    private final String descricao;

    TipoStorage(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }	

}
